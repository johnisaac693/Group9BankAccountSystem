
package BankAccountSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import static javax.swing.JOptionPane.showMessageDialog;

public class Deposit implements ActionListener{
    
    User user = User.getInstance();
    //Component Declaration
    JFrame f = new JFrame("Deposit");
    JPanel pnlSaving, pnlChecking, pnlMainPanel;
    GridBagConstraints c;
    JButton btnConfirmChecking, btnConfirmSavings;
    JTextField txtChecking, txtSaving;
    JTabbedPane DepositPane;
    
    public Deposit(){
    
    
    //Savings Panel Component Initialization/////////////////////////
    User user = User.getInstance();
    
    JLabel lblBalanceTell = new JLabel("Your Balance Is:");
    lblBalanceTell.setAlignmentX(Component.RIGHT_ALIGNMENT);
    lblBalanceTell.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    JLabel lblBalanceGetSavings = new JLabel(+user.getSavingsBalance()+" php");
    lblBalanceGetSavings.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    JLabel lblEnterPrompt = new JLabel("Enter your amount here: ");
    lblEnterPrompt.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    btnConfirmSavings = new JButton("Confirm Deposit");
    btnConfirmSavings.setFont(new Font("Segoe UI", Font.BOLD, 12));
    btnConfirmSavings.setBackground(Color.white);
    btnConfirmSavings.addActionListener(this);
    
    txtSaving = new JTextField(20);
    //Savings Panel Panel Setting
    pnlSaving = new JPanel();
    pnlSaving.setLayout(new GridBagLayout());
    pnlSaving.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 5;
    c.gridy = 0;
    pnlSaving.add(lblBalanceTell, c);
    
    c.gridx = 6;
    c.gridy = 0;
    pnlSaving.add(lblBalanceGetSavings, c);
    
    c.gridx = 5;
    c.gridy = 2;
    pnlSaving.add(lblEnterPrompt, c);
    
    c.gridx = 6;
    c.gridy = 2;
    pnlSaving.add(txtSaving, c);
    
    c.gridx = 6;
    c.gridy = 3;
    pnlSaving.add(btnConfirmSavings,c);
    
    //Checking Panel Component Declaration
     JLabel lblBalanceTellCheck = new JLabel("Your Balance Is:");
    lblBalanceTellCheck.setFont(new Font("Segoe UI", Font.BOLD, 12));
 
    
    JLabel lblBalanceGetChecking = new JLabel(+user.getCheckingBalance()+" php");
    lblBalanceGetChecking.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    JLabel lblEnterPromptChecking = new JLabel("Enter your amount here: ");
    lblEnterPromptChecking.setFont(new Font("Segoe UI", Font.BOLD, 12));
     
    btnConfirmChecking = new JButton("Confirm Deposit");
    btnConfirmChecking.setFont(new Font("Segoe UI", Font.BOLD, 12));
    btnConfirmChecking.setBackground(Color.white);
    btnConfirmChecking.addActionListener(this);
    
    txtChecking = new JTextField(20);
    //Checking Panel Panel Setting
    pnlChecking = new JPanel();
    pnlChecking.setLayout(new GridBagLayout());
    pnlChecking.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 5;
    c.gridy = 0;
    pnlChecking.add(lblBalanceTellCheck, c);
    
    c.gridx = 6;
    c.gridy = 0;
    pnlChecking.add(lblBalanceGetChecking, c);
    
    c.gridx = 5;
    c.gridy = 2;
    pnlChecking.add(lblEnterPromptChecking, c);
    
    c.gridx = 6;
    c.gridy = 2;
    pnlChecking.add(txtChecking, c);
    
    c.gridx = 6;
    c.gridy = 3;
    pnlChecking.add(btnConfirmChecking,c);
    
    
    //JTabPane Setting
    DepositPane = new JTabbedPane();
    DepositPane.add("Savings Account",pnlSaving);
    DepositPane.add("Checkings Account", pnlChecking);
    //MainPanel Setting
    
    pnlMainPanel = new JPanel();
    pnlMainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    pnlMainPanel.setLayout(new BoxLayout(pnlMainPanel, BoxLayout.Y_AXIS));
    JLabel lblWithdrawTitle = new JLabel("Withdraw");
    lblWithdrawTitle.setFont(new Font("Segoe UI", Font.BOLD, 25));
    lblWithdrawTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    pnlMainPanel.add(DepositPane);
    
    //Frame Setting
    f.setContentPane(pnlMainPanel);
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
        if (e.getSource() == btnConfirmSavings) 
        {
            String savingdeposit = txtSaving.getText();
            float savingadd = Float.parseFloat(savingdeposit);
            user.addSavings(savingadd);
            showMessageDialog(null, "You have deposited " + savingadd + " to your Savings Account!");
        
             // Save the deposit transaction to the database for savings account
            saveTransaction(new Date(), "Deposit", savingadd);
            
            // Update the savings balance in the database
            updateSavingsBalance(user.getSavingsBalance());
        }  

        
        if (e.getSource() == btnConfirmChecking)
        {
            String checkingdeposit = txtChecking.getText();
            float checkingadd = Float.parseFloat(checkingdeposit);
            user.addChecking(checkingadd);
            showMessageDialog(null, "You have deposited "+ checkingadd + " to your Checking Account!");
            
             // Save the deposit transaction to the database for checkings account
            saveTransaction(new Date(), "Deposit", checkingadd);
            
             // Update the checking balance in the database
             updateCheckingBalance(user.getCheckingBalance());
           
        }
     
     
}
    
    
    
    
    private void saveTransaction(Date datetransact, String typetransact, double amounttransact) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
        String query = "INSERT INTO transactions (accountNumber, datetransact, typetransact, amounttransact) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getAccNum());
        preparedStatement.setTimestamp(2, new Timestamp(datetransact.getTime()));
        preparedStatement.setString(3, typetransact);
        preparedStatement.setDouble(4, amounttransact);
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saving transaction!");
    }
    }
   
    private void updateSavingsBalance(double newBalance) {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
        String query = "UPDATE customerinfo SET savingsBalance = ? WHERE customerAccNum = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDouble(1, newBalance);
        preparedStatement.setString(2, user.getAccNum());
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating savings balance!");
    }
    }
    
    private void updateCheckingBalance(double newBalance) {
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12"))  {
        String query = "UPDATE customerinfo SET checkingBalance = ? WHERE customerAccNum = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDouble(1, newBalance);
        preparedStatement.setString(2, user.getAccNum());
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating checking balance!");
    }
}
}

