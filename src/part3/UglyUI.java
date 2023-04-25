package part3;
import java.awt.*;
import javax.swing.*;

public class UglyUI extends JFrame{
        public UglyUI() {
            // Set window title
            super("Title");

            // Use BoxLayout for the entire frame
            this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

            // Add a label to the top
            JLabel titleLabel = new JLabel("Welcome to My Ugly UI!");
            titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            this.add(titleLabel);

            // Create a panel for the center with GridLayout
            JPanel centerPanel = new JPanel(new GridLayout(2, 2));
            centerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Add some buttons to the center panel
            centerPanel.add(new JButton("Click me!"));
            centerPanel.add(new JButton("No, click me!"));
            centerPanel.add(new JButton("I'm the button you want!"));
            centerPanel.add(new JButton("No, I am!"));

            // Add the center panel to the frame
            this.add(centerPanel);

            // Create a panel for the bottom with FlowLayout
            JPanel bottomPanel = new JPanel(new FlowLayout());
            bottomPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Add a text field and a label to the bottom panel
            bottomPanel.add(new JLabel("Enter your name: "));
            bottomPanel.add(new JTextField(10));

            // Add some rigid space to the bottom panel
            bottomPanel.add(Box.createRigidArea(new Dimension(10, 0)));

            // Add a button to the bottom panel
            bottomPanel.add(new JButton("Submit"));

            // Add the bottom panel to the frame
            this.add(bottomPanel);

            // Add some vertical glue to the bottom of the frame
            this.add(Box.createVerticalGlue());
        }

        public static void main(String[] args) {
            UglyUI frame = new UglyUI();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }
