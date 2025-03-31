package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Paquete;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPaquete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtObservaciones;
	private JTextField TxtHorasalida;
	private JTextField TxtFechaejecucion;
	private JTextField TxtHoraventa;
	private JTextField TxtFechaventa;
	private JTextField TxtPrecio;
	private JTextField TxtIdorigen;
	private JTextField TxtIddestino;
	private JTextField txtidpromotores;
	private JTextField txtidcliente;
	private JTextField txtidagencia;
	private JTextField txtidmedio;
	private JTextField txtidtransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPaquete frame = new JPaquete();
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
	public JPaquete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Paquete paq = new Paquete();
			paq.create(Integer.parseInt(TxtIddestino.getText()), Integer.parseInt(TxtIdorigen.getText()),TxtPrecio.getText(),TxtFechaventa.getText(),TxtHoraventa.getText(),TxtFechaejecucion.getText(),TxtHorasalida.getText(),TxtObservaciones.getText(),
					Integer.parseInt(txtidpromotores.getText()),Integer.parseInt(txtidcliente.getText()),Integer.parseInt(txtidagencia.getText()),Integer.parseInt(txtidmedio.getText()),Integer.parseInt(txtidtransporte.getText()));
			
			}
		});
		btnGuardar.setBounds(154, 499, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdDestino = new JLabel("Id destino");
		lblIdDestino.setBounds(67, 78, 108, 14);
		contentPane.add(lblIdDestino);
		
		JLabel lblNewLabel_1 = new JLabel("Id origen");
		lblNewLabel_1.setBounds(67, 103, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Precio");
		lblNewLabel_1_1.setBounds(67, 128, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha venta");
		lblNewLabel_1_1_1.setBounds(67, 153, 108, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hora venta");
		lblNewLabel_1_1_1_1.setBounds(67, 184, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Fecha ejecucion");
		lblNewLabel_1_1_1_2.setBounds(67, 215, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Hora salida");
		lblNewLabel_1_1_1_3.setBounds(67, 246, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Observaciones");
		lblNewLabel_1_1_1_4.setBounds(67, 280, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		TxtObservaciones = new JTextField();
		TxtObservaciones.setColumns(10);
		TxtObservaciones.setBounds(247, 277, 86, 20);
		contentPane.add(TxtObservaciones);
		
		TxtHorasalida = new JTextField();
		TxtHorasalida.setColumns(10);
		TxtHorasalida.setBounds(247, 246, 86, 20);
		contentPane.add(TxtHorasalida);
		
		TxtFechaejecucion = new JTextField();
		TxtFechaejecucion.setColumns(10);
		TxtFechaejecucion.setBounds(247, 212, 86, 20);
		contentPane.add(TxtFechaejecucion);
		
		TxtHoraventa = new JTextField();
		TxtHoraventa.setColumns(10);
		TxtHoraventa.setBounds(247, 181, 86, 20);
		contentPane.add(TxtHoraventa);
		
		TxtFechaventa = new JTextField();
		TxtFechaventa.setColumns(10);
		TxtFechaventa.setBounds(247, 150, 86, 20);
		contentPane.add(TxtFechaventa);
		
		TxtPrecio = new JTextField();
		TxtPrecio.setColumns(10);
		TxtPrecio.setBounds(247, 125, 86, 20);
		contentPane.add(TxtPrecio);
		
		TxtIdorigen = new JTextField();
		TxtIdorigen.setColumns(10);
		TxtIdorigen.setBounds(247, 100, 86, 20);
		contentPane.add(TxtIdorigen);
		
		TxtIddestino = new JTextField();
		TxtIddestino.setColumns(10);
		TxtIddestino.setBounds(247, 75, 86, 20);
		contentPane.add(TxtIddestino);
		
		JLabel lblNewLabel = new JLabel("idpromotores");
		lblNewLabel.setBounds(67, 317, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdcliente = new JLabel("idcliente");
		lblIdcliente.setBounds(67, 342, 86, 14);
		contentPane.add(lblIdcliente);
		
		JLabel lblNewLabel_2_1 = new JLabel("idagencia");
		lblNewLabel_2_1.setBounds(67, 371, 58, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("idmedio");
		lblNewLabel_2_1_1.setBounds(67, 400, 58, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("idmedio");
		lblNewLabel_2_1_1_1.setBounds(67, 433, 58, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txtidpromotores = new JTextField();
		txtidpromotores.setColumns(10);
		txtidpromotores.setBounds(247, 314, 86, 20);
		contentPane.add(txtidpromotores);
		
		txtidcliente = new JTextField();
		txtidcliente.setColumns(10);
		txtidcliente.setBounds(247, 339, 86, 20);
		contentPane.add(txtidcliente);
		
		txtidagencia = new JTextField();
		txtidagencia.setColumns(10);
		txtidagencia.setBounds(247, 368, 86, 20);
		contentPane.add(txtidagencia);
		
		txtidmedio = new JTextField();
		txtidmedio.setColumns(10);
		txtidmedio.setBounds(247, 397, 86, 20);
		contentPane.add(txtidmedio);
		
		txtidtransporte = new JTextField();
		txtidtransporte.setColumns(10);
		txtidtransporte.setBounds(247, 430, 86, 20);
		contentPane.add(txtidtransporte);
	}
}
