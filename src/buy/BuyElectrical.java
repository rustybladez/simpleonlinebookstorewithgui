package buy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BuyElectrical extends JFrame{
	private JPanel bookListPanel, cartPanel, checkoutPanel;
    private int cartCount = 0, totalPrice = 0;
    private JLabel cartCountLabel, totalPriceLabel;

    public BuyElectrical() {
        setTitle("Add Books to Cart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Book List Panel
        
        bookListPanel = new JPanel(new GridLayout(5, 3, 10, 0));
        String[] bookNames = {"<html>" + "1. Fundamentals of Electric Circuits" + "</html>",
        		"<html>" + "2. Fundamentals of Applied Electromagnetics" + "</html>",
        		"<html>" + "3. Electronic Devices And Circuits: 5th Edition" + "</html>"};
        for (String bookName : bookNames) {
            JPanel bookPanel = new JPanel(new GridLayout(1, 1, 50, 0));
            bookPanel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 80));
            JLabel nameLabel = new JLabel(bookName);
            JButton addButton = new JButton("Add to cart");
            addButton.setFocusable(false);
            JLabel countLabel = new JLabel("0");
            addButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int count = Integer.parseInt(countLabel.getText()) + 1;
                    countLabel.setText(Integer.toString(count));
                    cartCount++;
                    cartCountLabel.setText("Cart: " + cartCount);
                    totalPrice += 250;
                    totalPriceLabel.setText("Total: " + totalPrice + " Taka");
                }
            });
            bookPanel.add(nameLabel, BorderLayout.WEST);
            bookPanel.add(addButton, BorderLayout.CENTER);
            bookPanel.add(countLabel, BorderLayout.EAST);
            bookListPanel.add(bookPanel);
        }


        // Cart Panel
        cartPanel = new JPanel(new BorderLayout());
        cartPanel.setBounds(509, 0, 91, 333);
        cartCountLabel = new JLabel("Cart: 0");
        cartCountLabel.setBounds(0, 0, 91, 104);
        totalPriceLabel = new JLabel("Total: 0 Taka");
        totalPriceLabel.setBounds(0, 114, 91, 104);
        
        JButton resetButton = new JButton("Reset");
        resetButton.setFocusable(false);
        resetButton.setBounds(0, 228, 91, 104);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < bookListPanel.getComponentCount(); i++) {
                    JPanel bookPanel = (JPanel) bookListPanel.getComponent(i);
                    JLabel countLabel = (JLabel) bookPanel.getComponent(2);
                    countLabel.setText("0");
                }
                cartCount = 0;
                cartCountLabel.setText("Cart: 0");
                totalPrice = 0;
                totalPriceLabel.setText("Total: 0 Taka");
            }
        });
        
        cartPanel.add(cartCountLabel, BorderLayout.CENTER);
        cartPanel.add(totalPriceLabel, BorderLayout.CENTER);
        

        
        checkoutPanel = new JPanel();
        checkoutPanel.setBounds(0, 333, 600, 35);
        
        JButton buyButton = new JButton("Buy");
        buyButton.setFocusable(false);
        buyButton.setBounds(270, 5, 60, 25);
        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (cartCount == 0) {
                	JOptionPane.showMessageDialog(null, "Please add at least one book to the cart.", "Empty Cart", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    // user clicked yes, proceed with buying
                	int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to buy these books?", "Confirmation", JOptionPane.YES_NO_OPTION);
                	if (confirm == JOptionPane.YES_OPTION) {
                		JOptionPane.showMessageDialog(null, "Thank you for your purchase! Happy Reading ^_^", "Success", JOptionPane.INFORMATION_MESSAGE);
                        for (int i = 0; i < bookListPanel.getComponentCount(); i++) {
                            JPanel bookPanel = (JPanel) bookListPanel.getComponent(i);
                            JLabel countLabel = (JLabel) bookPanel.getComponent(2);
                            countLabel.setText("0");
                        }
                        cartCount = 0;
                        cartCountLabel.setText("Cart: 0");
                        totalPrice = 0;
                        totalPriceLabel.setText("Total: 0 Taka");
                	}
                    
                } 
            }
        });
        
        JButton goBackButton = new JButton("Go Back");
        goBackButton.setBounds(50, 230, 250, 30);
        goBackButton.setFocusable(false);
        
        goBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the BuyProgrammingAndDev
                BuyAcademicBooksWindow buyAcademic = new BuyAcademicBooksWindow();
                buyAcademic.setVisible(true);  // show the BuyAcademicBooksWindow window
            }
        });
        
        checkoutPanel.add(buyButton);
        checkoutPanel.add(resetButton);
        checkoutPanel.add(goBackButton);

        // Main Panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBounds(0, 0, 600, 368); 
        mainPanel.add(bookListPanel, BorderLayout.CENTER);
        mainPanel.add(cartPanel, BorderLayout.EAST);
        mainPanel.add(checkoutPanel, BorderLayout.SOUTH);
        add(mainPanel);

        
        setVisible(true);
    }
}
