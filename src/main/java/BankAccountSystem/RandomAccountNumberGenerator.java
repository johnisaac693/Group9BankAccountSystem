/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;

import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RandomAccountNumberGenerator {
    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int ACCOUNT_NUMBER_LENGTH = 10;

    public static String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String accountNumber;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
            boolean isUnique;
            do {
                sb.setLength(0); // Clear the StringBuilder
                for (int i = 0; i < ACCOUNT_NUMBER_LENGTH; i++) {
                    int index = random.nextInt(CHARACTERS.length());
                    char randomChar = CHARACTERS.charAt(index);
                    sb.append(randomChar);
                }
                accountNumber = sb.toString();

                // Check if the generated account number is unique
                String query = "SELECT COUNT(*) FROM customerinfo WHERE customerAccNum = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, accountNumber);
                ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();
                int count = resultSet.getInt(1);
                isUnique = (count == 0);
            } while (!isUnique);

        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle the exception as required
            accountNumber = null;
        }

        return accountNumber;
    }
}

    
//    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    private static final int ACCOUNT_NUMBER_LENGTH = 10;
//
//    public static String generateAccountNumber() {
//        Random random = new Random();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH; i++) {
//            int index = random.nextInt(CHARACTERS.length());
//            char randomChar = CHARACTERS.charAt(index);
//            sb.append(randomChar);
//        }
//
//        return sb.toString();
//    }
    
//}
  
