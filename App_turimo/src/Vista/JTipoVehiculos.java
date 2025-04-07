package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.TipoVehiculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JTipoVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtNombre;
	private JTextField TxtObservacion;
	private JLabel lblIdtipotransporte;
	private JTextField txtidtipotransporte;
	private JButton btndelete;
	TipoVehiculos tvh = new TipoVehiculos();
	private JLabel lblNewLabel_1;
	private JButton btnconsultar;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTipoVehiculos frame = new JTipoVehiculos();
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
	public JTipoVehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre ");
		lblNewLabel.setBounds(48, 90, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(48, 130, 86, 14);
		contentPane.add(lblObservacion);
		
		TxtNombre = new JTextField();
		TxtNombre.setBounds(250, 87, 86, 20);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		TxtObservacion = new JTextField();
		TxtObservacion.setColumns(10);
		TxtObservacion.setBounds(250, 127, 86, 20);
		contentPane.add(TxtObservacion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				tvh.create(TxtNombre.getText(),TxtObservacion.getText());
				
				
				TxtNombre.setText("");
				TxtObservacion.setText("");
			}
		});
		btnGuardar.setBounds(219, 251, 89, 23);
		contentPane.add(btnGuardar);
		
		lblIdtipotransporte = new JLabel("idtipotransporte");
		lblIdtipotransporte.setBounds(404, 102, 108, 14);
		contentPane.add(lblIdtipotransporte);
		
		txtidtipotransporte = new JTextField();
		txtidtipotransporte.setColumns(10);
		txtidtipotransporte.setBounds(404, 127, 86, 20);
		contentPane.add(txtidtipotransporte);
		
		btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tvh.delete(Integer.parseInt(txtidtipotransporte.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.setBounds(414, 149, 54, 57);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		lblNewLabel_1 = new JLabel("Gestion de tipo de vehiculos");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(182, 27, 224, 20);
		contentPane.add(lblNewLabel_1);
		
		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tvh.readOne(Integer.parseInt(txtidtipotransporte.getText()), TxtNombre, TxtObservacion);
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\511943_find_loupe_magnifying glass_search_icon.png"));
		btnconsultar.setBounds(381, 158, 35, 38);
		btnconsultar.setContentAreaFilled(false);
		contentPane.add(btnconsultar);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tvh.update(Integer.parseInt(txtidtipotransporte.getText()), TxtNombre.getText(),TxtObservacion.getText());
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\172618_update_icon.png"));
		btnNewButton.setBounds(472, 158, 54, 35);
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);
	}
	
}
