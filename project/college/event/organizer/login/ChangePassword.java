package project.college.event.organizer.login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ChangePassword extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField textField;
    private JLabel lblEnterNewPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ChangePassword(String name) {
        setBounds(450, 360, 1024, 234);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground((new Color(240,230,140)));
        contentPane.setLayout(null);

        textField = new JPasswordField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 34));
        textField.setBounds(373, 35, 609, 67);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnSearch = new JButton("Enter");
        btnSearch.setBackground((new Color(188,143,143)));
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String pstr = String.valueOf(textField.getPassword());
                try {
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb",
                            "root", "root");

                    PreparedStatement st = (PreparedStatement) con
                            .prepareStatement("Update userdb set Password=? where Name=?");

                    st.setString(1, pstr);
                    st.setString(2, name);
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(btnSearch, "Password has been successfully changed");

                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }

            }
        });
        btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnSearch.setBackground(new Color(240, 240, 240));
        btnSearch.setBounds(438, 127, 170, 59);
        contentPane.add(btnSearch);

        lblEnterNewPassword = new JLabel("Enter New Password :");
        lblEnterNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblEnterNewPassword.setBounds(45, 37, 326, 67);
        contentPane.add(lblEnterNewPassword);
    }
}
