/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;
import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class RegistrationTrial1 extends JFrame {
    
    private JButton jButton1;
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
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField16;
    private JTextField jTextField17;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    
    private String AccType [] = { "Savings Account", "Checking Account", "Retirement Account", "Brokerage Account"};
    
    private String Pref [] = { "Ms", "Mrs", "Mr"};
    
    private String MStatus [] = {"Married", "Widowed", "Single", "Separated", "Divorced"};
    
    public RegistrationTrial1() {
                
		setTitle("Registration Form");
                
                setBounds(0,0,640,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
                setLocationRelativeTo(null);
		           
		
		JPanel con = new JPanel();
                
                con.setLayout(null);
                
                con.setPreferredSize(new Dimension(600,1000));
                
                JScrollPane scrollPane = new JScrollPane(con);
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                
                scrollPane.setPreferredSize(new Dimension(640,400));
                
                getContentPane().add(scrollPane);
          
                
                
                jLabel1 = new JLabel();
                jLabel1.setText("BANK ACCOUNT REGISTRATION FORM");
                jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                 jLabel1.setHorizontalAlignment(JLabel.CENTER);
                 jLabel1.setVerticalAlignment(JLabel.CENTER);
                 jLabel1.setMinimumSize(new Dimension(447, 32));
                 jLabel1.setMaximumSize(new Dimension(447, 32));
                // jLabel1.setSize(447,32);
                jLabel1.setBounds(90,10,460,60);
                con.add(jLabel1);
                
                jLabel2 = new JLabel();
                jLabel2.setText("Please specify the type of account you want to open.");
                jLabel2.setFont(new Font("Arial", Font.PLAIN, 13));
                jLabel2.setMaximumSize(new Dimension(334, 20));
                jLabel2.setMinimumSize(new Dimension(334, 20));
                //jLabel2.setSize(447,32);
                jLabel2.setBounds(20, 80, 330, 20);
                con.add(jLabel2);
                
                jComboBox1 = new JComboBox(AccType);
                jComboBox1.setFont(new Font("Arial", Font.PLAIN,13));
                jComboBox1.setMaximumSize(new Dimension(32767, 32767));
                jComboBox1.setMinimumSize(new Dimension(72, 22));
                jComboBox1.setBounds(40, 110, 200, 20);
                con.add(jComboBox1);
                
                jLabel3 = new JLabel();
                jLabel3.setText("Name");
                jLabel3.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel3.setHorizontalAlignment(JLabel.CENTER);
                jLabel3.setVerticalAlignment(JLabel.CENTER); 
                jLabel3.setMaximumSize(new Dimension(32, 16));
                jLabel3.setMinimumSize(new Dimension(32, 16));
                jLabel3.setBounds(20,146,40,20);
                con.add(jLabel3);
               
                jComboBox2 = new JComboBox(Pref);
                jComboBox2.setFont(new Font("Arial", Font.PLAIN,13));
                jComboBox2.setMaximumSize(new Dimension(32767, 32767));
                jComboBox2.setMinimumSize(new Dimension(72, 22));
                jComboBox2.setBounds(40, 170, 70, 20);
                con.add(jComboBox2);
                
                jTextField1 = new JTextField();
                jTextField1.setText("(First Name)");
                jTextField1.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField1.setBounds(140, 170, 230, 20);
                con.add(jTextField1);
                
                jTextField2 = new JTextField();
                jTextField2.setText("(Initials)");
                jTextField2.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField2.setBounds(400, 170, 80, 20);
                con.add(jTextField2);
                
                jTextField3 = new JTextField();
                jTextField3.setText("(Middle Name)");
                jTextField3.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField3.setBounds(40, 210, 210, 20);
                con.add(jTextField3);
           
                jTextField4 = new JTextField();
                jTextField4.setText("(Last Name)");
                jTextField4.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField4.setBounds(270, 210, 210, 20);
                con.add(jTextField4);
                
                jLabel4 = new JLabel();
                jLabel4.setText("Telephone");
                jLabel4.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel4.setBounds(20,260,60,20);
                con.add(jLabel4);
               
                jLabel5 = new JLabel();
                jLabel5.setText("E-mail Address");
                jLabel5.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel5.setBounds(260,260,90,20);
                con.add(jLabel5);
               
                jTextField5 = new JTextField();
                jTextField5.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField5.setBounds(40,280,210,20);
                con.add(jTextField5);
               
                jTextField6 = new JTextField();
                jTextField6.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField6.setBounds(270,280,210,20);
                con.add(jTextField6);
                
                jLabel6 = new JLabel();
                jLabel6.setText("Mailing Home Address");
                jLabel6.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel6.setBounds(20,320,130,20);
                con.add(jLabel6);
                
                jTextField7 = new JTextField();
                jTextField7.setText("(Street Address)");
                jTextField7.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField7.setBounds(40,340,440,20);
                con.add(jTextField7);
                
                jTextField8 = new JTextField();
                jTextField8.setText("(City)");
                jTextField8.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField8.setBounds(40,370,210,20);
                con.add(jTextField8);
                
                jTextField9 = new JTextField();
                jTextField9.setText("(State)");
                jTextField9.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField9.setBounds(270,370,210,20);
                con.add(jTextField9);
                
                jTextField10 = new JTextField();
                jTextField10.setText("(Postal/Zip Code)");
                jTextField10.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField10.setBounds(40,400,210,20);
                con.add(jTextField10);
                
                jTextField11 = new JTextField();
                jTextField11.setText("(Country)");
                jTextField11.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField11.setBounds(270,400,210,20);
                con.add(jTextField11);
                
                jLabel7 = new JLabel();
                jLabel7.setText("Date of Birth");
                jLabel7.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel7.setBounds(20,450,80,20);
                con.add(jLabel7);
                
                jLabel8 = new JLabel();
                jLabel8.setText("Marital Status");
                jLabel8.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel8.setBounds(260,450,80,20);
                con.add(jLabel8);
                
                jTextField12 = new JTextField();
                jTextField12.setText("(Under Construction...)");
                jTextField12.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField12.setBounds(40,470,210,20);
                con.add(jTextField12);
                
                jComboBox3 = new JComboBox(MStatus);
                jComboBox3.setFont(new Font("Arial", Font.PLAIN,13));
                jComboBox3.setBounds(270, 470, 210, 20);
                con.add(jComboBox3);
                
                jLabel9 = new JLabel();
                jLabel9.setText("Language");
                jLabel9.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel9.setBounds(20,510,60,20);
                con.add(jLabel9);
                
                jLabel10 = new JLabel();
                jLabel10.setText("Occupation");
                jLabel10.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel10.setBounds(260,510,70,20);
                con.add(jLabel10);
                
                jTextField13 = new JTextField();
                jTextField13.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField13.setBounds(40,530,210,20);
                con.add(jTextField13);
                
                jTextField14 = new JTextField();
                jTextField14.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField14.setBounds(270,530,210,20);
                con.add(jTextField14);
                
                jLabel10 = new JLabel();
                jLabel10.setText("Employer");
                jLabel10.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel10.setBounds(20,570,60,20);
                con.add(jLabel10);
                
                jLabel11 = new JLabel();
                jLabel11.setText("Monthly Income");
                jLabel11.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel11.setBounds(270,570,90,20);
                con.add(jLabel11);
                
                jTextField15 = new JTextField();
                jTextField15.setText("(Name of company you are working at.)");
                jTextField15.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField15.setBounds(40,590,220,20);
                con.add(jTextField15);
                
                jTextField16 = new JTextField();
                jTextField16.setFont(new Font("Arial", Font.PLAIN, 13));
                jTextField16.setBounds(270,590,210,20);
                con.add(jTextField16);
                
                jLabel12 = new JLabel();
                jLabel12.setText("(Optional)");
                jLabel12.setFont(new Font("Arial", Font.PLAIN, 11));
                jLabel12.setBounds(40,610,70,20);
                con.add(jLabel12);
                
                jLabel13 = new JLabel();
                jLabel13.setText("(Optional)");
                jLabel13.setFont(new Font("Arial", Font.PLAIN, 11));
                jLabel13.setBounds(270,610,70,20);
                con.add(jLabel13);
                
                jLabel14 = new JLabel();
                jLabel14.setText("Nationality");
                jLabel14.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel14.setBounds(20,650,70,20);
                con.add(jLabel14);
                
                jTextField17 = new JTextField();
                jTextField17.setFont(new Font("Arial", Font.PLAIN,13));
                jTextField17.setBounds(40,670,440,20);
                con.add(jTextField17);
                
                jLabel15 = new JLabel();
                jLabel15.setText("(Optional)");
                jLabel15.setFont(new Font("Arial", Font.PLAIN, 11));
                jLabel15.setBounds(40,690,70,20);
                con.add(jLabel15);
                
                jLabel16 = new JLabel();
                jLabel16.setText("Signature");
                jLabel16.setFont(new Font("Arial", Font.PLAIN, 12));
                jLabel16.setBounds(20,730,60,20);
                con.add(jLabel16);
               
                jTextArea1 = new JTextArea();
                jTextArea1.setBounds(40,750,10,20);
                jTextArea1.setSize(200,100);
                jTextArea1.setLayout(null);
                con.add(jTextArea1);
                
                jCheckBox1 = new JCheckBox();
                jCheckBox1.setText("I agree to the terms of service and conditions.");
                jCheckBox1.setFont(new Font("Arial", Font.PLAIN, 12));
                jCheckBox1.setBounds(20, 870, 270, 20);
                con.add(jCheckBox1);
                
                jButton1 = new JButton();
                jButton1.setText("Register The Account");
                jButton1.setFont(new Font("Arial", Font.PLAIN, 15));
                jButton1.setBounds(220, 930, 210, 40);
//                jButton1.addActionLister();
                con.add(jButton1);
                
                
           
//                add(con);
                setVisible(true);
                
                
    
    }
}