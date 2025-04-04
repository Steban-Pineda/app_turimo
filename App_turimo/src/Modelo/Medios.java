package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Medios {

	public int idmedio = 0;
	public String nombres = "";
	public String observacion = "";

	public Medios(int idmedio, String nombres, String observacion) {
		super();
		this.idmedio = idmedio;
		this.nombres = nombres;
		this.observacion = observacion;
	}
	
	

	public Medios() {
		super();
	}



	public int getIdmedio() {
		return idmedio;
	}

	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
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

	public void create(String nombres, String observacion, int idtipomedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblmedios (nombres,observacion, idtipomedio) values (?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, nombres);
			pst.setString(2, observacion);
			pst.setInt(3, idtipomedio);
			//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void delete( int idmedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblmedios WHERE idmedio = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idmedio);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idmedio + "?" );
			
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No." + idmedio + " eliminado" );
			
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void readOne( int idmedio, JTextField nombres, JTextField observacion, JTextField idtipomedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblmedios WHERE idmedio = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idmedio);
			ResultSet rs = pst.executeQuery();
		
			
			
		
			
			while (rs.next()) {
				nombres.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				idtipomedio.setText(rs.getString(4));
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
