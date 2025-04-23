import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserForm extends JFrame implements ActionListener {

    private JTextField firstNameField, lastNameField;
    private JComboBox<String> dayBox, monthBox, yearBox;
    private JButton submitButton;
    private JLabel outputLabel;

    public UserForm() {
        setTitle("User Registration Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        Font labelFont = new Font("Segoe UI", Font.PLAIN, 16);

        // First Name
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("First Name:"), gbc);
        firstNameField = new JTextField(15);
        gbc.gridx = 1;
        add(firstNameField, gbc);

        // Last Name
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Last Name:"), gbc);
        lastNameField = new JTextField(15);
        gbc.gridx = 1;
        add(lastNameField, gbc);

        // Date of Birth
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Date of Birth:"), gbc);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) days[i - 1] = String.valueOf(i);
        dayBox = new JComboBox<>(days);

        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        monthBox = new JComboBox<>(months);

        String[] years = new String[100];
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        for (int i = 0; i < 100; i++) years[i] = String.valueOf(currentYear - i);
        yearBox = new JComboBox<>(years);

        JPanel dobPanel = new JPanel();
        dobPanel.add(dayBox);
        dobPanel.add(monthBox);
        dobPanel.add(yearBox);

        gbc.gridx = 1;
        add(dobPanel, gbc);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(submitButton, gbc);

        // Output Label
        outputLabel = new JLabel(" ");
        outputLabel.setFont(labelFont);
        gbc.gridy = 4;
        add(outputLabel, gbc);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String first = firstNameField.getText().trim();
        String last = lastNameField.getText().trim();
        String day = (String) dayBox.getSelectedItem();
        String month = (String) monthBox.getSelectedItem();
        String year = (String) yearBox.getSelectedItem();

        if (first.isEmpty() || last.isEmpty()) {
            outputLabel.setText("Please enter both first and last names.");
        } else {
            outputLabel.setText("<html>Hello, <b>" + first + " " + last + "</b>!<br>Your DOB: " + day + " " + month + " " + year + "</html>");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserForm::new);
    }
}
