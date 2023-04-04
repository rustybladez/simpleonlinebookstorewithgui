package buy;

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

import com.gui.OnlineBookStoreGUI;

import explore.ExploreAcademicBooksWindow;
import explore.ExploreNonAcademicBooksWindow;

public class BuyBooksWindow extends JFrame{
	public BuyBooksWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(500, 300);
        setLocationRelativeTo(null);
        
        // Create a JPanel to hold the buttons
        JPanel panel = new JPanel(new GridLayout(4, 1, 0, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 80));
        
        JLabel categoriesLabel = new JLabel("Categories");
        categoriesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        categoriesLabel.setFont(new Font("Arial", Font.BOLD, 20));
        categoriesLabel.setBounds(30, 20, 150, 30);
        panel.add(categoriesLabel);

        // Create the buttons
        JButton academicBtn = new JButton("Academic Books");
        academicBtn.setFocusable(false);
        JButton nonAcademicBtn = new JButton("Non-Academic Books");
        nonAcademicBtn.setFocusable(false);
        JButton goBackBtn = new JButton("Go Back");
        goBackBtn.setFocusable(false);

        // Add the buttons to the panel
        panel.add(academicBtn);
        panel.add(nonAcademicBtn);
        panel.add(goBackBtn);

        // Add an action listener to each button
        academicBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                BuyAcademicBooksWindow academic = new BuyAcademicBooksWindow();
                academic.setVisible(true);  // show the Academic window
            }
        });

        nonAcademicBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                BuyNonAcademicBooksWindow nonAcademic = new BuyNonAcademicBooksWindow();
                nonAcademic.setVisible(true);  // show the Non-Academic window
            }
            
        });

        goBackBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                OnlineBookStoreGUI hp = new OnlineBookStoreGUI();
                hp.setVisible(true);  // show the HomePage window
            }
            
        });

        // Add the panel to the frame and make it visible
        add(panel);
        setVisible(true);
	}
}
