package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	public void delete( int idtipotransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tbltiosvehiculos WHERE idtipotransporte = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idtipotransporte);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idtipotransporte + "?" );
			
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No." + idtipotransporte + " eliminado" );
			
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void readOne( int idtipotransporte, JTextField nombre, JTextField observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tbltiosvehiculos WHERE idtipotransporte = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idtipotransporte);
			ResultSet rs = pst.executeQuery();
		
			
			
		
			
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	public void update(int idtipotransporte, String nombre,  String observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tbltiosvehiculos SET nombre = ?, observacion = ? WHERE idtipotransporte = ? ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// parametrizar los campos

			pst.setString(1,nombre);
			pst.setString(2, observacion);
		
			pst.setInt(3, idtipotransporte);

			int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el registro No." + idtipotransporte + "?");
			if (respuesta == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "registro No." + idtipotransporte + "actualizado");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
