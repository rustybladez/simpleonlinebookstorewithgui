package rent;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.gui.OnlineBookStoreGUI;

public class RentMathematics extends JFrame{
	private String selectedBookName = "";
	private JButton rentButton, goBackButton;
	OnlineBookStoreGUI hp;
    
    public RentMathematics() {
        setTitle("Rent a Book");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Select a book to rent:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titleLabel);

        panel.add(Box.createVerticalStrut(10));

        String[] bookNames = {"1. Calculus Made Easy",
                              "2. Mathematics: From the Birth of Numbers",
                              "3. Introduction to Mathematical Thinking"};

        ButtonGroup bookGroup = new ButtonGroup();

        for (String bookName : bookNames) {
            JPanel bookPanel = new JPanel(new BorderLayout());
            bookPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

            JLabel nameLabel = new JLabel(bookName);
            nameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            bookPanel.add(nameLabel, BorderLayout.WEST);

            JRadioButton radioButton = new JRadioButton();
            radioButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
            bookPanel.add(radioButton, BorderLayout.EAST);
            radioButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	if (!RentStatus.rented) {
                		selectedBookName = bookName.substring(bookName.indexOf(". ") + 2);
                    	rentButton.setEnabled(true);
                	}
                }
            });
            bookGroup.add(radioButton);

            panel.add(bookPanel);
            panel.add(Box.createVerticalStrut(5));
        }
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, 333, 600, 35);

        rentButton = new JButton("Rent");
        rentButton.setEnabled(false);
        rentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to rent \"" + selectedBookName + "\"?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // user clicked yes, proceed with renting
                    JOptionPane.showMessageDialog(null, "Thank you for renting from us! You have 7 days to return the book. Enjoy your read ^_^", "Success", JOptionPane.INFORMATION_MESSAGE);
                    rentButton.setEnabled(false);
                    RentStatus.rented = true;
                    bookGroup.clearSelection();
                    
                } 
            }
        });
        rentButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(rentButton);
        
        goBackButton = new JButton("Go Back");
        goBackButton.setBounds(50, 230, 250, 30);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RentAcademicBooks rentAcademicBooks = new RentAcademicBooks();
                rentAcademicBooks.setVisible(true);
            }
        });
        
        buttonPanel.add(rentButton);
        buttonPanel.add(goBackButton);
        
        panel.add(buttonPanel);

        add(panel);
        setVisible(true);
    }
}
