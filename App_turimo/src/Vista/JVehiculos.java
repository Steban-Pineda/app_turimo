package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import Modelo.Vehiculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtPlaca;
	private JTextField TxtCapacidad;
	private JTextField TxtModelo;
	private JTextField TxtMarca;
	private JTextField TxtEstadovehiculo;
	private JTextField TxtNumeromotor;
	private JTextField TxtCategoria;
	private JTextField txtidtipotransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVehiculos frame = new JVehiculos();
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
	public JVehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Placa");
		lblNewLabel_1.setBounds(32, 77, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Capacidad");
		lblNewLabel_1_1.setBounds(32, 116, 91, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Modelo");
		lblNewLabel_1_2.setBounds(32, 153, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Marca");
		lblNewLabel_1_3.setBounds(32, 189, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Estado vehiculo");
		lblNewLabel_1_4.setBounds(32, 233, 91, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_6 = new JLabel("Numero motor");
		lblNewLabel_1_6.setBounds(32, 286, 91, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Categoria");
		lblNewLabel_1_7.setBounds(32, 332, 91, 14);
		contentPane.add(lblNewLabel_1_7);
		
		TxtPlaca = new JTextField();
		TxtPlaca.setColumns(10);
		TxtPlaca.setBounds(248, 74, 86, 20);
		contentPane.add(TxtPlaca);
		
		TxtCapacidad = new JTextField();
		TxtCapacidad.setColumns(10);
		TxtCapacidad.setBounds(248, 113, 86, 20);
		contentPane.add(TxtCapacidad);
		
		TxtModelo = new JTextField();
		TxtModelo.setColumns(10);
		TxtModelo.setBounds(248, 150, 86, 20);
		contentPane.add(TxtModelo);
		
		TxtMarca = new JTextField();
		TxtMarca.setColumns(10);
		TxtMarca.setBounds(248, 186, 86, 20);
		contentPane.add(TxtMarca);
		
		TxtEstadovehiculo = new JTextField();
		TxtEstadovehiculo.setColumns(10);
		TxtEstadovehiculo.setBounds(248, 230, 86, 20);
		contentPane.add(TxtEstadovehiculo);
		
		TxtNumeromotor = new JTextField();
		TxtNumeromotor.setColumns(10);
		TxtNumeromotor.setBounds(248, 283, 86, 20);
		contentPane.add(TxtNumeromotor);
		
		TxtCategoria = new JTextField();
		TxtCategoria.setColumns(10);
		TxtCategoria.setBounds(248, 329, 86, 20);
		contentPane.add(TxtCategoria);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Vehiculos veh = new Vehiculos();
				veh.create(TxtPlaca.getText(),Integer.parseInt(TxtCapacidad.getText()),TxtModelo.getText(),TxtMarca.getText(),TxtEstadovehiculo.getText(),Integer.parseInt(TxtNumeromotor.getText()), TxtCategoria.getText(),Integer.parseInt(txtidtipotransporte.getText()));
			}
		});
		btnGuardar.setBounds(156, 432, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("idtipotransporte");
		lblNewLabel_1_7_1.setBounds(32, 378, 91, 14);
		contentPane.add(lblNewLabel_1_7_1);
		
		txtidtipotransporte = new JTextField();
		txtidtipotransporte.setColumns(10);
		txtidtipotransporte.setBounds(248, 375, 86, 20);
		contentPane.add(txtidtipotransporte);
	}

}
