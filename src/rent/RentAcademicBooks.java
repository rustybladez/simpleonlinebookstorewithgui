package rent;

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

import buy.BuyBooksWindow;
import buy.BuyElectrical;
import buy.BuyMathematics;
import buy.BuyPhysics;
import buy.BuyProgrammingAndDev;

public class RentAcademicBooks extends JFrame{
	public RentAcademicBooks() {
		setTitle("Academic Books");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 620);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(7, 1, 0, 20));
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
        
        JButton ruleButton = new JButton("Rules");
        ruleButton.setBounds(50, 230, 250, 30);
        panel.add(ruleButton);
        ruleButton.setFocusable(false);
        
        JButton goBackButton = new JButton("Go Back");
        goBackButton.setBounds(50, 230, 250, 30);
        panel.add(goBackButton);
        goBackButton.setFocusable(false);
        
        programmingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RentProgrammingAndDev rentProgramming = new RentProgrammingAndDev();
                rentProgramming.setVisible(true);
            }
        });
        
        physicsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RentPhysics rentPhysics = new RentPhysics();
                rentPhysics.setVisible(true);
            }
        });
        
        mathematicsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RentMathematics rentMathematics = new RentMathematics();
                rentMathematics.setVisible(true);
            }
        });
        
        electricalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RentElectrical rentElectrical= new RentElectrical();
                rentElectrical.setVisible(true);
            }
        });
        
        ruleButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		RentingRulesWindow rentingRulesWindow = new RentingRulesWindow();
        		rentingRulesWindow.setVisible(true);
        	}
        });
        
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                OnlineBookStoreGUI hp = new OnlineBookStoreGUI();
                hp.setVisible(true);
            }
        });
        
        add(panel);
        setVisible(true);
	}

}
