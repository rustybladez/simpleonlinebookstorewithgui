package com.gui;

import java.awt.BorderLayout;
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

import buy.BuyBooksWindow;
import explore.ExploreBooksWindow;
import rent.RentAcademicBooks;
import rent.RentProgrammingAndDev;

public class OnlineBookStoreGUI extends JFrame {
	private JButton rentButton;
	
	public OnlineBookStoreGUI() {
        setTitle("BooksPresso");
        setSize(500, 300);
        setLocationRelativeTo(null); // center the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
     // create the title and tag line labels
        JLabel titleLabel = new JLabel("BooksPresso", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));
        JLabel taglineLabel = new JLabel("Brew up Your Knowledge", SwingConstants.CENTER);
        taglineLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        
     // create the buttons
        JButton exploreButton = new JButton("Explore Books");
        exploreButton.setFocusable(false);
        JButton buyButton = new JButton("Buy a Book");
        buyButton.setFocusable(false);
        JButton rentButton = new JButton("Rent a Book");
        rentButton.setFocusable(false);
        JButton aboutButton = new JButton("About Us");
        aboutButton.setFocusable(false);
        
     // create the button panel
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonPanel.add(exploreButton);
        buttonPanel.add(buyButton);
        buttonPanel.add(rentButton);
        buttonPanel.add(aboutButton);
        
     // add the components to the content pane
        add(titleLabel, BorderLayout.NORTH);
        add(taglineLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        exploreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            	ExploreBooksWindow explore = new ExploreBooksWindow();
            	explore.setVisible(true);
            }
            
        });
        
        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                BuyBooksWindow buy = new BuyBooksWindow();
                buy.setVisible(true);
            }
            
        });
        
        rentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                RentAcademicBooks rentAcademicBooks = new RentAcademicBooks();
                rentAcademicBooks.setVisible(true);
            }
            
        });
        
        aboutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		AboutUs aboutUs = new AboutUs();
        		aboutUs.setVisible(true);
        	}
        });
    }
	
	public static void main(String[] args) {
		OnlineBookStoreGUI obsgui = new OnlineBookStoreGUI();
		obsgui.setVisible(true);
    }
	
}
