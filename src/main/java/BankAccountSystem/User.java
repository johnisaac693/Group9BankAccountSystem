
package BankAccountSystem;

import java.util.*;


public class User {
    
    private String Name = "John Isaac Rizon";
    private String AccNum = "Sample Account Number";
    private String email = "Sampleemail@email.com";
    private String password = "Samplepassword";
    private String mobilenum = "0123456789";
    private float CheckingBalance = 800;
    private float SavingsBalance = 1200;
    
     public String getName()
    {
     return Name;
    }
     
      public String getAccNum()
    {
     return AccNum;
    }
      
       public String getEmail()
    {
     return email;
    }
    
       public String getPassword()
       {
           return password;
       }
       
    public String getMobileNum()
    {
      return mobilenum;
    }
    
    public float GetCheckingBalance()
    {
        return CheckingBalance;
    }
    
    public float GetSavingsBalance()
    {
        return SavingsBalance;
    }
    
}
