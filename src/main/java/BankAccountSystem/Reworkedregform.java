/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reworkedregform extends JFrame implements ActionListener {

    private JButton RegisterB;
    private JCheckBox jCheckBox1;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JScrollPane scrollPane;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField16;
    private JTextField jTextField17;
    
    
    private String Pref[] = {"Ms", "Mrs", "Mr"};
    private String MStatus[] = {"Married", "Widowed", "Single", "Separated", "Divorced"};

    public Reworkedregform() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(600,600);
        setLocationRelativeTo(null);

        JPanel con = new JPanel();
        con.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        jLabel1 = new JLabel();
        jLabel1.setText("BANK ACCOUNT REGISTRATION FORM");
        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel1, gbc);


        jLabel3 = new JLabel();
        jLabel3.setText("Name");
        jLabel3.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel3, gbc);

        jComboBox2 = new JComboBox<>(Pref);
        jComboBox2.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 10; // Adjust the value to change the width
        con.add(jComboBox2, gbc);

        jTextField1 = new JTextField();
        jTextField1.setText("(First Name)");
        jTextField1.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 100; // Adjust the value to change the width
        con.add(jTextField1, gbc);

        jTextField2 = new JTextField();
        jTextField2.setText("(Initials)");
        jTextField2.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 50; // Adjust the value to change the width
        con.add(jTextField2, gbc);
        
        jTextField3 = new JTextField();
        jTextField3.setText("(Middle Name)");
        jTextField3.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 50;
        con.add(jTextField3,gbc);
        
        jTextField4 = new JTextField();
        jTextField4.setText("(Last Name)");
        jTextField4.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField4,gbc);
        
        jLabel4 = new JLabel();
        jLabel4.setText("Telephone");
        jLabel4.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel4,gbc);
        
        jLabel5 = new JLabel();
        jLabel5.setText("E-mail Address");
        jLabel5.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel5,gbc);
        
        jTextField5 = new JTextField();
        jTextField5.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField5,gbc);
       
        jTextField6 = new JTextField();
        jTextField6.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField6,gbc);
        
        jLabel6 = new JLabel();
        jLabel6.setText("Mailing Home Address");
        jLabel6.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel6,gbc);
        
        jTextField7 = new JTextField();
        jTextField7.setText("(Street Address)");
        jTextField7.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.ipadx = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField7,gbc);
                
        jTextField8 = new JTextField();
        jTextField8.setText("(City)");
        jTextField8.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField8,gbc);
        
        jTextField9 = new JTextField();
        jTextField9.setText("(State)");
        jTextField9.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField9,gbc);
        
        jTextField10 = new JTextField();
        jTextField10.setText("(Postal/Zip Code)");
        jTextField10.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField10,gbc);
        
        jTextField11 = new JTextField();
        jTextField11.setText("(Country)");
        jTextField11.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField11,gbc);
        
        jLabel7 = new JLabel();
        jLabel7.setText("Date of Birth");
        jLabel7.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel7,gbc);
        
        jLabel8 = new JLabel();
        jLabel8.setText("Marital Status");
        jLabel8.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel8,gbc);
        
        jTextField12 = new JTextField();
        jTextField12.setText("(E.g. 02-14-2001)");
        jTextField12.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField12,gbc);
        
        jComboBox3 = new JComboBox(MStatus);
        jComboBox3.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jComboBox3,gbc);
        
        jLabel9 = new JLabel();
        jLabel9.setText("Language");
        jLabel9.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 14;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel9,gbc);
        
        jLabel10 = new JLabel();
        jLabel10.setText("Occupation");
        jLabel10.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 14;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel10,gbc);
        
        jTextField13 = new JTextField();
        jTextField13.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField13,gbc);
        
        jTextField14 = new JTextField();
        jTextField14.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 15;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField14,gbc);
        
        jLabel10 = new JLabel();
        jLabel10.setText("Employer");
        jLabel10.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 16;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel10,gbc);
        
        jLabel11 = new JLabel();
        jLabel11.setText("Monthly Income");
        jLabel11.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 18;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel11,gbc);
        
        jTextField15 = new JTextField();
        jTextField15.setText("(Name of company you are working at.)");
        jTextField15.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 17;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField15,gbc);
        
        jTextField16 = new JTextField();
        jTextField16.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 19;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField16,gbc);
        
        jLabel12 = new JLabel();
        jLabel12.setText("(Optional)");
        jLabel12.setFont(new Font("Arial", Font.PLAIN, 11));
        gbc.gridx = 2;
        gbc.gridy = 17;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel12,gbc);
        
        jLabel13 = new JLabel();
        jLabel13.setText("(Optional)");
        jLabel13.setFont(new Font("Arial", Font.PLAIN, 11));
        gbc.gridx = 1;
        gbc.gridy = 19;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel13,gbc);
        
        jLabel14 = new JLabel();
        jLabel14.setText("Nationality");
        jLabel14.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 20;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jLabel14,gbc);
        
        jTextField17 = new JTextField();
        jTextField17.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 21;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jTextField17,gbc);
        
        jCheckBox1 = new JCheckBox();
        jCheckBox1.setText("I agree to the terms of service and conditions.");
        jCheckBox1.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 22;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(jCheckBox1,gbc);
        
        
        
        RegisterB = new JButton();
        RegisterB.setText("Register The Account");
        RegisterB.setFont(new Font("Arial", Font.PLAIN, 15));
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        con.add(RegisterB, gbc);

        JScrollPane scrollPane = new JScrollPane(con);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        getContentPane().add(scrollPane);

        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}