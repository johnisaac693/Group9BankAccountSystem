/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AccountDetails  extends JFrame {
    
    User user = User.getInstance();
    
    JPanel fieldpanel, mainpanel;
    JLabel lblName, lblAccNo, lblEmail, lblPassword, lblMobileNum, lblCheckBal, lblSaveBal;
    GridBagConstraints c;
    public AccountDetails(){
    //fieldpanel and comps
    
    User user1 = new User();
    
    lblName = new JLabel("Name " +user.getName());
    lblName.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    
    lblAccNo = new JLabel("Account Number: " +user.getAccNum());
    lblAccNo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    
    lblEmail = new JLabel("Email: " +user.getEmail());
    lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    
    lblPassword = new JLabel("Password: " +user.getPassword());
    lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    
    
    lblMobileNum = new JLabel("Mobile Number: " +user.getMobileNum());
    lblMobileNum.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    
    lblCheckBal = new JLabel("Checking Account Balance: " +user.getCheckingBalance());
    lblCheckBal.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    
    lblSaveBal = new JLabel("Savings Account Balance: " +user.getSavingsBalance());
    lblSaveBal.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    
    fieldpanel = new JPanel();
    fieldpanel.setLayout(new GridBagLayout());
    fieldpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    
    c.gridx = 0;
    c.gridy = 0;
    fieldpanel.add(lblName, c);
    
    c.gridx = 0;
    c.gridy = 1;
    fieldpanel.add(lblAccNo, c);
    
    c.gridx = 0;
    c.gridy = 2;
    fieldpanel.add(lblEmail, c);
    
    c.gridx = 0;
    c.gridy = 3;
    fieldpanel.add(lblPassword, c);
    
    c.gridx = 0;
    c.gridy = 4;
    fieldpanel.add(lblMobileNum, c);
    
    c.gridx = 0;
    c.gridy = 5;
    fieldpanel.add(lblCheckBal, c);
    
    c.gridx = 0;
    c.gridy = 6;
    fieldpanel.add(lblSaveBal, c);
    
    //MainPanel and Comps
    mainpanel = new JPanel();
    mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.Y_AXIS));
    
    JLabel lblAccountDeets = new JLabel("ACCOUNT DETAILS");
    lblAccountDeets.setFont(new Font("Segoe UI", Font.BOLD, 25));
    lblAccountDeets.setAlignmentX(Component.CENTER_ALIGNMENT);
    mainpanel.add(lblAccountDeets);
    mainpanel.add(fieldpanel);
    
    //FRAME SETTING
        setContentPane(mainpanel);
        pack();
        setTitle("Account Details");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        centerFrame();
    
    }
    
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }
}
