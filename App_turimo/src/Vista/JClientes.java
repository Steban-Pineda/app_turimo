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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

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
	private JTextField txtidcliente;
	Clientes cli = new Clientes ();
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
		setBounds(100, 100, 541, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de documento");
		lblNewLabel.setBounds(55, 102, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de documento");
		lblNewLabel_1.setBounds(55, 127, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres ");
		lblNewLabel_1_1.setBounds(55, 152, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" Apellidos");
		lblNewLabel_1_1_1.setBounds(55, 177, 108, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		TxtApellidos = new JTextField();
		TxtApellidos.setColumns(10);
		TxtApellidos.setBounds(235, 174, 86, 20);
		contentPane.add(TxtApellidos);
		
		TxtNombres = new JTextField();
		TxtNombres.setColumns(10);
		TxtNombres.setBounds(235, 149, 86, 20);
		contentPane.add(TxtNombres);
		
		TxtNumerodocumento = new JTextField();
		TxtNumerodocumento.setColumns(10);
		TxtNumerodocumento.setBounds(235, 124, 86, 20);
		contentPane.add(TxtNumerodocumento);
		
		TxtTipodocumento = new JTextField();
		TxtTipodocumento.setColumns(10);
		TxtTipodocumento.setBounds(235, 99, 86, 20);
		contentPane.add(TxtTipodocumento);
		
		TxtEPS = new JTextField();
		TxtEPS.setColumns(10);
		TxtEPS.setBounds(235, 205, 86, 20);
		contentPane.add(TxtEPS);
		
		TxtAlergias = new JTextField();
		TxtAlergias.setColumns(10);
		TxtAlergias.setBounds(235, 236, 86, 20);
		contentPane.add(TxtAlergias);
		
		TxtFechanacimiento = new JTextField();
		TxtFechanacimiento.setColumns(10);
		TxtFechanacimiento.setBounds(235, 270, 86, 20);
		contentPane.add(TxtFechanacimiento);
		
		TxtEstadocivil = new JTextField();
		TxtEstadocivil.setColumns(10);
		TxtEstadocivil.setBounds(235, 301, 86, 20);
		contentPane.add(TxtEstadocivil);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(235, 331, 86, 20);
		contentPane.add(TxtTelefono);
		
		TxtCorreo = new JTextField();
		TxtCorreo.setColumns(10);
		TxtCorreo.setBounds(235, 362, 86, 20);
		contentPane.add(TxtCorreo);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setColumns(10);
		TxtDireccion.setBounds(235, 394, 86, 20);
		contentPane.add(TxtDireccion);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" EPS");
		lblNewLabel_1_1_1_1.setBounds(55, 208, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Alergias");
		lblNewLabel_1_1_1_2.setBounds(55, 239, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel(" Fecha nacimiento");
		lblNewLabel_1_1_1_3.setBounds(55, 270, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Estado civil");
		lblNewLabel_1_1_1_4.setBounds(55, 304, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Telefono");
		lblNewLabel_1_1_1_5.setBounds(55, 334, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_6 = new JLabel("Correo");
		lblNewLabel_1_1_1_6.setBounds(55, 365, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_6);
		
		JLabel lblNewLabel_1_1_1_7 = new JLabel("Direccion");
		lblNewLabel_1_1_1_7.setBounds(55, 397, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_7);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cli.create(TxtTipodocumento.getText(), TxtNumerodocumento.getText(), TxtNombres.getText(), TxtApellidos.getText(), TxtEPS.getText(), TxtAlergias.getText(),TxtFechanacimiento.getText(),TxtEstadocivil.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtDireccion.getText());
			}
		});
		btnGuardar.setBounds(279, 503, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_2 = new JLabel("Id cliente");
		lblNewLabel_2.setBounds(417, 74, 108, 14);
		contentPane.add(lblNewLabel_2);
		
		txtidcliente = new JTextField();
		txtidcliente.setColumns(10);
		txtidcliente.setBounds(407, 99, 86, 20);
		contentPane.add(txtidcliente);
		
		JButton btndelete = new JButton("");
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cli.delete(Integer.parseInt(txtidcliente.getText()));
			}
		});
		btndelete.setBounds(431, 127, 38, 51);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_3 = new JLabel("Gestion de clientes");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(203, 37, 181, 20);
		contentPane.add(lblNewLabel_3);
		
		JButton btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cli.readOne(Integer.parseInt(txtidcliente.getText()), TxtTipodocumento, TxtNumerodocumento, TxtNombres, TxtApellidos, TxtEPS, TxtAlergias, TxtFechanacimiento, TxtEstadocivil, TxtTelefono, TxtCorreo, TxtDireccion);
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\511943_find_loupe_magnifying glass_search_icon.png"));
		btnconsultar.setBounds(373, 143, 48, 23);
		btnconsultar.setContentAreaFilled(false);
		contentPane.add(btnconsultar);
		
		JButton btnactializar = new JButton("");
		btnactializar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cli.update(Integer.parseInt(txtidcliente.getText()), TxtTipodocumento.getText(), TxtNumerodocumento.getText(), TxtNombres.getText(), TxtApellidos.getText(), TxtEPS.getText(), TxtAlergias.getText(),TxtFechanacimiento.getText(),TxtEstadocivil.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtDireccion.getText());
			}
		});
		btnactializar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\172618_update_icon.png"));
		btnactializar.setBounds(477, 134, 48, 35);
		btnactializar.setContentAreaFilled(false);
		contentPane.add(btnactializar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz cli = new Interfaz();
				cli.setVisible(true);
			}
		});
		btnAtras.setBounds(124, 503, 89, 23);
		contentPane.add(btnAtras);
	}
}
