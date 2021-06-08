import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class MainInter {
	 JFrame mainFrame;
	private JTextField textField;
	private JTextField txtchikbmeal;
	private JTextField txtcheeseb;
	private JTextField txtcodeliv;
	private JTextField txtcostmel;
	private JTextField txtcodrink;
	private JTextField txttotal;
	private JTextField txtstotal;
	private JTextField txttax;
	private JTextField txtconvert;
	private JTextField txtamount;
	private JTextField txtqty;
	private JTextField txtchib;
	Connection conn=dbconnection.dbconn();
	PreparedStatement pst =null;
	ResultSet rs =null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInter window = new MainInter();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainInter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Restaur De` Daniel Restaurant Management System ");
		mainFrame.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mainFrame.setBounds(0, 0, 1358, 643);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(143, 188, 143), 3));
		panel.setBounds(42, 48, 508, 276);
		mainFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(95, 11, 106, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(54, 64, 147, 42);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(95, 117, 106, 42);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Drink");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(45, 196, 47, 32);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(263, 191, 63, 42);
		panel.add(lblNewLabel_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 170, 508, 2);
		panel.add(separator);
		
		JComboBox cbodrink = new JComboBox();
		cbodrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Fanta", "Coke", "Malt"}));
		cbodrink.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cbodrink.setBounds(102, 202, 136, 32);
		panel.add(cbodrink);
		
		JCheckBox chckhomedeliver = new JCheckBox("Home Delivery");
		chckhomedeliver.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckhomedeliver.setBounds(100, 235, 127, 23);
		panel.add(chckhomedeliver);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxTax.setBounds(324, 228, 72, 23);
		panel.add(chckbxTax);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField.setBounds(263, 23, -118, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		txtchikbmeal = new JTextField();
		txtchikbmeal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtchikbmeal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtchikbmeal.setColumns(10);
		txtchikbmeal.setBounds(263, 76, 231, 30);
		panel.add(txtchikbmeal);
		
		txtcheeseb = new JTextField();
		txtcheeseb.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcheeseb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtcheeseb.setColumns(10);
		txtcheeseb.setBounds(263, 129, 231, 30);
		panel.add(txtcheeseb);
		
		txtqty = new JTextField();
		txtqty.setHorizontalAlignment(SwingConstants.RIGHT);
		txtqty.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtqty.setColumns(10);
		txtqty.setBounds(324, 194, 170, 30);
		panel.add(txtqty);
		
		txtchib = new JTextField();
		txtchib.setHorizontalAlignment(SwingConstants.RIGHT);
		txtchib.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtchib.setColumns(10);
		txtchib.setBounds(263, 23, 231, 30);
		panel.add(txtchib);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(143, 188, 143), 3));
		panel_1.setBounds(557, 48, 344, 276);
		mainFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtconvert = new JTextField();
		txtconvert.setEditable(false);
		txtconvert.setHorizontalAlignment(SwingConstants.RIGHT);
		txtconvert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtconvert.setColumns(10);
		txtconvert.setBounds(146, 160, 160, 30);
		panel_1.add(txtconvert);
		
		txtamount = new JTextField();
		txtamount.setHorizontalAlignment(SwingConstants.RIGHT);
		txtamount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtamount.setColumns(10);
		txtamount.setBounds(146, 107, 160, 30);
		panel_1.add(txtamount);
		
		JComboBox cbocountry = new JComboBox();
		cbocountry.setModel(new DefaultComboBoxModel(new String[] {"Choose one ", "USA", "Ghana", "Canada", "Nigeria", "Germany"}));
		cbocountry.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cbocountry.setBounds(146, 45, 160, 32);
		panel_1.add(cbocountry);
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double Nigerian_Naira = 302.96;
				double US_Dollar = 1.52;
				double Canadian_Dollar = 2.03;
				double Ghana_cedi=5.756;
				double Gemany_P=8.21;
				if(txtamount.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Please enter the amount before convert");
				}
				else {
					double Ghana_Ced = Double.parseDouble(txtamount.getText());
					if(cbocountry.getSelectedItem().equals("Nigeria"))
					{
						String cedis = String.format("N%.2f", Ghana_Ced * Nigerian_Naira);
						txtconvert.setText(cedis.toString());
					}
					else if(cbocountry.getSelectedItem().equals("USA"));
					{
					String cedis2 = String.format("$%.2f", Ghana_Ced *US_Dollar);
					txtconvert.setText(cedis2.toString());
					}
					if(cbocountry.getSelectedItem().equals("Ghana"));
					{
					String cedis2 = String.format("Ghc%.2f", Ghana_Ced *Ghana_cedi);
					txtconvert.setText(cedis2.toString());
					}
					
					if(cbocountry.getSelectedItem().equals("Germani "));
					{
					String cedis2 = String.format("$%.2f", Ghana_Ced *Gemany_P);
					txtconvert.setText(cedis2.toString());
					}
					 if(cbocountry.getSelectedItem().equals(" Canada"));
						{
						String cedis2 = String.format("$%.2f", Ghana_Ced *Canadian_Dollar);
						txtconvert.setText(cedis2.toString());
						}
				}
				
			}
		});
		btnConvert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnConvert.setBounds(79, 211, 89, 42);
		panel_1.add(btnConvert);
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField temp = null;
				for(Component c:panel_1.getComponents())  {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
					}
				}
				
				cbocountry.setSelectedIndex(0);
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.setBounds(217, 211, 89, 42);
		panel_1.add(btnReset);
		JLabel lblNewLabel_1_4_1 = new JLabel("Choose Country");
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_4_1.setBounds(17, 40, 103, 42);
		panel_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Enter Amount");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_2_1.setBounds(17, 95, 103, 42);
		panel_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Converted to");
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2_1_1.setBounds(10, 148, 110, 42);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("Currency Converter");
		lblNewLabel_1_5_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_5_1_1.setBounds(90, 11, 138, 32);
		panel_1.add(lblNewLabel_1_5_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(143, 188, 143), 3));
		panel_2.setBounds(911, 48, 412, 474);
		mainFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 47, 392, 416);
		panel_2.add(txtArea);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Receipt");
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_5_1.setBounds(163, 11, 138, 32);
		panel_2.add(lblNewLabel_1_5_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(143, 188, 143), 3));
		panel_3.setBounds(42, 335, 508, 187);
		mainFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		txtcodeliv = new JTextField();
		txtcodeliv.setEditable(false);
		txtcodeliv.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcodeliv.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtcodeliv.setColumns(10);
		txtcodeliv.setBounds(245, 117, 231, 30);
		panel_3.add(txtcodeliv);
		
		txtcostmel = new JTextField();
		txtcostmel.setEditable(false);
		txtcostmel.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcostmel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtcostmel.setColumns(10);
		txtcostmel.setBounds(245, 64, 231, 30);
		panel_3.add(txtcostmel);
		
		txtcodrink = new JTextField();
		txtcodrink.setEditable(false);
		txtcodrink.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcodrink.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtcodrink.setColumns(10);
		txtcodrink.setBounds(245, 11, 231, 30);
		panel_3.add(txtcodrink);
		
		JLabel lblNewLabel_1_4 = new JLabel("Cost of Drink");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(27, 8, 103, 42);
		panel_3.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(27, 61, 103, 42);
		panel_3.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(20, 114, 110, 42);
		panel_3.add(lblNewLabel_1_2_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(143, 188, 143), 3));
		panel_3_1.setBounds(557, 335, 344, 187);
		mainFrame.getContentPane().add(panel_3_1);
		panel_3_1.setLayout(null);
		
		txttotal = new JTextField();
		txttotal.setEditable(false);
		txttotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txttotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txttotal.setColumns(10);
		txttotal.setBounds(100, 130, 218, 30);
		panel_3_1.add(txttotal);
		
		txtstotal = new JTextField();
		txtstotal.setEditable(false);
		txtstotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtstotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtstotal.setColumns(10);
		txtstotal.setBounds(100, 77, 218, 30);
		panel_3_1.add(txtstotal);
		
		txttax = new JTextField();
		txttax.setEditable(false);
		txttax.setHorizontalAlignment(SwingConstants.RIGHT);
		txttax.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txttax.setColumns(10);
		txttax.setBounds(100, 24, 218, 30);
		panel_3_1.add(txttax);
		
		JLabel lblNewLabel_1_5 = new JLabel("Tax");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(64, 17, 26, 42);
		panel_3_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Sub Total");
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_3.setBounds(20, 70, 70, 42);
		panel_3_1.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Total");
		lblNewLabel_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2_2.setBounds(47, 123, 43, 42);
		panel_3_1.add(lblNewLabel_1_2_2);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(new Color(143, 188, 143), 3));
		panel_3_2.setBounds(42, 533, 1281, 64);
		mainFrame.getContentPane().add(panel_3_2);
		panel_3_2.setLayout(null);
		
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(cbodrink.getSelectedItem().toString().isEmpty()|| txtchib.getText().isEmpty()||txtchikbmeal.getText().isEmpty()||txtcheeseb.getText().isEmpty()||txtqty.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please the chicken field,\nthe drink field, \nand the quantity fields are required");
				}else {
				
					double ChicBurger = Double.parseDouble(txtchib.getText());
					double iChicBurger = 2.39;
					double Burger;
					Burger = (ChicBurger * iChicBurger);
					String pMeal = String.format("%.2f", Burger);
					txtcodeliv.setText(pMeal);
					
					double ChicBurgerMeal = Double.parseDouble(	txtchikbmeal.getText());
					double iChicBurgerMeal = 4.39;
					double BurgerMeal;
					BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal);
					String cbMeal = String.format("%.2f", BurgerMeal + Burger);
					txtcodrink.setText(cbMeal);
					double CheeseBurger = Double.parseDouble(txtcheeseb.getText());
					double CheeseBurgerPrice = 3.39;
					double CheeseBurgerMeal;
					CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice);
					String cheese = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger);
					txtcostmel.setText(cheese);
					
					//.......................Home Delivery.............................................
					double iDelivery =3.39;
					if(chckhomedeliver.isSelected())
					{
						String pDelivery = String.format("%.2f", iDelivery);
						txtcodeliv.setText(pDelivery);
					}
					else
					{
						txtcodeliv.setText("0");
					}			
					
					//............................Drinks..............................................
					
					
					double Drinks = Double.parseDouble(txtqty.getText());
					double Fanta = 1.0 * Drinks;
					double Coke = 1.0 * Drinks;
					double Malt = 4 * Drinks;
					double Apple_Juice = 1.99 * Drinks;
					
					if (cbodrink.getSelectedItem().equals("Apple Juice"))
					{
						String cApple_Juice = String.format("%.2f", Apple_Juice);
						txtcodeliv.setText(cApple_Juice);
					}
					if (cbodrink.getSelectedItem().equals("Fanta"))
					{
						String cFanta = String.format("%.2f", Fanta);
						txtcodeliv.setText(cFanta);
					}
					if (cbodrink.getSelectedItem().equals("Coke"))
					{
						String cCoke = String.format("%.2f", Coke);
						txtcodeliv.setText(cCoke);
					}
					if (cbodrink.getSelectedItem().equals("Malt"))
					{
						String cMalt = String.format("%.2f", Malt);
						txtcodeliv.setText(cMalt);
					}
					if (cbodrink.getSelectedItem().equals("Select a drink"))
					{
						txtcodeliv.setText("0.00");
					}
					
			
				double cTotal1 = Double.parseDouble(txtcodrink.getText());
				double cTotal2 = Double.parseDouble(txtcostmel.getText());
				double cTotal3 = Double.parseDouble(txtcodeliv.getText());
				double AllTotal =(cTotal1 + cTotal2 + cTotal3)/100;
				
				if (chckbxTax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					txttax.setText(iTotal);
				}
				else {
					txttax.setText("0");
				}
								
				//======================================Total========================================
				double cTotal4 = Double.parseDouble(txttax.getText());
				
				double subTotal = (cTotal1 + cTotal2 + cTotal3);
				String isubTotal = String.format("GHc%.2f",  subTotal);
				txtstotal.setText(isubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("GHc%.2f", allTotal);
				txttotal.setText(iTotal);
				
				String iTaxTotal = String.format("GHc%.2f", cTotal4);
				
				txttax.setText(iTaxTotal);
				
				
String add= "INSERT INTO danycustom(Chicken_Burger,Chicken_Burger_Meal,Cheese_Burger,Drink,Quantity,Cost_Drink,Cost_Meal,Cost_Delivery,Tax,Sub_Total,Total) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
				
				
				try {
					
					 pst = conn.prepareStatement(add);
					
					pst.setString(1, txtchib.getText());
					pst.setString(2, txtchikbmeal.getText());
					pst.setString(3, txtcheeseb.getText());
					pst.setString(4, (String) cbodrink.getSelectedItem());
					pst.setString(5, txtqty .getText());
					pst.setString(6,txtcodrink.getText());
					pst.setString(7,txtcostmel.getText());
					pst.setString(8,txtcodeliv.getText());
					pst.setString(9, txttax.getText());
					pst.setString(10,  txtstotal.getText());
					pst.setString(11, txttotal.getText());
					
										
					pst.execute();
				
					pst.close();
					JOptionPane.showMessageDialog(null, "Transaction was successful","Restaurant management System", JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showConfirmDialog(null, )
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
				
				txtArea.append("              RESTAURANT MANAGEMENT SYSTEM\n"
						+ "\n=======================Item purchased==============================\n"
						+ "\nChicken Burger:\t "     +txtchib.getText()
						+ "\nBurger Meal:\t"         +txtchikbmeal.getText()
						+ "\nCheese Burger:\t"       +txtcheeseb.getText()
						+ "\nDrink:\t"               +cbodrink.getSelectedItem()
						+ "\nQuantity:\t"            +txtqty.getText()
						+ "\nCost of drink:\t" 		 +txtcodrink.getText()
						+ "\nCost of meal:\t"        +txtcostmel.getText()
						+ "\nCost of deivery:\t"     +txtcodeliv.getText()
						+ "\n===================Total transaction=================\n"
						+ "\nTax:\t"                 +txttax.getText()
						+ "\nSub Total:\t"           +txtstotal .getText()
						+ "\nTotal:\t"               +txttotal.getText()					
						+ "\n=======================================================\n"													
						+ "\n");
			
				
				}
				
				
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTotal.setBounds(243, 533, 89, 42);
		panel_3_2.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(cbodrink.getSelectedItem().toString().isEmpty()|| txtchib.getText().isEmpty()||txtchikbmeal.getText().isEmpty()||txtcheeseb.getText().isEmpty()||txtqty.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please the chicken field,\nthe drink field, \nand the quantity fields are required");
				}else {
					txtArea.append("              RESTAURANT MANAGEMENT SYSTEM\n"
							+ "\n=======================Item purchased==============================\n"
							+ "\nChicken Burger:\t "     +txtchib.getText()
							+ "\nBurger Meal:\t"         +txtchikbmeal.getText()
							+ "\nCheese Burger:\t"       +txtcheeseb.getText()
							+ "\nDrink:\t"               +cbodrink.getSelectedItem()
							+ "\nQuantity:\t"            +txtqty.getText()
							+ "\nCost of drink:\t" 		 +txtcodrink.getText()
							+ "\nCost of meal:\t"        +txtcostmel.getText()
							+ "\nCost of deivery:\t"     +txtcodeliv.getText()
							+ "\n===================Total transaction=================\n"
							+ "\nTax:\t"                 +txttax.getText()
							+ "\nSub Total:\t"           +txtstotal .getText()
							+ "\nTotal:\t"               +txttotal.getText()					
							+ "\n=======================================================\n"													
							+ "\n");
					
				if(txtArea.getText().isBlank()) {
					
					
					JOptionPane.showMessageDialog(null, "There is nothing to print now\nMake sure all transactions are entered correctly");
				}else {
					
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page (0, number, integer)");
				try{
					txtArea.print();
					
				}catch(java.awt.print.PrinterException ev) {
					System.err.format("no printer found", ev.getMessage());
				}
				
				}
				}
			}
		});
		btnReceipt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReceipt.setBounds(1005, 533, 89, 42);
		panel_3_2.add(btnReceipt);
		
		JButton btnReset_1 = new JButton("Reset");
		btnReset_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(JOptionPane.showConfirmDialog(mainFrame, "You are about to clear all fields to default","Restaurant management System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					JTextField temp = null;
					for(Component c:panel.getComponents())  {
						if(c.getClass().toString().contains("javax.swing.JTextField")) {
							temp=(JTextField)c;
							temp.setText(null);
						}
					}
					for(Component c:panel_3.getComponents())  {
						if(c.getClass().toString().contains("javax.swing.JTextField")) {
							temp=(JTextField)c;
							temp.setText(null);
						}
					}
					for(Component c:panel_3_1.getComponents())  {
						if(c.getClass().toString().contains("javax.swing.JTextField")) {
							temp=(JTextField)c;
							temp.setText(null);
						}
					}
					for(Component c:panel_1.getComponents())  {
						if(c.getClass().toString().contains("javax.swing.JTextField")) {
							temp=(JTextField)c;
							temp.setText(null);
						}
					}
					cbodrink.setSelectedIndex(0);
					cbocountry.setSelectedIndex(0);
					txtArea.setText("");
					}
																								
												
			}
		});
		btnReset_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset_1.setBounds(421, 535, 89, 42);
		panel_3_2.add(btnReset_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
if(JOptionPane.showConfirmDialog(mainFrame, "Confirm if you want to exit the application","Restaurant management System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					System.exit(0);
					}
								
				
				
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExit.setBounds(594, 534, 89, 42);
		panel_3_2.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(306, 5, 865, 40);
		panel_3_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JButton btnResetTheReceipt = new JButton("Reset ");
		btnResetTheReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtArea.append("RESTAURANT MANAGEMENT SYSTEM\n"
						);
				txtArea.setText("");
			}
		});
		btnResetTheReceipt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnResetTheReceipt.setBounds(1146, 533, 89, 42);
		panel_3_2.add(btnResetTheReceipt);
	}
}
