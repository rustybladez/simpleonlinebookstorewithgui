package com.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class AboutUs extends JFrame{
	
	public AboutUs() {
		setTitle("About Us");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(new GridLayout(6, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		JLabel title = new JLabel("About Us");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 18));
		panel.add(title);
		
		JLabel aboutUsSection1 = new JLabel();
		aboutUsSection1.setText("<html>" + "Welcome to BooksPresso, where the aroma of freshly brewed coffee blends seamlessly with the crisp pages of your favorite books. We know you love nothing more than curling up with a great read and a perfect cup of coffee. That's why we've created the ultimate destination for all book nerds and coffee lovers alike." + "</html>");
		Font oldFont1 = aboutUsSection1.getFont();
		aboutUsSection1.setFont(new Font("Serif", oldFont1.getStyle(), oldFont1.getSize() + 2));
		
		JLabel aboutUsSection2 = new JLabel();
		aboutUsSection2.setText("<html>" + "Our shelves are stocked with the best titles, from literary classics to the latest bestsellers. And our baristas are passionate about crafting the perfect cup of coffee to complement your reading experience. Our blends are carefully selected and roasted to perfection, ensuring that every sip is a moment of pure bliss." + "</html>");
		Font oldFont2 = aboutUsSection2.getFont();
		aboutUsSection2.setFont(new Font("Serif", oldFont2.getStyle(), oldFont2.getSize() + 2));
		
		JLabel aboutUsSection3 = new JLabel();
		aboutUsSection3.setText("<html>" + "We're more than just a bookstore and coffee shop; we're a community of book lovers and coffeeholic. Whether you're looking for a quiet place to read, a lively book club discussion, or just a friendly conversation with fellow book nerds and coffee lovers, we've got you covered." + "</html>");
		Font oldFont3 = aboutUsSection3.getFont();
		aboutUsSection3.setFont(new Font("Serif", oldFont3.getStyle(), oldFont3.getSize() + 2));
		
		JLabel aboutUsSection4 = new JLabel();
		aboutUsSection4.setText("<html>" + "So come on in, grab a book and a cup of coffee, and make yourself at home. We're BooksPresso, and we can't wait to share our love of books and coffee with you."+ "<br><br></html>");
		Font oldFont4 = aboutUsSection4.getFont();
		aboutUsSection4.setFont(new Font("Serif", oldFont4.getStyle(), oldFont4.getSize() + 2));
		
		panel.add(aboutUsSection1);
		panel.add(aboutUsSection2);
		panel.add(aboutUsSection3);
		panel.add(aboutUsSection4);
		
		JButton goBackButton = new JButton("Go Back");
		goBackButton.setFocusable(false);
		goBackButton.setSize(150, 150);
		goBackButton.setPreferredSize(new Dimension(100, 100));
		
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				OnlineBookStoreGUI hp = new OnlineBookStoreGUI();
				hp.setVisible(true);
			}
		});
		
		JPanel buttonPanel = new JPanel(new BorderLayout());
		buttonPanel.add(goBackButton, BorderLayout.CENTER);
		panel.add(buttonPanel);
		
		add(panel);
		
		setVisible(true);
		
	}

}
