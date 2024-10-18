package PrototipoConexion;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = PersonaDAO.listarPersonas();
		for (Persona item: listaPersonas) {
			System.out.println("Nombre: " + item.getNombre());
			System.out.println("Apellido: " + item.getApellido());
			System.out.println("DNI: " + item.getId());
			System.out.println("Direccion: " + item.getDireccion());
			System.out.println("Telefono: " + item.getTelefono());
			System.out.println("Edad: " + item.getEdad());
			System.out.println("------------------------------");
		}
	}

}
