package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public Connection conectarBD() {

		Connection connection = null;

		try {
			// string de conexion
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo", "root", "2556229");
			System.out.println("connected with the database successfully");

		} catch (SQLException e) {
			System.out.println("error while connecting to the database");

		}

		return connection;

	}

}
