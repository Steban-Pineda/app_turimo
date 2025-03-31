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

public class JTipoVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtNombre;
	private JTextField TxtObservacion;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre ");
		lblNewLabel.setBounds(48, 51, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblObservacion = new JLabel("Observacion");
		lblObservacion.setBounds(48, 91, 86, 14);
		contentPane.add(lblObservacion);
		
		TxtNombre = new JTextField();
		TxtNombre.setBounds(250, 48, 86, 20);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		TxtObservacion = new JTextField();
		TxtObservacion.setColumns(10);
		TxtObservacion.setBounds(250, 88, 86, 20);
		contentPane.add(TxtObservacion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TipoVehiculos tvh = new TipoVehiculos();
				tvh.create(TxtNombre.getText(),TxtObservacion.getText());
			}
		});
		btnGuardar.setBounds(150, 178, 89, 23);
		contentPane.add(btnGuardar);
	}
}
