package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
	
	public void create(String nombre, String direccion, String numerotelefonico, String correoelectronico, String web, int idcompañia) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblagencia (nombre, direccion, numerotelefonico, correoelectronico, web, idcompañia) values (?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, numerotelefonico);
			pst.setString(4, correoelectronico);
			pst.setString(5, web);
			pst.setInt(6, idcompañia);
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	
	
	
	
}
