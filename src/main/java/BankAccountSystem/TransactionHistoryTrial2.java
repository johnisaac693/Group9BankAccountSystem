/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TransactionHistoryTrial2 extends JFrame {

    private JLabel title;
    private JTable table;
    private DefaultTableModel model;
    private JPanel mainPanel;

    private String[] columnNames = {"Date", "Type of Transaction", "Amount"};

    User user = User.getInstance();
    public TransactionHistoryTrial2() {

        setTitle("Transaction History");
        setSize(600, 400);

        model = new DefaultTableModel(columnNames, 0);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        title = new JLabel("Transaction History");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        setContentPane(mainPanel);
        centerFrame();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Sample Transaction
        //addTransaction(new Date(), "Deposit", 100.0);
        //addTransaction(new Date(), "Withdrawal", -50.0);
        
        GetTransactionHistory();
    }
    
    private void GetTransactionHistory() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
            String query = "SELECT * FROM transactions WHERE accountNumber = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getAccNum());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Date date = resultSet.getDate("datetransact");
                String type = resultSet.getString("typetransact");
                double amount = resultSet.getDouble("amounttransact");

                addTransaction(date, type, amount);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching transaction history!");
        }
    }

    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }

    // Implementing AddTransaction Method para makapag lagay ng sample transaction
    private void addTransaction(Date date, String transaction, double amount) {
        String dateString = date.toString();
        Object[] rowData = {dateString, transaction, amount};
        model.addRow(rowData);
    }
    
//    public void addWithdrawal(Date date, double amount) {
//    addTransaction(date, "Withdrawal", -amount);
//}
//
//public void addDeposit(Date date, double amount) {
//    addTransaction(date, "Deposit", amount);
//}


}