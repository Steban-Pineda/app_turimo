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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

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
	private JTextField txtcódigoventa;
	Paquete paq = new Paquete();
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JButton btnAtras;
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
		setBounds(100, 100, 593, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
			paq.create(Integer.parseInt(TxtIddestino.getText()), Integer.parseInt(TxtIdorigen.getText()),TxtPrecio.getText(),TxtFechaventa.getText(),TxtHoraventa.getText(),TxtFechaejecucion.getText(),TxtHorasalida.getText(),TxtObservaciones.getText(),
					Integer.parseInt(txtidpromotores.getText()),Integer.parseInt(txtidcliente.getText()),Integer.parseInt(txtidagencia.getText()),Integer.parseInt(txtidmedio.getText()),Integer.parseInt(txtidtransporte.getText()));
			
			}
		});
		btnGuardar.setBounds(263, 556, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdDestino = new JLabel("Id destino");
		lblIdDestino.setBounds(67, 127, 108, 14);
		contentPane.add(lblIdDestino);
		
		JLabel lblNewLabel_1 = new JLabel("Id origen");
		lblNewLabel_1.setBounds(67, 152, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Precio");
		lblNewLabel_1_1.setBounds(67, 177, 108, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha venta");
		lblNewLabel_1_1_1.setBounds(67, 202, 108, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hora venta");
		lblNewLabel_1_1_1_1.setBounds(67, 233, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Fecha ejecucion");
		lblNewLabel_1_1_1_2.setBounds(67, 264, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Hora salida");
		lblNewLabel_1_1_1_3.setBounds(67, 295, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Observaciones");
		lblNewLabel_1_1_1_4.setBounds(67, 329, 108, 14);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		TxtObservaciones = new JTextField();
		TxtObservaciones.setColumns(10);
		TxtObservaciones.setBounds(247, 326, 86, 20);
		contentPane.add(TxtObservaciones);
		
		TxtHorasalida = new JTextField();
		TxtHorasalida.setColumns(10);
		TxtHorasalida.setBounds(247, 295, 86, 20);
		contentPane.add(TxtHorasalida);
		
		TxtFechaejecucion = new JTextField();
		TxtFechaejecucion.setColumns(10);
		TxtFechaejecucion.setBounds(247, 261, 86, 20);
		contentPane.add(TxtFechaejecucion);
		
		TxtHoraventa = new JTextField();
		TxtHoraventa.setColumns(10);
		TxtHoraventa.setBounds(247, 230, 86, 20);
		contentPane.add(TxtHoraventa);
		
		TxtFechaventa = new JTextField();
		TxtFechaventa.setColumns(10);
		TxtFechaventa.setBounds(247, 199, 86, 20);
		contentPane.add(TxtFechaventa);
		
		TxtPrecio = new JTextField();
		TxtPrecio.setColumns(10);
		TxtPrecio.setBounds(247, 174, 86, 20);
		contentPane.add(TxtPrecio);
		
		TxtIdorigen = new JTextField();
		TxtIdorigen.setColumns(10);
		TxtIdorigen.setBounds(247, 149, 86, 20);
		contentPane.add(TxtIdorigen);
		
		TxtIddestino = new JTextField();
		TxtIddestino.setColumns(10);
		TxtIddestino.setBounds(247, 124, 86, 20);
		contentPane.add(TxtIddestino);
		
		JLabel lblNewLabel = new JLabel("idpromotores");
		lblNewLabel.setBounds(67, 366, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdcliente = new JLabel("idcliente");
		lblIdcliente.setBounds(67, 391, 86, 14);
		contentPane.add(lblIdcliente);
		
		JLabel lblNewLabel_2_1 = new JLabel("idagencia");
		lblNewLabel_2_1.setBounds(67, 420, 58, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("idmedio");
		lblNewLabel_2_1_1.setBounds(67, 449, 58, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("idtransporte");
		lblNewLabel_2_1_1_1.setBounds(67, 482, 86, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txtidpromotores = new JTextField();
		txtidpromotores.setColumns(10);
		txtidpromotores.setBounds(247, 363, 86, 20);
		contentPane.add(txtidpromotores);
		
		txtidcliente = new JTextField();
		txtidcliente.setColumns(10);
		txtidcliente.setBounds(247, 388, 86, 20);
		contentPane.add(txtidcliente);
		
		txtidagencia = new JTextField();
		txtidagencia.setColumns(10);
		txtidagencia.setBounds(247, 417, 86, 20);
		contentPane.add(txtidagencia);
		
		txtidmedio = new JTextField();
		txtidmedio.setColumns(10);
		txtidmedio.setBounds(247, 446, 86, 20);
		contentPane.add(txtidmedio);
		
		txtidtransporte = new JTextField();
		txtidtransporte.setColumns(10);
		txtidtransporte.setBounds(247, 479, 86, 20);
		contentPane.add(txtidtransporte);
		
		txtcódigoventa = new JTextField();
		txtcódigoventa.setColumns(10);
		txtcódigoventa.setBounds(414, 149, 86, 20);
		contentPane.add(txtcódigoventa);
		
		JButton btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paq.delete(Integer.parseInt(txtcódigoventa.getText()));;
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.setBounds(442, 184, 45, 63);
		contentPane.add(btndelete);
		
		lblNewLabel_2 = new JLabel("codigo de venta");
		lblNewLabel_2.setBounds(414, 127, 108, 14);
		btndelete.setContentAreaFilled(false);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Gestion de paquete");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(190, 36, 190, 20);
		contentPane.add(lblNewLabel_3);
		
		JButton btnconsulta = new JButton("");
		btnconsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paq.readOne(Integer.parseInt(txtcódigoventa.getText()), TxtIddestino, TxtIdorigen, TxtPrecio, TxtFechaventa, TxtHoraventa, TxtFechaejecucion, TxtHorasalida, TxtObservaciones, txtidpromotores, txtidcliente, txtidagencia, txtidmedio, txtidtransporte);
				
			}
		});
		btnconsulta.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\511943_find_loupe_magnifying glass_search_icon.png"));
		btnconsulta.setBounds(387, 202, 45, 23);
		btnconsulta.setContentAreaFilled(false);
		contentPane.add(btnconsulta);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paq.update(Integer.parseInt(txtcódigoventa.getText()),Integer.parseInt(TxtIddestino.getText()), Integer.parseInt(TxtIdorigen.getText()),TxtPrecio.getText(),TxtFechaventa.getText(),TxtHoraventa.getText(),TxtFechaejecucion.getText(),TxtHorasalida.getText(),TxtObservaciones.getText(),
						Integer.parseInt(txtidpromotores.getText()),Integer.parseInt(txtidcliente.getText()),Integer.parseInt(txtidagencia.getText()),Integer.parseInt(txtidmedio.getText()),Integer.parseInt(txtidtransporte.getText()));
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\172618_update_icon.png"));
		btnNewButton.setBounds(497, 199, 58, 48);
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz paq = new Interfaz();
			paq.setVisible(true);
			}
		});
		btnAtras.setBounds(130, 556, 89, 23);
		contentPane.add(btnAtras);
	}
}
