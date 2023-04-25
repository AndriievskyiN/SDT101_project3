package part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextCirculation extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea;
    private JButton copyBtn;
    private JButton clearBtn;

    public TextCirculation() {
        super("Text Circulation");

        // set up the layout
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new GridLayout(2, 2));
        add(topPanel, BorderLayout.NORTH);
        JPanel centerPanel = new JPanel(new FlowLayout());
        add(centerPanel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new FlowLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        // create components
        JLabel label1 = new JLabel("TextField 1");
        textField1 = new JTextField(20);
        topPanel.add(label1);
        topPanel.add(textField1);

        JLabel label2 = new JLabel("TextField 2");
        textField2 = new JTextField(20);
        topPanel.add(label2);
        topPanel.add(textField2);

        JLabel label3 = new JLabel("TextArea");
        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        centerPanel.add(label3);
        centerPanel.add(scrollPane);

        copyBtn = new JButton("Copy Text");
        bottomPanel.add(copyBtn);

        clearBtn = new JButton("Clear All");
        bottomPanel.add(clearBtn);

        // add event listeners
        copyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // copy text from textField1 to textField2
                String text = textField1.getText();
                textField2.setText(text);

                // show message dialog
                JOptionPane.showMessageDialog(TextCirculation.this,
                        "Text copied from TextField 1 to TextField 2",
                        "Text Copied",
                        JOptionPane.INFORMATION_MESSAGE);

                // append text to textArea
                textArea.append(text + "\n");
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // clear all text fields and text area
                textField1.setText("");
                textField2.setText("");
                textArea.setText("");

                // show confirm dialog
                int choice = JOptionPane.showConfirmDialog(TextCirculation.this,
                        "Are you sure you want to clear all text?",
                        "Clear All",
                        JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    // show input dialog for user's name
                    String name = JOptionPane.showInputDialog(TextCirculation.this,
                            "Please enter your name:",
                            "Name Entry",
                            JOptionPane.PLAIN_MESSAGE);

                    // show final message dialog
                    JOptionPane.showMessageDialog(TextCirculation.this,
                            "All text cleared by " + name,
                            "Text Cleared",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // set window properties
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextCirculation();
    }
}
