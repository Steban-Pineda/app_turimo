package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Tipomedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTipomedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtNombre;
	private JTextField TxtObservacion;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTipomedios frame = new JTipomedios();
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
	public JTipomedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(37, 84, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observacion");
		lblNewLabel_2.setBounds(37, 131, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		TxtNombre = new JTextField();
		TxtNombre.setBounds(261, 81, 86, 20);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		TxtObservacion = new JTextField();
		TxtObservacion.setBounds(261, 128, 86, 20);
		contentPane.add(TxtObservacion);
		TxtObservacion.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Tipomedios cr = new Tipomedios();
                cr.create(TxtNombre.getText(),TxtObservacion.getText());
				
			}
		});
		btnGuardar.setBounds(162, 187, 89, 23);
		contentPane.add(btnGuardar);
	}

}
