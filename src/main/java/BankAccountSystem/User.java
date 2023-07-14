package BankAccountSystem;

import java.util.*;

public class User {
    private static User instance;

    private String Name = "Isaac";
    private String AccNum = "12345";
    private String email = "email";
    private String password = "password";
    private String mobilenum = "12345";
    private float CheckingBalance;
    private float SavingsBalance;

   

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

    public float getCheckingBalance() {
        return CheckingBalance;
    }

    public float getSavingsBalance() {
        return SavingsBalance;
    }

    public void subtractSavings(float x) {
        SavingsBalance -= x;
    }
    
    public void subtractChecking(float x) {
        CheckingBalance -= x;
    }
    
    public void addSavings(float x) {
        SavingsBalance += x;
    }
    
    public void addChecking(float x) {
        CheckingBalance += x;
    }
}