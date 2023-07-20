/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;

public class Reworkedregform implements ActionListener{

    JFrame frame;
    JPanel phonePanel, fieldPanel, mainPanel;
    JLabel lblname, lblemail, lblpassword, lbladdress, lblmobile, lblregister;
    JTextField nameField, emailField, passwordField, addressField, mobileField, countryCode;
    JButton btnRegister;
    GridBagConstraints c;

    public Reworkedregform()
    {
        frame = new JFrame("Bank Account Registration Process");

        //phonePanel and its components
        phonePanel = new JPanel();
        phonePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        mobileField = new JTextField(8);
        countryCode = new JTextField(2);
        countryCode.setText("+91");
        countryCode.setEnabled(false);
        phonePanel.add(countryCode);
        phonePanel.add(mobileField);

        //fieldPanel and its components
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridBagLayout());
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        lblname = new JLabel("Name: ");
        lblemail = new JLabel("Email ID: ");
        lblpassword = new JLabel("Password: ");
        lbladdress = new JLabel("Address: ");
        lblmobile = new JLabel("Mobile Number: ");
        nameField = new JTextField(15);
        emailField = new JTextField(15);
        passwordField = new JTextField(15);
        addressField = new JTextField(20);
        c.gridx=0;
        c.gridy=0;
        fieldPanel.add(lblname, c);
        c.gridx=1;
        c.gridy=0;
        fieldPanel.add(nameField, c); 
        c.gridx=0;
        c.gridy=1;
        fieldPanel.add(lblemail, c);
        c.gridx=1;
        c.gridy=1;
        fieldPanel.add(emailField, c);
        c.gridx=0;
        c.gridy=2;
        fieldPanel.add(lblpassword, c);
        c.gridx=1;
        c.gridy=2;
        fieldPanel.add(passwordField, c);
        c.gridx=0;
        c.gridy=3;
        fieldPanel.add(lbladdress, c);
        c.gridx=1;
        c.gridy=3;
        fieldPanel.add(addressField, c);
        c.gridx=0;
        c.gridy=4;
        fieldPanel.add(lblmobile, c);
        c.gridx=1;
        c.gridy=4;
        fieldPanel.add(phonePanel, c);

        //mainPanel and its components
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        lblregister = new JLabel("Register your Bank Account!");
        lblregister.setFont(font);
        lblregister.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnRegister = new JButton("Create Account");
        btnRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnRegister.addActionListener(this);
        mainPanel.add(lblregister);
        mainPanel.add(fieldPanel);
        mainPanel.add(btnRegister);

        //final frame settings
        frame.setContentPane(mainPanel);
        frame.pack();
        centerFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            User user = User.getInstance();
            String name = nameField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();
            String address = addressField.getText();
            String mobilenumber = mobileField.getText();

            int namelen = name.length();
            int emaillen = email.length();
            int passlen = password.length();
            int addlen = address.length();
            int numlen = mobilenumber.length();

            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);
            user.setAddress(address);
            user.setMobileNum(mobilenumber);

            if (namelen == 0 || emaillen == 0 || passlen == 0 || addlen == 0 || numlen == 0) {
                JOptionPane.showMessageDialog(null, "Please fill out ALL the fields!");
            } else {
                JOptionPane.showMessageDialog(null, "Welcome, " + user.getName() + " to our bank!");
                frame.dispose();
                new BankAccountLogin();

                // Database connection and insertion
                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
                   

                    String query = "INSERT INTO customerinfo (customerName, customerEmail, customerPass, customerAdd, customerNum) VALUES (?,?,?,?,?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);

                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, password);
                    preparedStatement.setString(4, address);
                    preparedStatement.setString(5, mobilenumber);

                    preparedStatement.executeUpdate();
             

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}