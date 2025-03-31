package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Clientes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtApellidos;
	private JTextField TxtNombres;
	private JTextField TxtNumerodocumento;
	private JTextField TxtTipodocumento;
	private JTextField TxtEPS;
	private JTextField TxtAlergias;
	private JTextField TxtFechanacimiento;
	private JTextField TxtEstadocivil;
	private JTextField TxtTelefono;
	private JTextField TxtCorreo;
	private JTextField TxtDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JClientes frame = new JClientes();
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
	public JClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de documento");
		lblNewLabel.setBounds(55, 14, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de documento");
		lblNewLabel_1.setBounds(55, 39, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres ");
		lblNewLabel_1_1.setBounds(55, 64, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" Apellidos");
		lblNewLabel_1_1_1.setBounds(55, 89, 108, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		TxtApellidos = new JTextField();
		TxtApellidos.setColumns(10);
		TxtApellidos.setBounds(235, 86, 86, 20);
		contentPane.add(TxtApellidos);
		
		TxtNombres = new JTextField();
		TxtNombres.setColumns(10);
		TxtNombres.setBounds(235, 61, 86, 20);
		contentPane.add(TxtNombres);
		
		TxtNumerodocumento = new JTextField();
		TxtNumerodocumento.setColumns(10);
		TxtNumerodocumento.setBounds(235, 36, 86, 20);
		contentPane.add(TxtNumerodocumento);
		
		TxtTipodocumento = new JTextField();
		TxtTipodocumento.setColumns(10);
		TxtTipodocumento.setBounds(235, 11, 86, 20);
		contentPane.add(TxtTipodocumento);
		
		TxtEPS = new JTextField();
		TxtEPS.setColumns(10);
		TxtEPS.setBounds(235, 117, 86, 20);
		contentPane.add(TxtEPS);
		
		TxtAlergias = new JTextField();
		TxtAlergias.setColumns(10);
		TxtAlergias.setBounds(235, 148, 86, 20);
		contentPane.add(TxtAlergias);
		
		TxtFechanacimiento = new JTextField();
		TxtFechanacimiento.setColumns(10);
		TxtFechanacimiento.setBounds(235, 182, 86, 20);
		contentPane.add(TxtFechanacimiento);
		
		TxtEstadocivil = new JTextField();
		TxtEstadocivil.setColumns(10);
		TxtEstadocivil.setBounds(235, 213, 86, 20);
		contentPane.add(TxtEstadocivil);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(235, 243, 86, 20);
		contentPane.add(TxtTelefono);
		
		TxtCorreo = new JTextField();
		TxtCorreo.setColumns(10);
		TxtCorreo.setBounds(235, 274, 86, 20);
		contentPane.add(TxtCorreo);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setColumns(10);
		TxtDireccion.setBounds(235, 306, 86, 20);
		contentPane.add(TxtDireccion);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" EPS");
		lblNewLabel_1_1_1_1.setBounds(55, 120, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Alergias");
		lblNewLabel_1_1_1_2.setBounds(55, 151, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel(" Fecha nacimiento");
		lblNewLabel_1_1_1_3.setBounds(55, 182, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Estado civil");
		lblNewLabel_1_1_1_4.setBounds(55, 216, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Telefono");
		lblNewLabel_1_1_1_5.setBounds(55, 246, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_6 = new JLabel("Correo");
		lblNewLabel_1_1_1_6.setBounds(55, 277, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_6);
		
		JLabel lblNewLabel_1_1_1_7 = new JLabel("Direccion");
		lblNewLabel_1_1_1_7.setBounds(55, 309, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_7);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clientes cli = new Clientes ();
				cli.create(TxtTipodocumento.getText(), TxtNumerodocumento.getText(), TxtNombres.getText(), TxtApellidos.getText(), TxtEPS.getText(), TxtAlergias.getText(),TxtFechanacimiento.getText(),TxtEstadocivil.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtDireccion.getText());
			}
		});
		btnGuardar.setBounds(151, 363, 89, 23);
		contentPane.add(btnGuardar);
	}

}
