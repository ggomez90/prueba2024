package PrototipoConexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {
    // Método para listar todas las personas
    public static List<Persona> listarPersonas() {
        List<Persona> listaPersonas = new ArrayList<>();
        String consultaSQL = "SELECT * FROM Persona";
        ResultSet resultado = null;
        
        try {
        	Connection conexion = Conexion.conectarBD();
        	Statement stmt = conexion.createStatement();
            resultado = stmt.executeQuery(consultaSQL);
        } catch (SQLException error) {
        	System.out.println("Error en conexion: " + error.getMessage());
        }
        if (resultado != null) {
        	try {
				while (resultado.next()) {
				    int id = resultado.getInt("ID");
				    String nombre = resultado.getString("Nombre");
				    String apellido = resultado.getString("Apellido");
				    String direccion = resultado.getString("Direccion");
				    String telefono = resultado.getString("Telefono");
				    int edad = resultado.getInt("Edad");

				    Persona persona = new Persona(id, nombre, apellido, direccion, telefono, edad);
				    listaPersonas.add(persona);
				}
			} catch (SQLException error) {
				System.out.println("Error al cargar datos: " + error.getMessage());
			}
        }
        return listaPersonas;
    }
}

