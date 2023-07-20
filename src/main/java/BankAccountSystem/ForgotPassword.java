/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class ForgotPassword extends JFrame implements ActionListener {

    
    JPanel fieldpanel, mainPanel;
    JButton btnConfirm;
    JTextField mobilenoField, newPassField;
    GridBagConstraints c;
    
    public ForgotPassword(){
    User user = User.getInstance();
    JLabel lblMobileNumber = new JLabel("Mobile Number: ");
    lblMobileNumber.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
     JLabel lblNewPass = new JLabel("Mobile Number: ");
    lblNewPass.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    mobilenoField = new JTextField(20);
    newPassField = new JTextField(20);
    
   
    
    //panel Setting
    fieldpanel = new JPanel();
    fieldpanel.setLayout(new GridBagLayout());
    fieldpanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    fieldpanel.add(lblMobileNumber,c);
    
    c.gridx = 1;
    c.gridy = 0;
    fieldpanel.add(mobilenoField,c);
    
    c.gridx = 0;
    c.gridy = 1;
    fieldpanel.add(lblNewPass,c);
    
    c.gridx = 1;
    c.gridy = 1;
    fieldpanel.add(newPassField,c);
    
     mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Font font = new Font("Segoe UI", Font.BOLD, 18);
        JLabel lblForgotPass = new JLabel("Forgot Password?");
        lblForgotPass.setFont(font);
        lblForgotPass.setAlignmentX(Component.CENTER_ALIGNMENT);
         btnConfirm = new JButton("Change Password");
         btnConfirm.setFont(new Font("Segoe UI", Font.BOLD, 12));
         btnConfirm.setBackground(Color.white);
         btnConfirm.addActionListener(this);
        mainPanel.add(lblForgotPass);
        mainPanel.add(fieldpanel);
        mainPanel.add(btnConfirm);
        
       setContentPane(mainPanel);
        pack();
        centerFrame();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //INSERT CODE HERE
    }
    
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }
    
}
