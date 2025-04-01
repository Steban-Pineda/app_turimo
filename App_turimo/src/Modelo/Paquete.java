package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Paquete {

	public int iddestino = 0;
	public int idorigen = 0;
	public String precio = "";
	public String fechaventa = "";
	public String horaventa = "";
	public String fechaejecución = "";
	public String horasalida = "";
	public String observaciones = "";
	public int idpromotores = 0;
	public int idcliente = 0;
	public int idagencia = 0;
	public int idtransporte = 0;
	public int idmedio = 0;

	public Paquete(int iddestino, int idorigen, String precio, String fechaventa, String horaventa,
			String fechaejecución, String horasalida, String observaciones, int idpromotores, int idcliente,
			int idagencia, int idtransporte, int idmedio) {
		super();
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.precio = precio;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.fechaejecución = fechaejecución;
		this.horasalida = horasalida;
		this.observaciones = observaciones;
		this.idpromotores = idpromotores;
		this.idcliente = idcliente;
		this.idagencia = idagencia;
		this.idtransporte = idtransporte;
		this.idmedio = idmedio;
	}
	
	
	

	public Paquete() {
		super();
	}




	public int getIddestino() {
		return iddestino;
	}

	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}

	public int getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}

	public String getHoraventa() {
		return horaventa;
	}

	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}

	public String getFechaejecución() {
		return fechaejecución;
	}

	public void setFechaejecución(String fechaejecución) {
		this.fechaejecución = fechaejecución;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdpromotores() {
		return idpromotores;
	}

	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	public int getIdtransporte() {
		return idtransporte;
	}

	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}

	public int getIdmedio() {
		return idmedio;
	}

	public void setIdmedio(int idmedio) {
		this.idmedio = idmedio;
	}
	
Conexion conector = new Conexion();
	
	public void create(int iddestino, int idorigen, String precio, String fechaventa, String horaventa,String fechaejecución, String horasalida, String observaciones,int idpromotores,int idcliente,int idagencia,int idmedio,int idtransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblpaquete (iddestino, idorigen, precio, fechaventa, horaventa, fechaejecución, horasalida, observaciones, idpromotores, idcliente, idagencia, idmedio, idtransporte) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, precio);
			pst.setString(4, fechaventa);
			pst.setString(5, horaventa);
			pst.setString(6, fechaejecución);
			pst.setString(7, horasalida);
			pst.setString(8, observaciones);
			pst.setInt(9, idpromotores);
			pst.setInt(10, idcliente);
			pst.setInt(11, idagencia);
			pst.setInt(12, idmedio);
			pst.setInt(13, idtransporte);
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	public void delete( int códigoventa) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "DELETE FROM tblpaquete WHERE códigoventa = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, códigoventa);
			
			int resp = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro No. " + códigoventa + "?" );
			
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro No." + códigoventa + " eliminado" );
			
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
