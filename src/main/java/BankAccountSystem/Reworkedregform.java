package com.mycompany.reworkedregform;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reworkedregform extends JFrame implements ActionListener {

    private JButton RegisterB;
    
    private JCheckBox TermsCB;
    private JComboBox PrefixLbl;
    private JComboBox MStatusCB;
    
    private JLabel TitleLbl;
    private JLabel NameLbl;
    private JLabel TelnoLbl;
    private JLabel EmailLbl;
    private JLabel HomeAddLbl;
    private JLabel BirthLbl;
    private JLabel MStatusLbl;
    private JLabel LanguageLbl;
    private JLabel OccupLbl;
    private JLabel IncomeLbl;
    private JLabel EmpOptionalLbl;
    private JLabel IncOptionalLbl;
    private JLabel NationalityLbl;
    private JLabel EmployerLbl;
    
    private JTextField FnameTxt;
    private JTextField InitialsTxt;
    private JTextField MnameTxt;
    private JTextField LnameTxt;
    private JTextField TelnoTxt;
    private JTextField EmailTxt;
    private JTextField StreetTxt;
    private JTextField CityTxt;
    private JTextField StateTxt;
    private JTextField PostalTxt;
    private JTextField CountryTxt;
    private JTextField BirthTxt;
    private JTextField LanguageTxt;
    private JTextField OccupTxt;
    private JTextField EmployerTxt;
    private JTextField IncomeTxt;
    private JTextField NationalityTxt;
    
    
    private JScrollPane scrollPane;
      
   
    
    
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

        TitleLbl = new JLabel();
        TitleLbl.setText("BANK ACCOUNT REGISTRATION FORM");
        TitleLbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(TitleLbl, gbc);


        NameLbl = new JLabel();
        NameLbl.setText("Name");
        NameLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(NameLbl, gbc);

        PrefixLbl = new JComboBox<>(Pref);
        PrefixLbl.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 10; // Adjust the value to change the width
        con.add(PrefixLbl, gbc);

        FnameTxt = new JTextField();
        FnameTxt.setText("(First Name)");
        FnameTxt.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 100; // Adjust the value to change the width
        con.add(FnameTxt, gbc);

        InitialsTxt = new JTextField();
        InitialsTxt.setText("(Initials)");
        InitialsTxt.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 50; // Adjust the value to change the width
        con.add(InitialsTxt, gbc);
        
        MnameTxt = new JTextField();
        MnameTxt.setText("(Middle Name)");
        MnameTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 50;
        con.add(MnameTxt,gbc);
        
        LnameTxt = new JTextField();
        LnameTxt.setText("(Last Name)");
        LnameTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(LnameTxt,gbc);
        
        TelnoLbl = new JLabel();
        TelnoLbl.setText("Telephone");
        TelnoLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(TelnoLbl,gbc);
        
        EmailLbl = new JLabel();
        EmailLbl.setText("E-mail Address");
        EmailLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(EmailLbl,gbc);
        
        TelnoTxt = new JTextField();
        TelnoTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(TelnoTxt,gbc);
       
        EmailTxt = new JTextField();
        EmailTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(EmailTxt,gbc);
        
        HomeAddLbl = new JLabel();
        HomeAddLbl.setText("Mailing Home Address");
        HomeAddLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(HomeAddLbl,gbc);
        
        StreetTxt = new JTextField();
        StreetTxt.setText("(Street Address)");
        StreetTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.ipadx = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(StreetTxt,gbc);
                
        CityTxt = new JTextField();
        CityTxt.setText("(City)");
        CityTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(CityTxt,gbc);
        
        StateTxt = new JTextField();
        StateTxt.setText("(State)");
        StateTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(StateTxt,gbc);
        
        PostalTxt = new JTextField();
        PostalTxt.setText("(Postal/Zip Code)");
        PostalTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(PostalTxt,gbc);
        
        CountryTxt = new JTextField();
        CountryTxt.setText("(Country)");
        CountryTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(CountryTxt,gbc);
        
        BirthLbl = new JLabel();
        BirthLbl.setText("Date of Birth");
        BirthLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(BirthLbl,gbc);
        
        MStatusLbl = new JLabel();
        MStatusLbl.setText("Marital Status");
        MStatusLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(MStatusLbl,gbc);
        
        BirthTxt = new JTextField();
        BirthTxt.setText("(E.g. 02-14-2001)");
        BirthTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(BirthTxt,gbc);
        
        MStatusCB = new JComboBox(MStatus);
        MStatusCB.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(MStatusCB,gbc);
        
        LanguageLbl = new JLabel();
        LanguageLbl.setText("Language");
        LanguageLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 14;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(LanguageLbl,gbc);
        
        OccupLbl = new JLabel();
        OccupLbl.setText("Occupation");
        OccupLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 1;
        gbc.gridy = 14;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(OccupLbl,gbc);
        
        LanguageTxt = new JTextField();
        LanguageTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(LanguageTxt,gbc);
        
        OccupTxt = new JTextField();
        OccupTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 1;
        gbc.gridy = 15;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(OccupTxt,gbc);
        
        EmployerLbl = new JLabel();
        EmployerLbl.setText("Employer");
        EmployerLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 16;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(EmployerLbl,gbc);
        
        IncomeLbl = new JLabel();
        IncomeLbl.setText("Monthly Income");
        IncomeLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 18;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(IncomeLbl,gbc);
        
        EmployerTxt = new JTextField();
        EmployerTxt.setText("(Name of company you are working at.)");
        EmployerTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 17;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(EmployerTxt,gbc);
        
        IncomeTxt = new JTextField();
        IncomeTxt.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 19;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(IncomeTxt,gbc);
        
        EmpOptionalLbl = new JLabel();
        EmpOptionalLbl.setText("(Optional)");
        EmpOptionalLbl.setFont(new Font("Arial", Font.PLAIN, 11));
        gbc.gridx = 2;
        gbc.gridy = 17;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(EmpOptionalLbl,gbc);
        
        IncOptionalLbl = new JLabel();
        IncOptionalLbl.setText("(Optional)");
        IncOptionalLbl.setFont(new Font("Arial", Font.PLAIN, 11));
        gbc.gridx = 1;
        gbc.gridy = 19;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(IncOptionalLbl,gbc);
        
        NationalityLbl = new JLabel();
        NationalityLbl.setText("Nationality");
        NationalityLbl.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 20;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(NationalityLbl,gbc);
        
        NationalityTxt = new JTextField();
        NationalityTxt.setFont(new Font("Arial", Font.PLAIN,13));
        gbc.gridx = 0;
        gbc.gridy = 21;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(NationalityTxt,gbc);
        
        TermsCB = new JCheckBox();
        TermsCB.setText("I agree to the terms of service and conditions.");
        TermsCB.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 22;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        con.add(TermsCB,gbc);
        
        
        
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