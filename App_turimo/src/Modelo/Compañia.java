package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;


public class Compañia {

	public int idcompañia = 0;
	public String nombre = "";
	public String direccion = "";
	public String numerotelefonico = "";
	public String correoelectonico = "";
	public String web = "";

	public Compañia(int idcompañia, String nombre, String direccion, String numerotelefonico, String correoelectonico,
			String web) {
		super();
		this.idcompañia = idcompañia;
		this.nombre = nombre;
		this.direccion = direccion;
		this.numerotelefonico = numerotelefonico;
		this.correoelectonico = correoelectonico;
		this.web = web;
	}
	
	

	public Compañia() {
		super();
	}



	public int getIdcompañia() {
		return idcompañia;
	}

	public void setIdcompañia(int idcompañia) {
		this.idcompañia = idcompañia;
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

	public String getCorreoelectonico() {
		return correoelectonico;
	}

	public void setCorreoelectonico(String correoelectonico) {
		this.correoelectonico = correoelectonico;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	Conexion conector = new Conexion();
	
	public void create(String nombre, String direccion, String numerotelefonico, String correoelectonico, String web) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblagencia(nombre, direccion, numerotelefonico, correoelectonico, web) values (?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, numerotelefonico);
			pst.setString(4, correoelectonico);
			pst.setString(5, web);
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	public void delete( int idcompañia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblcompañia WHERE idcompañia = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idcompañia);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idcompañia + "?" );
			
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No." + idcompañia + "eliminado" );
			
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void readOne( int idcompañia, JTextField nombre, JTextField direccion, JTextField numerotelefonico, JTextField correoelectronico, JTextField web ) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblcompañia WHERE idcompañia = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idcompañia);
			ResultSet rs = pst.executeQuery();
		
			
			
		
			
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				numerotelefonico.setText(rs.getString(4));
				correoelectronico.setText(rs.getString(5));
				web.setText(rs.getString(6));
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	public void update(int idcompañia, String nombre, String direccion, String numerotelefonico, String correoelectonico,
			String web) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tblcompañia SET nombre = ?, direccion = ?, numerotelefonico = ?, correoelectonico = ?,web = ?  WHERE idcompañia = ? ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// parametrizar los campos

			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, numerotelefonico);
			pst.setString(4, correoelectonico);
			pst.setString(5, web);
			pst.setInt(6, idcompañia);

			int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el registro No." + idcompañia + "?");
			if (respuesta == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "registro No." + idcompañia + "actualizado");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
}
