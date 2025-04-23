import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame implements ActionListener {
    JButton yesButton, noButton, closeButton;
    JLabel label;

    public ButtonFrame() {
        setTitle("Button Frame");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Press a button");
        yesButton = new JButton("Yes");
        noButton = new JButton("No");
        closeButton = new JButton("Close");

        yesButton.addActionListener(this);
        noButton.addActionListener(this);
        closeButton.addActionListener(this);

        add(label);
        add(yesButton);
        add(noButton);
        add(closeButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesButton) {
            label.setText("Button Yes is pressed");
        } else if (e.getSource() == noButton) {
            label.setText("Button No is pressed");
        } else if (e.getSource() == closeButton) {
            dispose(); // closes the window
        }
    }

    public static void main(String[] args) {
        new ButtonFrame();
    }
}