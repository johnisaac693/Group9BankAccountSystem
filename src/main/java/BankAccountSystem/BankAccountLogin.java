package BankAccountSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class BankAccountLogin implements ActionListener{
    
   
    JFrame f = new JFrame("Login");
     private JLabel lblPhoneNumber, lblPassword;
     private JTextField phonenum = new JTextField();
     private JPasswordField password = new JPasswordField();
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
            
            
            String mobilenumber = phonenum.getText();
            String passphrase = password.getText();
            
            // Database implementation
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
                String query = "SELECT * FROM customerinfo WHERE customerNum = ? OR customerPass = ?";
                
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, mobilenumber);
            preparedStatement.setString(2, passphrase);

            ResultSet resultSet = preparedStatement.executeQuery();

           if (resultSet.next()) {
                    String accNum = resultSet.getString("customerAccNum");
                    String name = resultSet.getString("customerName");
                    String email = resultSet.getString("customerEmail");
                    String pass = resultSet.getString("customerPass");
                    String address = resultSet.getString("customerAdd");
                    String mobileNum = resultSet.getString("customerNum");
                    double checkingBalance = resultSet.getDouble("checkingBalance");
                    double savingsBalance = resultSet.getDouble("savingsBalance");

                    // Create a new User instance with the retrieved data
                    User user = User.getInstance();
                    user.setAccNumber(accNum);
                    user.setName(name);
                    user.setEmail(email);
                    user.setPassword(pass);
                    user.setAddress(address);
                    user.setMobileNum(mobileNum);
                    user.setCheckingBalance(checkingBalance);
                    user.setSavingsBalance(savingsBalance);

                    showMessageDialog(null, "Login Successful!");
                    f.dispose();
                    new MainMenu();
                } else {
                    showMessageDialog(null, "Incorrect Credentials");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }
        else if (e.getSource()== btnForgotPassword){
            f.dispose();
            new ForgotPassword();
        }
    }
}