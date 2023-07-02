/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BankAccountSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends  JFrame{
    
    private JButton btnTransaction, btnTransacHistory, btnAccdetails, btnLogout;
    private JLabel lblMainMenu;

    public MainMenu ()
    {
       
       JLabel lblMainMenu = new JLabel("Banking System Main Menu");
        lblMainMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblMainMenu.setBounds(18, 30, 400, 55);
        lblMainMenu.setHorizontalAlignment(JLabel.CENTER);

        JButton btnTransaction = new JButton("Make Transaction");
        btnTransaction.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnTransaction.setBounds(150, 98, 130, 23);
        btnTransaction.setBackground(Color.WHITE); 

        JButton btnAccdetails = new JButton("Account Details");
        btnAccdetails.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnAccdetails.setBounds(143, 138, 141, 23);
        btnAccdetails.setBackground(Color.WHITE); 

        JButton btnTransacHistory = new JButton("Check Transaction History");
        btnTransacHistory.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnTransacHistory.setBounds(128, 178, 178, 23);
        btnTransacHistory.setBackground(Color.WHITE); 

        JButton btnLogout = new JButton("Log Out");
        btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        btnLogout.setBounds(177, 218, 80, 23);
        btnLogout.setBackground(Color.WHITE); 

        
        
        //panel
        JPanel panel = new JPanel();
        
        
        panel.setBounds(44,0, 412, 300);
        panel.setLayout(null);
        panel.add(lblMainMenu);
        panel.add(btnTransaction);
        panel.add(btnTransacHistory);
        panel.add(btnAccdetails);
        panel.add(btnLogout);
        
        //Window
         
        setTitle("Banking System Main Menu");
        setLocationRelativeTo(null);
        setSize(509, 300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        add(panel);
        
        
   }
    
}
