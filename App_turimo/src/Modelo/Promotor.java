package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Promotor {

	public int idpromotores = 0;
	public String tipodocumento = "";
	public String numerodocumento = "";
	public String nombres = "";
	public String apellidos = "";
	public String telefono = "";
	public String correopersonal = "";
	public String correocorp = "";
	public String direcion = "";
	public String fechanacimiento = "";

	public Promotor(int idpromotores, String tipodocumento, String numerodocumento, String nombres, String apellidos,
			String telefono, String correopersonal, String correocorp, String direcion, String fechanacimiento) {
		super();
		this.idpromotores = idpromotores;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correopersonal = correopersonal;
		this.correocorp = correocorp;
		this.direcion = direcion;
		this.fechanacimiento = fechanacimiento;
	}
	
	

	public Promotor() {
		super();
	}



	public int getIdpromotores() {
		return idpromotores;
	}

	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
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

	public String getCorreopersonal() {
		return correopersonal;
	}

	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}

	public String getCorreocorp() {
		return correocorp;
	}

	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}

	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	
Conexion conector = new Conexion();
	
	public void create(String tipodocumento, String numerodocumento, String nombres, String apellidos, String telefono,String correopersonal,String correocorp,String direcion, String fechanacimiento) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblpromotores (tipodocumento, numerodocumento, nombres, apellidos, telefono, correopersonal, correocorp, direcion, fechanacimiento) values (?,?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setString(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, telefono);
			pst.setString(6, correopersonal);
			pst.setString(7, correocorp);
			pst.setString(8, direcion);
			pst.setString(9, fechanacimiento);
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	public void delete( int idpromotores) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblpromotores WHERE idpromotores = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idpromotores);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idpromotores + "?" );
			
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No." + idpromotores + " eliminado" );
			
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
