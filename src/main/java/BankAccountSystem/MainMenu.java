/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BankAccountSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener {

    private JButton btnTransaction, btnTransacHistory, btnAccdetails, btnLogout;
    
    JPanel fieldpanel, mainPanel;
    GridBagConstraints c;

    public MainMenu() {

        btnTransaction = new JButton("Make Transaction");
        btnTransaction.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnTransaction.setBackground(Color.WHITE);
        btnTransaction.addActionListener(this);

        btnAccdetails = new JButton("Account Details");
        btnAccdetails.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnAccdetails.setBackground(Color.WHITE);
        btnAccdetails.addActionListener(this);

        btnTransacHistory = new JButton("Check Transaction History");
        btnTransacHistory.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnTransacHistory.setBackground(Color.WHITE);
        btnTransacHistory.addActionListener(this);

        btnLogout = new JButton("Log Out");
        btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnLogout.setBackground(Color.WHITE);
         //Field Panel Setting
         fieldpanel = new JPanel();
         fieldpanel.setLayout(new GridBagLayout());
         fieldpanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        //Setting Component Positioning
        
         c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,0,0,0);
        fieldpanel.add(btnTransaction, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10,0,0,0);
        fieldpanel.add(btnTransacHistory, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(10,0,0,0);
        fieldpanel.add(btnAccdetails, c);
        
        c.gridx = 0;
        c.gridy = 6;
        c.insets = new Insets(10,0,0,0);
        fieldpanel.add(btnLogout, c);
        
        
        //MainPanel Setting
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,50,15,50));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JLabel lblMainMenu = new JLabel("MAIN MENU");
        lblMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 25));
        lblMainMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblMainMenu);
        mainPanel.add(fieldpanel);

        // Window
        setContentPane(mainPanel);
        pack();
        centerFrame();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centerFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTransaction) {
            dispose();
            new TransactionMenu();
        }
        else if(e.getSource() == btnAccdetails) {
            new AccountDetails();
        }
        else if(e.getSource() == btnTransacHistory) {
            new TransactionHistoryTrial2();
        }
        
  
    }
    
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }
    
    
    
}
