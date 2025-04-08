package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Promotor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class JPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtuser;
	Promotor login = new Promotor();
	private JPasswordField txtpass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal frame = new JPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JPrincipal() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Control de acceso");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(131, 31, 217, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(45, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pass");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(45, 154, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtuser = new JTextField();
		txtuser.setBounds(45, 116, 327, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		JButton btnacceder = new JButton("Acceder");
		btnacceder.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnacceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz it =  new Interfaz();
				it.setVisible(true);
				login.ControlAcceso(txtuser.getText(), txtpass.getText());
				
			}
		});
		btnacceder.setBounds(158, 240, 89, 23);
		contentPane.add(btnacceder);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(45, 169, 327, 20);
		contentPane.add(txtpass);
	}
}
