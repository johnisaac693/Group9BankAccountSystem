package BankAccountSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class BankAccountLogin implements ActionListener{
    
   
    JFrame f = new JFrame("Login");
     private JLabel lblPhoneNumber, lblPassword;
     private JTextField phonenum = new JTextField();
     private JTextField password = new JTextField();
     private JButton btnLogin, btnForgotPassword;

    public BankAccountLogin() {
     f.setSize(400, 300);
     f.setLayout(null);
     f.setVisible(true);
     f.setResizable(false);
     f.setLocationRelativeTo(null);

     lblPhoneNumber = new JLabel("Phone Number:");
     lblPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 12));
     lblPhoneNumber.setBounds(50, 63, 84, 19);

     lblPassword = new JLabel("Password:");
     lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 12));
     lblPassword.setBounds(50, 85, 53, 19);

     phonenum.setBounds(136,59 , 150, 22);
     phonenum.setFont(new Font("Segoe UI", Font.PLAIN, 12));

     password.setBounds(105, 82, 181, 22);

     btnLogin = new JButton("Login");
     btnLogin.setFont(new Font("Segoe UI", Font.PLAIN, 12));
     btnLogin.setBackground(Color.white);
     btnLogin.setBounds(82, 112, 72, 23);
     btnLogin.addActionListener(this);

     btnForgotPassword = new JButton("Forgot Password?");
     btnForgotPassword.setFont(new Font("Segoe UI", Font.PLAIN, 12));
     btnForgotPassword.setBackground(Color.white);
     btnForgotPassword.setBounds(171, 112, 130, 23);
     btnForgotPassword.addActionListener(this);

     f.add(lblPhoneNumber);
     f.add(lblPassword);
     f.add(phonenum);
     f.add(password);
     f.add(btnLogin);
     f.add(btnForgotPassword);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            User user = User.getInstance();
            
            String mobilenumber = phonenum.getText();
            String passphrase = password.getText();
            
            if (user.comparelogin(mobilenumber, passphrase)== true) {
                showMessageDialog(null, "Login Successful!");
                f.dispose();
                new MainMenu();
            }
            else
             showMessageDialog(null, "Your number or password is incorrect!");
            
        }
        
        else if (e.getSource() == btnLogin) {
            new ForgotPassword();
        }
    }
}