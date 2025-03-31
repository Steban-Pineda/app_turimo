package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class TipoVehiculos {

	public int idtipotransporte = 0;
	public String nombre = "";
	public String observacion = "";

	public TipoVehiculos(int idtipotransporte, String nombre, String observacion) {
		super();
		this.idtipotransporte = idtipotransporte;
		this.nombre = nombre;
		this.observacion = observacion;
	}

	
	
	




	public TipoVehiculos() {
		super();
	}








	public int getIdtipotransporte() {
		return idtipotransporte;
	}

	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	Conexion conector = new Conexion();

	public void create(String nombre, String observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tbltiosvehiculos (nombre,observacion) values (?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}
