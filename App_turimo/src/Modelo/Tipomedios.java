package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

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
public void delete( int idtipomedio) {
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "DELETE FROM tbltipomedios WHERE idtipomedio = ?";
	
	try {
		dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		//parametrizar los campos
		pst.setInt(1, idtipomedio);
		
		int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idtipomedio + "?" );
		
		
		if (resp == JOptionPane.OK_OPTION) {
			//ejecutar la trx
		pst.executeUpdate();
		JOptionPane.showConfirmDialog(null, "Registro No." + idtipomedio + " eliminado" );
		
		}
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}

}

public void readOne( int idtipomedio, JTextField nombres, JTextField observacion) {
	Connection dbConnection = null;
	PreparedStatement pst = null;
	
	String script = "SELECT * FROM tbltipomedios WHERE idtipomedio = ?";
	
	try {
		dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		//parametrizar los campos
		pst.setInt(1, idtipomedio);
		ResultSet rs = pst.executeQuery();
	
		
		
	
		
		while (rs.next()) {
			nombres.setText(rs.getString(2));
			observacion.setText(rs.getString(3));
			
		}
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}

}
public void update(int idtipomedio, String nombres,  String observacion) {
	Connection dbConnection = null;
	PreparedStatement pst = null;

	String script = "UPDATE tbltipomedios SET nombres = ?, observacion = ? WHERE idtipomedio = ? ";

	try {
		dbConnection = conector.conectarBD();
		pst = dbConnection.prepareStatement(script);
		// parametrizar los campos

		pst.setString(1,nombres);
		pst.setString(2, observacion);
	
		pst.setInt(3, idtipomedio);

		int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el registro No." + idtipomedio + "?");
		if (respuesta == JOptionPane.YES_OPTION) {
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "registro No." + idtipomedio + "actualizado");
		}

	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}

}

}
	
	
	
	
	
	
	
	
	
	
	

