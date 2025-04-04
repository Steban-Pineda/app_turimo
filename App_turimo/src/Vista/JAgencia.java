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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAgencia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtDireccion;
	private JTextField TxtNombre;
	private JTextField TxtTelefono;
	private JTextField TxtCorreo;
	private JTextField TxtWeb;
	private JTextField txtidcompañia;
	private JTextField txtidagencia;
	Agencia age = new Agencia();
	private JTextField txtconsultar;
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
		setBounds(100, 100, 492, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TxtDireccion = new JTextField();
		TxtDireccion.setBounds(204, 126, 86, 20);
		contentPane.add(TxtDireccion);
		TxtDireccion.setColumns(10);
		
		TxtNombre = new JTextField();
		TxtNombre.setBounds(204, 95, 86, 20);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		TxtTelefono = new JTextField();
		TxtTelefono.setColumns(10);
		TxtTelefono.setBounds(204, 157, 86, 20);
		contentPane.add(TxtTelefono);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			
			}
		});
		lblNewLabel.setBounds(34, 98, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(34, 129, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo electronico");
		lblNewLabel_2.setBounds(34, 184, 106, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefono");
		lblNewLabel_2_1.setBounds(34, 160, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Web");
		lblNewLabel_2_1_1.setBounds(34, 223, 46, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		TxtCorreo = new JTextField();
		TxtCorreo.setColumns(10);
		TxtCorreo.setBounds(204, 188, 86, 20);
		contentPane.add(TxtCorreo);
		
		TxtWeb = new JTextField();
		TxtWeb.setColumns(10);
		TxtWeb.setBounds(204, 220, 86, 20);
		contentPane.add(TxtWeb);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				age.create(TxtNombre.getText(),TxtDireccion.getText(),TxtTelefono.getText(),TxtCorreo.getText(),TxtWeb.getText(), Integer.parseInt(txtidcompañia.getText()));
				
			}
		});
		btnGuardar.setBounds(155, 344, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("idcompañia");
		lblNewLabel_2_1_1_1.setBounds(34, 260, 86, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txtidcompañia = new JTextField();
		txtidcompañia.setColumns(10);
		txtidcompañia.setBounds(204, 260, 86, 20);
		contentPane.add(txtidcompañia);
		
		JLabel lblAgencia = new JLabel("agencia");
		lblAgencia.setBounds(379, 70, 46, 14);
		contentPane.add(lblAgencia);
		
		txtidagencia = new JTextField();
		txtidagencia.setColumns(10);
		txtidagencia.setBounds(353, 95, 86, 20);
		
		contentPane.add(txtidagencia);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				age.delete(Integer.parseInt(txtidagencia.getText()));

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.setBounds(367, 118, 57, 59);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_3 = new JLabel("Gestion de agencias");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(176, 28, 171, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Consultar");
		lblNewLabel_4.setBounds(34, 308, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtconsultar = new JTextField();
		txtconsultar.setBounds(204, 305, 86, 20);
		contentPane.add(txtconsultar);
		txtconsultar.setColumns(10);
		
		JButton btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				age.readOne(Integer.parseInt(txtconsultar.getText()), TxtNombre, TxtDireccion, TxtTelefono, TxtCorreo, TxtWeb);
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\511943_find_loupe_magnifying glass_search_icon.png"));
		btnconsultar.setBounds(300, 299, 52, 23);
		btnconsultar.setContentAreaFilled(false);
		contentPane.add(btnconsultar);
	}
}
