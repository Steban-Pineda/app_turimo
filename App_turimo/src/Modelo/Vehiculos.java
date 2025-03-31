package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class Vehiculos {

	public int idtransporte = 0;
	public String placa = "";
	public int capacidad = 0;
	public String modelo = "";
	public String marca = "";
	public String estadovehiculo = "";
	public int idtipotransporte = 0;
	public int numero_motor = 0;
	public String categoria = "";

	public Vehiculos(int idtransporte, String placa, int capacidad, String modelo, String marca, String estadovehiculo,
			int idtipotransporte, int numero_motor, String categoria) {
		super();
		this.idtransporte = idtransporte;
		this.placa = placa;
		this.capacidad = capacidad;
		this.modelo = modelo;
		this.marca = marca;
		this.estadovehiculo = estadovehiculo;
		this.idtipotransporte = idtipotransporte;
		this.numero_motor = numero_motor;
		this.categoria = categoria;
	}
	
	

	public Vehiculos() {
		super();
	}



	public int getIdtransporte() {
		return idtransporte;
	}

	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstadovehiculo() {
		return estadovehiculo;
	}

	public void setEstadovehiculo(String estadovehiculo) {
		this.estadovehiculo = estadovehiculo;
	}

	public int getIdtipotransporte() {
		return idtipotransporte;
	}

	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}

	public int getNumero_motor() {
		return numero_motor;
	}

	public void setNumero_motor(int numero_motor) {
		this.numero_motor = numero_motor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	Conexion conector = new Conexion();

	public void create(String placa, int capacidad,String modelo, String marca, String estadovehiculo, int numero_motor, String categoria, int idtipotransporte ) {
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblvehiculos (placa, capacidad, modelo, marca, estadovehiculo, numero_motor, categoria, idtipotransporte) values (?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			//parametrizar los campos
			pst.setString(1, placa);
			pst.setInt(2, capacidad);
			pst.setString(3, modelo);
			pst.setString(4, marca);
			pst.setString(5, estadovehiculo);
			pst.setInt(6, numero_motor);
			pst.setString(7, categoria);
			pst.setInt(8, idtipotransporte);
			//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	
}
