/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author G-HUBSERVER
 */
public class BankTransferTransaction extends JFrame implements ActionListener{
    User user = User.getInstance();
    
    private JLabel title;
    private JLabel RBankNumLabel;
    private JLabel RNameLabel;
    private JLabel AmountLabel;
    private JLabel PurposeLabel;
    private JLabel NotesLabel;
    private JLabel BankTLabel;
    
    private JTextField RBankNumTxt;
    private JTextField RNameTxt;
    private JTextField AmountTxt;
    private JTextField PurposeTxt;
    private JTextField NotesTxt;
    
    private JButton ConfirmBtn;
    
    private JPanel contentpanel;
    private JPanel mainPanel;
    
    private JFrame f;
   
    GridBagLayout gbl;
    GridBagConstraints gbc;
    
    public BankTransferTransaction()
    {
        f = new JFrame();
        f.setTitle("BANK TRANSFER TRANSCATION");
        
        contentpanel = new JPanel();
        contentpanel.setLayout(new GridBagLayout());
        contentpanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        RBankNumLabel = new JLabel();
        RBankNumLabel.setText("Recipient Bank Number: ");
        RBankNumLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        RBankNumTxt = new JTextField();
        RBankNumTxt.setPreferredSize(new Dimension(300,20));
        
        RNameLabel = new JLabel();
        RNameLabel.setText("Recipient Name: ");
        RNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        RNameTxt = new JTextField();
        RNameTxt.setSize(50,20);
        
        AmountLabel = new JLabel();
        AmountLabel.setText("Amount: ");
        AmountLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        AmountTxt = new JTextField();
        AmountTxt.setSize(50, 20);
        
        PurposeLabel = new JLabel();
        PurposeLabel.setText("Purpose of Transaction: ");
        PurposeLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        PurposeTxt = new JTextField();
        PurposeTxt.setSize(50,20);
        
        NotesLabel = new JLabel();
        NotesLabel.setText("Notes(Optional):");
        NotesLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        NotesTxt = new JTextField();
        NotesTxt.setSize(50,20);
        
        
        
        gbc.gridx=0;
        gbc.gridy=0;
        contentpanel.add(RBankNumLabel, gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        contentpanel.add(RBankNumTxt, gbc); 
        gbc.gridx=0;
        gbc.gridy=1;
        contentpanel.add(RNameLabel, gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        contentpanel.add(RNameTxt, gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        contentpanel.add(AmountLabel, gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        contentpanel.add(AmountTxt, gbc);
        gbc.gridx=0;
        gbc.gridy=3;
        contentpanel.add(PurposeLabel, gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        contentpanel.add(PurposeTxt, gbc);
        gbc.gridx=0;
        gbc.gridy=4;
        contentpanel.add(NotesLabel, gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        contentpanel.add(NotesTxt, gbc);
        
        
        
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Font font = new Font("Times New Roman", Font.BOLD, 18);
        BankTLabel = new JLabel("Bank Transfer");
        BankTLabel.setFont(font);
        BankTLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        ConfirmBtn = new JButton("Confirm");
        ConfirmBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        ConfirmBtn.addActionListener(this);
        mainPanel.add(BankTLabel);
        mainPanel.add(contentpanel);
        mainPanel.add(ConfirmBtn);
        
        
        f.setContentPane(mainPanel);
        f.pack();
        centerFrame();
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - f.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ConfirmBtn) {
            String recipientBankNum = RBankNumTxt.getText();
            String amountTransfer = AmountTxt.getText();
            String recipientName = RNameTxt.getText();
            String purpose = PurposeTxt.getText();
            String notes = NotesTxt.getText();

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
                // Retrieve recipient information based on the provided bank number
                String recipientQuery = "SELECT * FROM customerinfo WHERE customerAccNum = ?";
                PreparedStatement recipientStatement = connection.prepareStatement(recipientQuery);
                recipientStatement.setString(1, recipientBankNum);
                ResultSet recipientResult = recipientStatement.executeQuery();

                if (recipientResult.next()) {
                    String recipientAccNum = recipientResult.getString("customerAccNum");
                    double recipientCheckingBalance = recipientResult.getDouble("checkingBalance");

                    // Perform money transfer
                    double transferAmount = Double.parseDouble(amountTransfer);
                    double userCheckingBalance = user.getCheckingBalance();

                    if (transferAmount <= userCheckingBalance) {
                        // Update sender's (user) checking balance
                        user.subtractChecking((float) transferAmount);

                        // Update recipient's checking balance
                        recipientCheckingBalance += transferAmount;
                        String updateRecipientBalanceQuery = "UPDATE customerinfo SET checkingBalance = ? WHERE customerAccNum = ?";
                        PreparedStatement updateRecipientBalanceStatement = connection.prepareStatement(updateRecipientBalanceQuery);
                        updateRecipientBalanceStatement.setDouble(1, recipientCheckingBalance);
                        updateRecipientBalanceStatement.setString(2, recipientAccNum);
                        updateRecipientBalanceStatement.executeUpdate();

                        showMessageDialog(null, "You have transferred " + transferAmount + " to " + recipientName + " (" + recipientAccNum + ") from your Checking Account!");
                        
                         saveTransferTransaction(new Date(), "Transfer", transferAmount, user.getAccNum(), recipientAccNum);
                    } 
                    
                    else {
                        showMessageDialog(null, "Insufficient balance in your Checking Account!");
                    }
                } 
                
                else {
                    showMessageDialog(null, "Recipient account not found!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
       
   
    
}
    }
    
   private void saveTransferTransaction(Date datetransact, String typetransact, double amounttransact, String senderAccNum, String recipientAccNum) {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
        String query = "INSERT INTO transactions (datetransact, typetransact, amounttransact, accountNumber, recipientAccNum) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDate(1, new java.sql.Date(datetransact.getTime()));
        preparedStatement.setString(2, typetransact);
        preparedStatement.setDouble(3, amounttransact);
        preparedStatement.setString(4, senderAccNum);
        preparedStatement.setString(5, recipientAccNum);
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saving transfer transaction!");
    }
}

}
