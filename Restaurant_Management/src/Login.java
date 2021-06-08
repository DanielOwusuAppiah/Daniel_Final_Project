import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Login {

	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField pass;
	
	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setType(Type.POPUP);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.setBounds(100, 100, 350, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conn=dbconnection.dbconn();
				String log="SELECT * FROM users WHERE UserName=? and Password=? ";
				try {
					
					pst=conn.prepareStatement(log);
					
					pst.setString(1, txtusername.getText());
					pst.setString(2,pass.getText());
					rs=pst.executeQuery();
					if(txtusername.getText().isBlank()||pass.getText().isBlank()) {
						JOptionPane.showMessageDialog(null, "All fields require input");
					}
					else {
						
					
					if(rs.next()) {
					 
						
						JOptionPane.showMessageDialog(null, "You have successfully login!");//+""+ rs.getString("Usertype"));
						MainInter pa =  new MainInter();
						pa.mainFrame.setVisible(true);
						frame.setVisible(false);
						//if(pa.mainFrame.equals())
					}
					 else {
						JOptionPane.showMessageDialog(null, "Wrong Username or password, please try again");//+""+ rs.getString("Usertype"));
					}
					}
					pst.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(55, 251, 79, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtusername.setText("");
				pass.setText("");
			//	cbousertyp.getSelectedItem();
			}
		});
		btnreset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnreset.setBounds(196, 251, 79, 33);
		frame.getContentPane().add(btnreset);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(34, 57, 85, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(34, 120, 85, 33);
		frame.getContentPane().add(lblPassword);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtusername.setBounds(129, 58, 159, 33);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Times New Roman", Font.BOLD, 30));
		pass.setBounds(127, 120, 161, 31);
		frame.getContentPane().add(pass);
		
		JLabel lblEnterYourCredentials = new JLabel("Enter your credentials here to login");
		lblEnterYourCredentials.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEnterYourCredentials.setBounds(38, 13, 250, 33);
		frame.getContentPane().add(lblEnterYourCredentials);
	}
}
