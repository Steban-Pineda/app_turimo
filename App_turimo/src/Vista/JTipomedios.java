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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class JTipomedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtNombre;
	private JTextField TxtObservacion;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private JTextField txtidtipomedio;
	private JButton btndelete;
	Tipomedios cr = new Tipomedios();
	private JLabel lblNewLabel_3;
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
		setBounds(100, 100, 624, 327);
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
		TxtNombre.setBounds(230, 81, 86, 20);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		TxtObservacion = new JTextField();
		TxtObservacion.setBounds(230, 128, 86, 20);
		contentPane.add(TxtObservacion);
		TxtObservacion.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
                cr.create(TxtNombre.getText(),TxtObservacion.getText());
				
			}
		});
		btnGuardar.setBounds(153, 195, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("idtipomedio");
		lblNewLabel.setBounds(422, 58, 68, 14);
		contentPane.add(lblNewLabel);
		
		txtidtipomedio = new JTextField();
		txtidtipomedio.setColumns(10);
		txtidtipomedio.setBounds(404, 81, 86, 20);
		contentPane.add(txtidtipomedio);
		
		btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.delete(Integer.parseInt(txtidtipomedio.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.setBounds(422, 112, 51, 47);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		lblNewLabel_3 = new JLabel("Gestion  tipo de medios");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(178, 25, 190, 20);
		contentPane.add(lblNewLabel_3);
		
		JButton btncolsutar = new JButton("");
		btncolsutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.readOne(Integer.parseInt(txtidtipomedio.getText()) , TxtNombre, TxtObservacion);
			}
		});
		btncolsutar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\511943_find_loupe_magnifying glass_search_icon.png"));
		btncolsutar.setBounds(380, 128, 42, 27);
		contentPane.add(btncolsutar);
		btncolsutar.setContentAreaFilled(false);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.update(Integer.parseInt(txtidtipomedio.getText()),TxtNombre.getText(),TxtObservacion.getText());
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\172618_update_icon.png"));
		btnNewButton.setBounds(486, 120, 56, 39);
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);
	}
}
