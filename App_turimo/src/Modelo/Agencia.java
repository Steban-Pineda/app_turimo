package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Agencia {

	public int idagencia = 0;
	public String nombre = "";
	public String direccion = "";
	public String numerotelefonico = "";
	public String correoelectronico = "";
	public String web = "";
	public int idcompañia = 0;

	public Agencia(int idagencia, String nombre, String direccion, String numerotelefonico, String correoelectronico,
			String web, int idcompañia) {
		super();
		this.idagencia = idagencia;
		this.nombre = nombre;
		this.direccion = direccion;
		this.numerotelefonico = numerotelefonico;
		this.correoelectronico = correoelectronico;
		this.web = web;
		this.idcompañia = idcompañia;
	}

	public Agencia() {
		super();
	}

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumerotelefonico() {
		return numerotelefonico;
	}

	public void setNumerotelefonico(String numerotelefonico) {
		this.numerotelefonico = numerotelefonico;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getIdcompañia() {
		return idcompañia;
	}

	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
	}

	Conexion conector = new Conexion();

	public void create(String nombre, String direccion, String numerotelefonico, String correoelectronico, String web,
			int idcompañia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblagencia (nombre, direccion, numerotelefonico, correoelectronico, web, idcompañia) values (?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, numerotelefonico);
			pst.setString(4, correoelectronico);
			pst.setString(5, web);
			pst.setInt(6, idcompañia);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "DELETE FROM tblagencia WHERE idagencia = ?";

		try {
			dbConnection = conector.conectarBD();//abre la conexion
			pst = dbConnection.prepareStatement(script);//se abre el buffer
			// parametrizar los campos
			pst.setInt(1, idagencia);

			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idagencia + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No." + idagencia + "eliminado");

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void readOne(int idagencia, JTextField nombre, JTextField direccion, JTextField numerotelefonico,
			JTextField correoelectronico, JTextField web, JTextField idcompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "SELECT * FROM tblagencia WHERE idagencia = ?";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// parametrizar los campos
			pst.setInt(1, idagencia);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				nombre.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				numerotelefonico.setText(rs.getString(4));
				correoelectronico.setText(rs.getString(5));
				web.setText(rs.getString(6));
				idcompania.setText(rs.getString(7));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void update(int idagencia, String nombre, String direccion, String numerotelefonico,
			String correoelectronico, String web, int idcompañia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tblagencia SET nombre = ?, direccion = ?, numerotelefonico = ?, correoelectronico = ?, web = ?, idcompañia = ? WHERE idagencia = ? ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// parametrizar los campos

			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, numerotelefonico);
			pst.setString(4, correoelectronico);
			pst.setString(5, web);
			pst.setInt(6, idcompañia);
			pst.setInt(7, idagencia);

			int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el registro No." + idagencia + "?");
			if (respuesta == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "registro No." + idagencia + "actualizado");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
