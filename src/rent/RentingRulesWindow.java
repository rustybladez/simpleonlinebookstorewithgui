package rent;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RentingRulesWindow extends JFrame{
	
	public RentingRulesWindow() {
        // set window title
        setTitle("Rules");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 620);
        setLocationRelativeTo(null);

        // create main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // create rules panel
        JPanel rulesPanel = new JPanel(new BorderLayout());
        rulesPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // add rules
        JLabel rulesLabel = new JLabel("<html><body><h1><center>Renting Rules</center></h1>1. Only Academic Books are allowed to be rented.<br> 2. You can only rent a book at a time.<br> 3. You have 7 days to return the rented book.<br><br> <p>Authority has the right to make amendments to the rules at any time.</p></body></html>");
        rulesLabel.setFont(new Font("Arial", Font.BOLD, 20));
        rulesPanel.add(rulesLabel, BorderLayout.CENTER);

        // add rules panel to main panel
        mainPanel.add(rulesPanel, BorderLayout.CENTER);

        // create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // add go back button
        JButton goBackButton = new JButton("Go Back");
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // close the window
                RentAcademicBooks rentAcademicBooks = new RentAcademicBooks();
                rentAcademicBooks.setVisible(true);
            }
        });
        buttonPanel.add(goBackButton);

        // add button panel to main panel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // set window properties
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }
}
