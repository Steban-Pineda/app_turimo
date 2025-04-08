package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Compañia;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class JCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtNombre;
	private JTextField TxtDireccion;
	private JTextField TxtTelefono;
	private JTextField TxtCorreo;
	private JTextField TxtWeb;
	private JLabel lblNewLabel;
	private JTextField txtidcompañia;
	Compañia com = new Compañia();
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1_3_2;
	private JTextField txtconsultar;
	private JButton btnconsultar;
	private JButton btnNewButton;
	private JButton btnAtras;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCompañia frame = new JCompañia();
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
	public JCompañia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(38, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Direccion");
		lblNewLabel_1_1.setBounds(38, 130, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Telefono");
		lblNewLabel_1_2.setBounds(38, 155, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Correo ");
		lblNewLabel_1_3.setBounds(38, 186, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Web");
		lblNewLabel_1_3_1.setBounds(38, 211, 46, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		TxtNombre = new JTextField();
		TxtNombre.setColumns(10);
		TxtNombre.setBounds(219, 102, 86, 20);
		contentPane.add(TxtNombre);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setColumns(10);
		TxtDireccion.setBounds(219, 130, 86, 20);
		contentPane.add(TxtDireccion);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(219, 155, 86, 20);
		contentPane.add(TxtTelefono);
		
		TxtCorreo = new JTextField();
		TxtCorreo.setColumns(10);
		TxtCorreo.setBounds(219, 183, 86, 20);
		contentPane.add(TxtCorreo);
		
		TxtWeb = new JTextField();
		TxtWeb.setColumns(10);
		TxtWeb.setBounds(219, 208, 86, 20);
		contentPane.add(TxtWeb);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
			com.create(TxtNombre.getText(),TxtDireccion.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtWeb.getText());
			}
		});
		btnGuardar.setBounds(241, 312, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("idcompañia");
		lblNewLabel.setBounds(371, 102, 68, 14);
		contentPane.add(lblNewLabel);
		
		txtidcompañia = new JTextField();
		txtidcompañia.setColumns(10);
		txtidcompañia.setBounds(355, 127, 86, 20);
		contentPane.add(txtidcompañia);
		
		JButton btndelete = new JButton("");
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.delete(Integer.parseInt(txtidcompañia.getText()));
				
			}
		});
		btndelete.setBounds(371, 155, 46, 49);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		lblNewLabel_2 = new JLabel("Gestion de compañia");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(171, 45, 190, 20);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_1_3_2 = new JLabel("consultar");
		lblNewLabel_1_3_2.setBounds(38, 247, 46, 14);
		contentPane.add(lblNewLabel_1_3_2);
		
		txtconsultar = new JTextField();
		txtconsultar.setColumns(10);
		txtconsultar.setBounds(219, 244, 86, 20);
		contentPane.add(txtconsultar);
		
		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.readOne(Integer.parseInt(txtidcompañia.getText()), TxtNombre, TxtDireccion, TxtTelefono, TxtCorreo, TxtWeb);
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\511943_find_loupe_magnifying glass_search_icon.png"));
		btnconsultar.setBounds(335, 155, 46, 45);
		btnconsultar.setContentAreaFilled(false);
		contentPane.add(btnconsultar);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.update(Integer.parseInt(txtidcompañia.getText()), TxtNombre.getText(),TxtDireccion.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtWeb.getText());
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\172618_update_icon.png"));
		btnNewButton.setBounds(427, 155, 53, 45);
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz com = new Interfaz();
				com.setVisible(true);
			}
		});
		btnAtras.setBounds(116, 312, 89, 23);
		contentPane.add(btnAtras);
	}
}
