package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controlador.Conexion;

public class Operadores {

	public int idoperadores = 0;
	public String tipodocumento = "";
	public String numerodocumento = "";
	public String nombres = "";
	public String apellidos = "";
	public String telefono = "";
	public String correo = "";
	public String direccion = "";

	public Operadores(int idoperadores, String tipodocumento, String numerodocumento, String nombres, String apellidos,
			String telefono, String correo, String direccion) {
		super();
		this.idoperadores = idoperadores;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
	}
	

	public Operadores() {
		super();
	}


	public int getIdoperadores() {
		return idoperadores;
	}

	public void setIdoperadores(int idoperadores) {
		this.idoperadores = idoperadores;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

Conexion conector = new Conexion();
	
	public void create(String tipodocumento, String numerodocumento, String nombres, String apellidos, String telefono,String correo,String direccion, int idtransporte ) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tbloperadores (tipodocumento, numerodocumento, nombres, apellidos, telefono, correo, direccion,idtransporte) values (?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setString(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, telefono);
			pst.setString(6, correo);
			pst.setString(7, direccion);
			pst.setInt(8, idtransporte);
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void delete( int idoperadores) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tbloperadores WHERE idoperadores = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idoperadores);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idoperadores + "?" );
			
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No." + idoperadores + " eliminado" );
			
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	
	public void readOne( int idoperadores, JTextField tipodocumento, JTextField numerodocumento, JTextField nombres, JTextField apellidos, JTextField telefono, JTextField correo, JTextField direccion, JTextField idtransporte ) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tbloperadores WHERE idoperadores = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idoperadores);
			ResultSet rs = pst.executeQuery();
		
			
			
		
			
			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				numerodocumento.setText(rs.getString(3));
				nombres.setText(rs.getString(4));
				apellidos.setText(rs.getString(5));
				telefono.setText(rs.getString(6));
				correo.setText(rs.getString(7));
				direccion.setText(rs.getString(8));
				idtransporte.setText(rs.getString(9));
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
