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

import explore.ExploreBooksWindow;

public class BuyAcademicBooksWindow extends JFrame{
	public BuyAcademicBooksWindow() {
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
                BuyProgrammingAndDev buyProgramming = new BuyProgrammingAndDev();
                buyProgramming.setVisible(true);  // show the HomePage window
            }
        });
        
        physicsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                BuyPhysics buyPhysics = new BuyPhysics();
                buyPhysics.setVisible(true);  // show the HomePage window
            }
        });
        
        mathematicsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                BuyMathematics buyMathematics = new BuyMathematics();
                buyMathematics.setVisible(true);  // show the HomePage window
            }
        });
        
        electricalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                BuyElectrical buyElectrical= new BuyElectrical();
                buyElectrical.setVisible(true);  // show the HomePage window
            }
        });
        
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the ExploreBooksWindow
                BuyBooksWindow buy = new BuyBooksWindow();
                buy.setVisible(true);  // show the HomePage window
            }
        });
        
        
        add(panel);
        setVisible(true);
	}
}
