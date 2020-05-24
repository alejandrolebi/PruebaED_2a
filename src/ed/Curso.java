package ed;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Metodo que elimina a un alumno utilizando el dni como base
	 * @param String dni
	 * @throws Exception is el dni no cuple la longituf adecuada
	 * */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Metodo utilizado para añadir alumnos a la lista de alumnos
	 * */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * Metodo que comprueba mediante el String Dni si el alumno esta registrado o no en la lista de alumnos
	 * @param String dni es el utilizado para comprobar la lista
	 * */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * Metodo que es utilizado para crear un nuevo array
	 * */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**
	 * Devuelve el numero de alumnos que estan registrados en la lista de alumnos
	 * */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
