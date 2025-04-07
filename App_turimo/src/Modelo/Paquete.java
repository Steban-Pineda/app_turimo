package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

	public void readOne( int códigoventa, JTextField iddestino, JTextField idorigen, JTextField precio, JTextField fechaventa, JTextField horaventa, JTextField fechaejecución, JTextField horasalida, JTextField observaciones, JTextField idpromotores, JTextField idcliente, JTextField idagencia, JTextField idmedio, JTextField idtransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "SELECT * FROM tblpaquete WHERE códigoventa = ?";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setInt(1, códigoventa);
			ResultSet rs = pst.executeQuery();
		
			
			
		
			
			while (rs.next()) {
				iddestino.setText(rs.getString(2));
				idorigen.setText(rs.getString(3));
				precio.setText(rs.getString(4));
				fechaventa.setText(rs.getString(5));
				horaventa.setText(rs.getString(6));
				fechaejecución.setText(rs.getString(7));
				horasalida.setText(rs.getString(8));
				observaciones.setText(rs.getString(9));
				idpromotores.setText(rs.getString(10));
				idcliente.setText(rs.getString(11));
				idagencia.setText(rs.getString(12));
				idmedio.setText(rs.getString(13));
				idtransporte.setText(rs.getString(14));
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void update(int códigoventa, int iddestino, int idorigen, String preccio, String fechaventa,
			String horaventa,String fechaejecución, String horasalida, String observaciones, int idpromotores, int idcliente, int idagencia , int idmedio, int idtransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "UPDATE tblpaquete SET códigoventa = ?, iddestino = ?, idorigen = ?, idorigen = ?, fechaventa = ?, horaventa = ?, horasalida = ?, observaciones = ?, idpromotores = ?, idcliente = ?,idagencia = ?, idmedio = ?, idtransporte = ? WHERE idpromotores = ? ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// parametrizar los campos

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
			pst.setInt(14, códigoventa);

			int respuesta = JOptionPane.showConfirmDialog(null, "Desea actualizar el registro No." + códigoventa + "?");
			if (respuesta == JOptionPane.YES_OPTION) {
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "registro No." + códigoventa + "actualizado");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
}
