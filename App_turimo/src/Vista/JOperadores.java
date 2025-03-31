package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Conexion;
import Modelo.Operadores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtDireccion;
	private JTextField TxtCorreopersonal;
	private JTextField TxtTelefono;
	private JTextField TxtApellidos;
	private JTextField TxtNombres;
	private JTextField TxtNumerodocumento;
	private JTextField TxtTipodocumento;
	private JTextField txtidtransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOperadores frame = new JOperadores();
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
	public JOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de documento");
		lblNewLabel.setBounds(63, 14, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de documento");
		lblNewLabel_1.setBounds(63, 39, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres ");
		lblNewLabel_1_1.setBounds(63, 64, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" Apellidos");
		lblNewLabel_1_1_1.setBounds(63, 89, 108, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefono");
		lblNewLabel_1_1_1_1.setBounds(63, 118, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Correo personal");
		lblNewLabel_1_1_1_1_1.setBounds(63, 146, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Direccion");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(63, 171, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setColumns(10);
		TxtDireccion.setBounds(231, 171, 86, 20);
		contentPane.add(TxtDireccion);
		
		TxtCorreopersonal = new JTextField();
		TxtCorreopersonal.setColumns(10);
		TxtCorreopersonal.setBounds(231, 143, 86, 20);
		contentPane.add(TxtCorreopersonal);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(231, 115, 86, 20);
		contentPane.add(TxtTelefono);
		
		TxtApellidos = new JTextField();
		TxtApellidos.setColumns(10);
		TxtApellidos.setBounds(231, 86, 86, 20);
		contentPane.add(TxtApellidos);
		
		TxtNombres = new JTextField();
		TxtNombres.setColumns(10);
		TxtNombres.setBounds(231, 61, 86, 20);
		contentPane.add(TxtNombres);
		
		TxtNumerodocumento = new JTextField();
		TxtNumerodocumento.setColumns(10);
		TxtNumerodocumento.setBounds(231, 36, 86, 20);
		contentPane.add(TxtNumerodocumento);
		
		TxtTipodocumento = new JTextField();
		TxtTipodocumento.setColumns(10);
		TxtTipodocumento.setBounds(231, 11, 86, 20);
		contentPane.add(TxtTipodocumento);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Operadores ope = new Operadores();getWarningString();
			ope.create(TxtTipodocumento.getText(),TxtNumerodocumento.getText(), TxtNombres.getText(), TxtApellidos.getText(),TxtTelefono.getText(),TxtCorreopersonal.getText(),TxtDireccion.getText(),Integer.parseInt(txtidtransporte.getText()));
			
			}
		});
		btnGuardar.setBounds(155, 262, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("idtransporte");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(63, 205, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		txtidtransporte = new JTextField();
		txtidtransporte.setColumns(10);
		txtidtransporte.setBounds(231, 202, 86, 20);
		contentPane.add(txtidtransporte);
	}

}
