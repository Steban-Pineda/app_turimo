package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgencia = new JButton("Agencia");
		btnAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAgencia age = new JAgencia();
				age.setVisible(true);
			}
		});
		btnAgencia.setBounds(82, 81, 111, 23);
		contentPane.add(btnAgencia);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JClientes cli = new JClientes();
				cli.setVisible(true);
			}
		});
		btnClientes.setBounds(82, 118, 111, 23);
		contentPane.add(btnClientes);
		
		JButton btnCompañia = new JButton("Compañia");
		btnCompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCompañia com = new JCompañia();
				com.setVisible(true);
			}
		});
		btnCompañia.setBounds(82, 158, 111, 23);
		contentPane.add(btnCompañia);
		
		JButton btnMedios = new JButton("Medios");
		btnMedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMedios med = new JMedios();
				med.setVisible(true);
			}
		});
		btnMedios.setBounds(82, 193, 111, 23);
		contentPane.add(btnMedios);
		
		JButton btnoperadores = new JButton("Operadores");
		btnoperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOperadores ope =  new JOperadores();
				ope.setVisible(true);
			}
		});
		btnoperadores.setBounds(82, 228, 111, 23);
		contentPane.add(btnoperadores);
		
		JButton btnPaquete = new JButton("Paquete");
		btnPaquete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPaquete paq = new JPaquete();
				paq.setVisible(true);
			}
		});
		btnPaquete.setBounds(82, 266, 111, 23);
		contentPane.add(btnPaquete);
		
		JButton btnPromotor = new JButton("Promotor");
		btnPromotor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPromotor pro = new JPromotor();
				pro.setVisible(true);
			}
		});
		btnPromotor.setBounds(82, 305, 111, 23);
		contentPane.add(btnPromotor);
		
		JButton btnTipomedios = new JButton("Tipomedios");
		btnTipomedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTipomedios tmed = new JTipomedios();
				tmed.setVisible(true);
			}
		});
		btnTipomedios.setBounds(82, 343, 111, 23);
		contentPane.add(btnTipomedios);
		
		JButton btntipovehiculos = new JButton("tipo vehiculos");
		btntipovehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTipoVehiculos tveh = new JTipoVehiculos();
				tveh.setVisible(true);
			}
		});
		btntipovehiculos.setBounds(82, 380, 111, 23);
		contentPane.add(btntipovehiculos);
		
		JButton btnVehiculos = new JButton("Vehiculos");
		btnVehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JVehiculos veh = new JVehiculos();
				veh.setVisible(true);
			}
		});
		btnVehiculos.setBounds(82, 420, 111, 23);
		contentPane.add(btnVehiculos);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblNewLabel.setBounds(108, 30, 73, 40);
		contentPane.add(lblNewLabel);
	}
}
