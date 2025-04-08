package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Medios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtNombres;
	private JTextField TxtObservaciones;
	private JTextField txtidtipomedio;
	private JLabel lblNewLabel;
	private JTextField txtidmedio;
	private JButton btndelete;
	Medios med = new Medios();
	private JLabel lblNewLabel_2;
	private JButton btnconsultar;
	private JButton btnNewButton;
	private JButton btnAtras;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMedios frame = new JMedios();
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
	public JMedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setBounds(75, 97, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel textfield = new JLabel("Observaciones");
		textfield.setBounds(75, 141, 86, 14);
		contentPane.add(textfield);
		
		TxtNombres = new JTextField();
		TxtNombres.setColumns(10);
		TxtNombres.setBounds(236, 94, 86, 20);
		contentPane.add(TxtNombres);
		
		TxtObservaciones = new JTextField();
		TxtObservaciones.setColumns(10);
		TxtObservaciones.setBounds(236, 138, 86, 20);
		contentPane.add(TxtObservaciones);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				med.create(TxtNombres.getText(),TxtObservaciones.getText(), Integer.parseInt(txtidtipomedio.getText()));
				
			}
		});
		btnGuardar.setBounds(254, 257, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdtipomedio = new JLabel("idtipomedio");
		lblIdtipomedio.setBounds(75, 180, 86, 14);
		contentPane.add(lblIdtipomedio);
		
		txtidtipomedio = new JTextField();
		txtidtipomedio.setColumns(10);
		txtidtipomedio.setBounds(236, 177, 86, 20);
		contentPane.add(txtidtipomedio);
		
		lblNewLabel = new JLabel("idmedio");
		lblNewLabel.setBounds(420, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtidmedio = new JTextField();
		txtidmedio.setColumns(10);
		txtidmedio.setBounds(397, 94, 86, 20);
		contentPane.add(txtidmedio);
		
		btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				med.delete(Integer.parseInt(txtidmedio.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\9162995_document_email_delete_recycle_trash_icon.png"));
		btndelete.setBounds(420, 125, 46, 57);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		lblNewLabel_2 = new JLabel("Gestion de medios");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(179, 34, 190, 20);
		contentPane.add(lblNewLabel_2);
		
		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				med.readOne(Integer.parseInt(txtidmedio.getText()), TxtNombres, TxtObservaciones, txtidtipomedio);
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\511943_find_loupe_magnifying glass_search_icon.png"));
		btnconsultar.setBounds(364, 134, 46, 48);
		btnconsultar.setContentAreaFilled(false);
		contentPane.add(btnconsultar);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				med.update(Integer.parseInt(txtidmedio.getText()),TxtNombres.getText(),TxtObservaciones.getText(), Integer.parseInt(txtidtipomedio.getText()));
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\OneDrive\\172618_update_icon.png"));
		btnNewButton.setBounds(480, 138, 46, 41);
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Interfaz med = new Interfaz();
				med.setVisible(true);
			}
		});
		btnAtras.setBounds(121, 257, 89, 23);
		contentPane.add(btnAtras);
	}

}
