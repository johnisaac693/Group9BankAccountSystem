/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountSystem;

import java.awt.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TransactionHistoryTrial2 extends JFrame {

    private JLabel title;
    private JTable table;
    private DefaultTableModel model;
    private JPanel mainPanel;

    private String[] columnNames = {"Date", "Type of Transaction", "Amount"};

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
        addTransaction(new Date(), "Deposit", 100.0);
        addTransaction(new Date(), "Withdrawal", -50.0);
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


}