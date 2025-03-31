package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import Modelo.Agencia;
import Modelo.Compañia;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class JAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtDireccion;
	private JTextField TxtNombre;
	private JTextField TxtTelefono;
	private JTextField TxtCorreo;
	private JTextField TxtWeb;
	private JTextField txtidcompañia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAgencia frame = new JAgencia();
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
	public JAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setBounds(288, 95, 86, 20);
		contentPane.add(TxtDireccion);
		TxtDireccion.setColumns(10);
		
		TxtNombre = new JTextField();
		TxtNombre.setBounds(288, 64, 86, 20);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(288, 126, 86, 20);
		contentPane.add(TxtTelefono);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			
			}
		});
		lblNewLabel.setBounds(34, 70, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(34, 101, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo electronico");
		lblNewLabel_2.setBounds(34, 156, 106, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefono");
		lblNewLabel_2_1.setBounds(34, 132, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Web");
		lblNewLabel_2_1_1.setBounds(34, 195, 46, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		TxtCorreo = new JTextField();
		TxtCorreo.setColumns(10);
		TxtCorreo.setBounds(288, 157, 86, 20);
		contentPane.add(TxtCorreo);
		
		TxtWeb = new JTextField();
		TxtWeb.setColumns(10);
		TxtWeb.setBounds(288, 189, 86, 20);
		contentPane.add(TxtWeb);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Agencia age = new Agencia();
				age.create(TxtNombre.getText(),TxtDireccion.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtWeb.getText(), Integer.parseInt(txtidcompañia.getText()));
				
			}
		});
		btnGuardar.setBounds(153, 281, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("idcompañia");
		lblNewLabel_2_1_1_1.setBounds(34, 232, 86, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txtidcompañia = new JTextField();
		txtidcompañia.setColumns(10);
		txtidcompañia.setBounds(288, 229, 86, 20);
		contentPane.add(txtidcompañia);
	}
}
