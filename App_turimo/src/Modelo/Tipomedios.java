package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Tipomedios {

	public int idtipomedio = 0;
	public String nombres = "";
	public String observacion = "";

	public Tipomedios(int idtipomedio, String nombres, String observacion) {
		super();
		this.idtipomedio = idtipomedio;
		this.nombres = nombres;
		this.observacion = observacion;
	}

	
	
	public Tipomedios() {
		super();
	}



	public int getIdtipomedio() {
		return idtipomedio;
	}

	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

Conexion conector = new Conexion();

public void create(String nombres, String observacion) {
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "INSERT INTO tbltipomedios (nombres,observacion) values (?,?)";
	
	try {
		dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		//parametrizar los campos
		pst.setString(1, nombres);
		pst.setString(2, observacion);
		//ejecutar la trx
		pst.executeUpdate();
		JOptionPane.showConfirmDialog(null, "Registro con exito");
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
}
