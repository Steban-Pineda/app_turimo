package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Clientes {

	public int idcliente = 0;
	public String tipodocumento = "";
	public int numerodocumento = 0;
	public String nombres = "";
	public String apellidos = "";
	public String eps = "";
	public String alergias = "";
	public String fechanacimiento = "";
	public String estadocivil = "";
	public String telefono = "";
	public String correo = "";
	public String direccion = "";

	public Clientes(int idcliente, String tipodocumento, int numerodocumento, String nombres, String apellidos,
			String eps, String alergias, String fechanacimiento, String estadocivil, String telefono, String correo,
			String direccion) {
		super();
		this.idcliente = idcliente;
		this.tipodocumento = tipodocumento;
		this.numerodocumento = numerodocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.eps = eps;
		this.alergias = alergias;
		this.fechanacimiento = fechanacimiento;
		this.estadocivil = estadocivil;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		
		
	}

	public Clientes() {
		super();
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public int getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(int numerodocumento) {
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

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
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
	
	public void create(String tipodocumento, String numerodocumento, String nombres, String apellidos, String eps,String alergias,String fechanacimiento,String estadocivil,String telefono,String correo,String direccion ) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblclientes (tipodocumento, numerodocumento, nombres, apellidos, eps, alergias, fechanacimiento, estadocivil, telefono, correo, direccion) values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setString(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setString(7, fechanacimiento);
			pst.setString(8, estadocivil);
			pst.setString(9, telefono);
			pst.setString(10, correo);
			pst.setString(11, direccion);
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void delete( int idcliente) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblclientes WHERE idcliente = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, idcliente);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + idcliente + "?" );
			
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No." + idcliente + " eliminado" );
			
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
}
