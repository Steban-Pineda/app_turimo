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

public class JCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtNombre;
	private JTextField TxtDireccion;
	private JTextField TxtTelefono;
	private JTextField TxtCorreo;
	private JTextField TxtWeb;

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
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(38, 66, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Direccion");
		lblNewLabel_1_1.setBounds(38, 94, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Telefono");
		lblNewLabel_1_2.setBounds(38, 119, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Correo ");
		lblNewLabel_1_3.setBounds(38, 150, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Web");
		lblNewLabel_1_3_1.setBounds(38, 175, 46, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		TxtNombre = new JTextField();
		TxtNombre.setColumns(10);
		TxtNombre.setBounds(219, 66, 86, 20);
		contentPane.add(TxtNombre);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setColumns(10);
		TxtDireccion.setBounds(219, 94, 86, 20);
		contentPane.add(TxtDireccion);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(219, 119, 86, 20);
		contentPane.add(TxtTelefono);
		
		TxtCorreo = new JTextField();
		TxtCorreo.setColumns(10);
		TxtCorreo.setBounds(219, 147, 86, 20);
		contentPane.add(TxtCorreo);
		
		TxtWeb = new JTextField();
		TxtWeb.setColumns(10);
		TxtWeb.setBounds(219, 172, 86, 20);
		contentPane.add(TxtWeb);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Compañia com = new Compañia();
			com.create(TxtNombre.getText(),TxtDireccion.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtWeb.getText());
			}
		});
		btnGuardar.setBounds(152, 245, 89, 23);
		contentPane.add(btnGuardar);
	}

}
