package BankAccountSystem;
import java.awt.*;
import javax.swing.*;

public class BankAccountLogin {
    JFrame f = new JFrame("Login");
     private JLabel lblPhoneNumber, lblPassword;
     private JTextField phonenum = new JTextField();
     private JPasswordField password = new JPasswordField();
     private JButton btnLogin, btnForgotPassword;

    public BankAccountLogin() {
     f.setSize(400, 300);
     f.setLayout(null);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setVisible(true);
     f.setResizable(false);

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

     btnForgotPassword = new JButton("Forgot Password?");
     btnForgotPassword.setFont(new Font("Segoe UI", Font.PLAIN, 12));
     btnForgotPassword.setBackground(Color.white);
     btnForgotPassword.setBounds(171, 112, 130, 23);

     f.add(lblPhoneNumber);
     f.add(lblPassword);
     f.add(phonenum);
     f.add(password);
     f.add(btnLogin);
     f.add(btnForgotPassword);




    }



}