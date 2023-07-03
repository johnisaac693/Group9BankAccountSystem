/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TransactionMenu {
    JFrame f = new JFrame("Transaction Menu");
    JPanel fieldpanel, mainPanel;
    JButton btnWithdraw, btnDeposit, btnBankTrans;
    GridBagConstraints c;
    public TransactionMenu()
    {
        
        //fieldpanel and its components//////////////////
        
        
        btnWithdraw = new JButton("Withdraw");
        btnWithdraw.setBackground(Color.white);
        btnWithdraw.setFont(new Font("Segoe UI", Font.BOLD, 12));
        
        btnDeposit = new JButton("Deposit");
        btnDeposit.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btnDeposit.setBackground(Color.white);
        
        btnBankTrans = new JButton("Bank Transfer");
        btnBankTrans.setBackground(Color.white);
        btnBankTrans.setFont(new Font("Segoe UI", Font.BOLD, 12));
        
        
        
        fieldpanel = new JPanel();
        fieldpanel.setLayout(new GridBagLayout());
        fieldpanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        
        //Setting component positioning
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,0,0,0);
        fieldpanel.add(btnWithdraw, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10,0,0,0);
        fieldpanel.add(btnDeposit, c);
        
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(10,0,0,0);
        fieldpanel.add(btnBankTrans, c);
        
        
        //mainpanel and components
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Font font = new Font("Segoe UI", Font.BOLD, 25) ;
        JLabel lblTransacMenu = new JLabel("Choose Which Transaction to Make");
        lblTransacMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(lblTransacMenu);
        mainPanel.add(fieldpanel);
        
        //FRAME SETTING
        f.setContentPane(mainPanel);
        f.pack();
        centerFrame();
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - f.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
    }
    
    
}
