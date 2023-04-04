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

public class ExploreAcademicBooksWindow extends JFrame{
	public ExploreAcademicBooksWindow() {
        setTitle("Academic Books");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(6, 1, 0, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 80));
        
        JLabel categoriesLabel = new JLabel("Categories");
        categoriesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        categoriesLabel.setFont(new Font("Arial", Font.BOLD, 20));
        categoriesLabel.setBounds(30, 20, 150, 30);
        panel.add(categoriesLabel);
        
        JButton programmingButton = new JButton("Programming & Development");
        programmingButton.setBounds(50, 70, 250, 30);
        panel.add(programmingButton);
        programmingButton.setFocusable(false);
        
        JButton physicsButton = new JButton("Physics");
        physicsButton.setBounds(50, 110, 250, 30);
        panel.add(physicsButton);
        physicsButton.setFocusable(false);
        
        JButton mathematicsButton = new JButton("Mathematics");
        mathematicsButton.setBounds(50, 150, 250, 30);
        panel.add(mathematicsButton);
        mathematicsButton.setFocusable(false);
        
        JButton electricalButton = new JButton("Electrical & Electronics");
        electricalButton.setBounds(50, 190, 250, 30);
        panel.add(electricalButton);
        electricalButton.setFocusable(false);
        
        JButton goBackButton = new JButton("Go Back");
        goBackButton.setBounds(50, 230, 250, 30);
        panel.add(goBackButton);
        goBackButton.setFocusable(false);
        
        programmingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                ExploreProgrammingAndDev explorePAndD = new ExploreProgrammingAndDev();
                explorePAndD.setVisible(true);  // show the ExploreProgrammingAndDev window
            }
        });
        
        physicsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                ExplorePhysics explorePhysics = new ExplorePhysics();
                explorePhysics.setVisible(true);  // show the ExplorePhysics window
            }
        });
        
        mathematicsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                ExploreMathematics exploreMath = new ExploreMathematics();
                exploreMath.setVisible(true);  // show the ExploreMathematics window
            }
        });
        
        electricalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                ExploreElectrical exploreElectrical = new ExploreElectrical();
                exploreElectrical.setVisible(true);  // show the ExploreElectrical window
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
