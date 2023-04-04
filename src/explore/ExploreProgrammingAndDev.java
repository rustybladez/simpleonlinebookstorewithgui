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

public class ExploreProgrammingAndDev extends JFrame{
	public ExploreProgrammingAndDev() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(600, 400);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(7, 1, 0, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 80));
        
        JLabel bookListLabel = new JLabel("Available Books");
        bookListLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bookListLabel.setFont(new Font("Arial", Font.BOLD, 20));
        bookListLabel.setBounds(30, 20, 150, 30);
        panel.add(bookListLabel);
        
        JLabel book1 = new JLabel("1. The C Programming Language: 2nd Edition");
        book1.setBounds(30, 20, 150, 30);
        panel.add(book1);
        
        JLabel book2 = new JLabel("2. The C++ Programming Language: 4th Edition");
        book2.setBounds(30, 20, 150, 30);
        panel.add(book2);
        
        JLabel book3 = new JLabel("3. Effective Java: 2nd Edition");
        book3.setBounds(30, 20, 150, 30);
        panel.add(book3);
        
        JLabel book4 = new JLabel("4. Clean Code: A Handbook of Agile Software Craftsmanship");
        book4.setBounds(30, 20, 150, 30);
        panel.add(book4);
        
        JLabel book5 = new JLabel("5. The Pragmatic Programmer: 20th Anniversary Edition");
        book5.setBounds(30, 20, 150, 30);
        panel.add(book5);
        
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
