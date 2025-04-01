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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

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
	private JTextField txtidoperadores;
	Operadores ope = new Operadores();
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
		setBounds(100, 100, 532, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de documento");
		lblNewLabel.setBounds(63, 86, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de documento");
		lblNewLabel_1.setBounds(63, 111, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres ");
		lblNewLabel_1_1.setBounds(63, 136, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" Apellidos");
		lblNewLabel_1_1_1.setBounds(63, 161, 108, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefono");
		lblNewLabel_1_1_1_1.setBounds(63, 190, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Correo personal");
		lblNewLabel_1_1_1_1_1.setBounds(63, 218, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Direccion");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(63, 243, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setColumns(10);
		TxtDireccion.setBounds(231, 246, 86, 20);
		contentPane.add(TxtDireccion);
		
		TxtCorreopersonal = new JTextField();
		TxtCorreopersonal.setColumns(10);
		TxtCorreopersonal.setBounds(231, 218, 86, 20);
		contentPane.add(TxtCorreopersonal);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(231, 190, 86, 20);
		contentPane.add(TxtTelefono);
		
		TxtApellidos = new JTextField();
		TxtApellidos.setColumns(10);
		TxtApellidos.setBounds(231, 161, 86, 20);
		contentPane.add(TxtApellidos);
		
		TxtNombres = new JTextField();
		TxtNombres.setColumns(10);
		TxtNombres.setBounds(231, 136, 86, 20);
		contentPane.add(TxtNombres);
		
		TxtNumerodocumento = new JTextField();
		TxtNumerodocumento.setColumns(10);
		TxtNumerodocumento.setBounds(231, 111, 86, 20);
		contentPane.add(TxtNumerodocumento);
		
		TxtTipodocumento = new JTextField();
		TxtTipodocumento.setColumns(10);
		TxtTipodocumento.setBounds(231, 86, 86, 20);
		contentPane.add(TxtTipodocumento);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			ope.create(TxtTipodocumento.getText(),TxtNumerodocumento.getText(), TxtNombres.getText(), TxtApellidos.getText(),TxtTelefono.getText(),TxtCorreopersonal.getText(),TxtDireccion.getText(),Integer.parseInt(txtidtransporte.getText()));
			
			}
		});
		btnGuardar.setBounds(168, 343, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("idtransporte");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(63, 277, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		txtidtransporte = new JTextField();
		txtidtransporte.setColumns(10);
		txtidtransporte.setBounds(231, 277, 86, 20);
		contentPane.add(txtidtransporte);
		
		JLabel lblNewLabel_2 = new JLabel("idoperadores");
		lblNewLabel_2.setBounds(365, 83, 108, 14);
		contentPane.add(lblNewLabel_2);
		
		txtidoperadores = new JTextField();
		txtidoperadores.setColumns(10);
		txtidoperadores.setBounds(365, 108, 86, 20);
		contentPane.add(txtidoperadores);
		
		JButton btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.delete(Integer.parseInt(txtidoperadores.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.setBounds(380, 147, 56, 57);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_2_1 = new JLabel("Gestion de operadores");
		lblNewLabel_2_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(168, 24, 190, 20);
		contentPane.add(lblNewLabel_2_1);
	}

}
