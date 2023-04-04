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

public class ExploreNonAcademicBooksWindow extends JFrame{
	public ExploreNonAcademicBooksWindow() {
		setTitle("Non-Academic Books");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(4, 1, 0, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 80));
        
        JLabel categoriesLabel = new JLabel("Categories");
        categoriesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        categoriesLabel.setFont(new Font("Arial", Font.BOLD, 20));
        categoriesLabel.setBounds(30, 20, 150, 30);
        panel.add(categoriesLabel);
        
        JButton fictionBtn = new JButton("Fiction");
        fictionBtn.setBounds(50, 230, 250, 30);
        panel.add(fictionBtn);
        fictionBtn.setFocusable(false);
        
        JButton nonFictionBtn = new JButton("Non-Fiction");
        nonFictionBtn.setBounds(50, 230, 250, 30);
        panel.add(nonFictionBtn);
        nonFictionBtn.setFocusable(false);
        
        JButton goBackButton = new JButton("Go Back");
        goBackButton.setBounds(50, 230, 250, 30);
        panel.add(goBackButton);
        goBackButton.setFocusable(false);
        
        fictionBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                ExploreFiction exploreFiction = new ExploreFiction();
                exploreFiction.setVisible(true);  // show the ExploreFiction window
            }
        });
        
        nonFictionBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                ExploreNonFiction exploreNonFiction = new ExploreNonFiction();
                exploreNonFiction.setVisible(true);  // show the ExploreNonFiction window
            }
        });
        
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                ExploreBooksWindow explore = new ExploreBooksWindow();
                explore.setVisible(true);  // show the HomePage window
            }
        });
        
        add(panel);
        setVisible(true);
        
	}

}
