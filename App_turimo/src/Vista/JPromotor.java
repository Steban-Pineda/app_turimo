package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Promotor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtTipodocumento;
	private JTextField TxtNumerodocumento;
	private JTextField TxtNombres;
	private JTextField TxtApellidos;
	private JTextField TxtTelefono;
	private JTextField TxtCorreopersonal;
	private JTextField TxtCorreocorp;
	private JTextField TxtDireccion;
	private JTextField TxtFechanacimiento;
	private JTextField txtidpromotores;
	Promotor pro = new Promotor();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPromotor frame = new JPromotor();
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
	public JPromotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de documento");
		lblNewLabel.setBounds(78, 55, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de documento");
		lblNewLabel_1.setBounds(78, 80, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres ");
		lblNewLabel_1_1.setBounds(78, 105, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" Apellidos");
		lblNewLabel_1_1_1.setBounds(78, 130, 108, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefono");
		lblNewLabel_1_1_1_1.setBounds(78, 159, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Correo personal");
		lblNewLabel_1_1_1_1_1.setBounds(78, 187, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Correo corp");
		lblNewLabel_1_1_1_1_1_1.setBounds(78, 218, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Direccion");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(78, 243, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Fecha nacimiento");
		lblNewLabel_1_1_1_1_1_1_2.setBounds(78, 268, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2);
		
		TxtTipodocumento = new JTextField();
		TxtTipodocumento.setBounds(246, 52, 86, 20);
		contentPane.add(TxtTipodocumento);
		TxtTipodocumento.setColumns(10);
		
		TxtNumerodocumento = new JTextField();
		TxtNumerodocumento.setColumns(10);
		TxtNumerodocumento.setBounds(246, 77, 86, 20);
		contentPane.add(TxtNumerodocumento);
		
		TxtNombres = new JTextField();
		TxtNombres.setColumns(10);
		TxtNombres.setBounds(246, 102, 86, 20);
		contentPane.add(TxtNombres);
		
		TxtApellidos = new JTextField();
		TxtApellidos.setColumns(10);
		TxtApellidos.setBounds(246, 127, 86, 20);
		contentPane.add(TxtApellidos);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(246, 156, 86, 20);
		contentPane.add(TxtTelefono);
		
		TxtCorreopersonal = new JTextField();
		TxtCorreopersonal.setColumns(10);
		TxtCorreopersonal.setBounds(246, 184, 86, 20);
		contentPane.add(TxtCorreopersonal);
		
		TxtCorreocorp = new JTextField();
		TxtCorreocorp.setColumns(10);
		TxtCorreocorp.setBounds(246, 215, 86, 20);
		contentPane.add(TxtCorreocorp);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setColumns(10);
		TxtDireccion.setBounds(246, 240, 86, 20);
		contentPane.add(TxtDireccion);
		
		TxtFechanacimiento = new JTextField();
		TxtFechanacimiento.setColumns(10);
		TxtFechanacimiento.setBounds(246, 265, 86, 20);
		contentPane.add(TxtFechanacimiento);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				pro.create(TxtTipodocumento.getText(), TxtNumerodocumento.getText(),TxtNombres.getText(),TxtApellidos.getText(),TxtTelefono.getText(),TxtCorreopersonal.getText(),TxtCorreocorp.getText(),TxtDireccion.getText(),TxtFechanacimiento.getText());
				
			}
		});
		btnGuardar.setBounds(151, 349, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdpromotores = new JLabel("idpromotores");
		lblIdpromotores.setBounds(382, 55, 108, 14);
		contentPane.add(lblIdpromotores);
		
		txtidpromotores = new JTextField();
		txtidpromotores.setColumns(10);
		txtidpromotores.setBounds(382, 77, 86, 20);
		contentPane.add(txtidpromotores);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro.delete(Integer.parseInt(txtidpromotores.getText()));
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btnNewButton.setBounds(403, 105, 48, 52);
		contentPane.add(btnNewButton);
	}

}
