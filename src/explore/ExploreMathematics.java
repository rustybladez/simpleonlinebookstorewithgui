package explore;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ExploreMathematics extends JFrame{
	public ExploreMathematics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(600, 400);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(5, 1, 0, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 80));
        
        JLabel bookListLabel = new JLabel("Available Books");
        bookListLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bookListLabel.setFont(new Font("Arial", Font.BOLD, 20));
        bookListLabel.setBounds(30, 20, 150, 30);
        panel.add(bookListLabel);
        
        JLabel book1 = new JLabel("1. Calculus Made Easy");
        book1.setBounds(30, 20, 150, 30);
        panel.add(book1);
        
        JLabel book2 = new JLabel("2. Mathematics: From the Birth of Numbers");
        book2.setBounds(30, 20, 150, 30);
        panel.add(book2);
        
        JLabel book3 = new JLabel("3. Introduction to Mathematical Thinking");
        book3.setBounds(30, 20, 150, 30);
        panel.add(book3);
        
        JButton goBackButton = new JButton("Go Back");
        goBackButton.setBounds(50, 230, 250, 30);
        panel.add(goBackButton);
        goBackButton.setFocusable(false);
        
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreProgrammingAndDev
                ExploreAcademicBooksWindow academic = new ExploreAcademicBooksWindow();
                academic.setVisible(true);  // show the Academic window
            }
        });
        
        add(panel);
        setVisible(true);
        
        
	}
}
