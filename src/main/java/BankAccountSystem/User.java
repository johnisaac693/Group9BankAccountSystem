package BankAccountSystem;

import java.util.*;

public class User {

    private static User instance;

    private String Name;
    private String AccNum;
    private String email;
    private String password;
    private String mobilenum;
    private String address;
    private double CheckingBalance;
    private double SavingsBalance;

  

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getName() {
        return Name;
    }

    public String getAccNum() {
        return AccNum;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNum() {
        return mobilenum;
    }

    public double getCheckingBalance() {
        return CheckingBalance;
    }

    public double getSavingsBalance() {
        return SavingsBalance;
    }

    
    public void setCheckingBalance(double checkingBalance) {
        this.CheckingBalance = checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.SavingsBalance = savingsBalance;
    }
    
    // SETTER
    
     public void setName(String nameset) {
        Name = nameset;
    }

    public void setEmail(String emailset) {
        email = emailset;
    }

    public void setPassword(String passwordString) {
        password = passwordString;
    }

    public void setMobileNum(String mobileString) {
        mobilenum = mobileString;
    }
    
    public void setAddress (String addressString){
    
        address = addressString;
    }
    
    public void setAccNumber(String accString){
        AccNum = accString;
    }

  
    //BANK FUNCTIONS
    public void subtractSavings(double amount) {
        SavingsBalance -= amount;
    }
    
    public void subtractChecking(double amount) {
        CheckingBalance -= amount;
    }
    
    public void addSavings(double amount) {
        SavingsBalance += amount;
    }
    
    public void addChecking(double amount) {
        CheckingBalance += amount;
    }
    
    public boolean comparelogin(String phonenumber, String passphrase) {
        return password.equals(passphrase) && mobilenum.equals(phonenumber);
}
}

    
    
    
         
    
    
    
   
