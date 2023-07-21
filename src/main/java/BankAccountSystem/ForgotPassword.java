package BankAccountSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;

public class ForgotPassword extends JFrame implements ActionListener {

    JPanel fieldpanel, mainPanel;
    JButton btnConfirm;
    JTextField mobilenoField;
    JPasswordField newPassField;
    GridBagConstraints c;

    public ForgotPassword() {
        User user = User.getInstance();
        JLabel lblMobileNumber = new JLabel("Mobile Number: ");
        lblMobileNumber.setFont(new Font("Segoe UI", Font.BOLD, 12));

        JLabel lblNewPass = new JLabel("New Password: ");
        lblNewPass.setFont(new Font("Segoe UI", Font.BOLD, 12));

        mobilenoField = new JTextField(20);
        newPassField = new JPasswordField(20);

        // panel Setting
        fieldpanel = new JPanel();
        fieldpanel.setLayout(new GridBagLayout());
        fieldpanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        fieldpanel.add(lblMobileNumber, c);

        c.gridx = 1;
        c.gridy = 0;
        fieldpanel.add(mobilenoField, c);

        c.gridx = 0;
        c.gridy = 1;
        fieldpanel.add(lblNewPass, c);

        c.gridx = 1;
        c.gridy = 1;
        fieldpanel.add(newPassField, c);

        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
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
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConfirm) {
            String mobileNumber = mobilenoField.getText();
            String newPassword = newPassField.getText();

            // Perform password change logic here
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankamsdb", "root", "asdf12")) {
                String query = "UPDATE customerinfo SET customerPass = ? WHERE customerNum = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, newPassword);
                preparedStatement.setString(2, mobileNumber);

                int rowsUpdated = preparedStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    showMessageDialog(null, "Password changed successfully!");
                    dispose();
                    new BankAccountLogin();
                } else {
                    showMessageDialog(null, "Failed to change password. Mobile number not found.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }

}