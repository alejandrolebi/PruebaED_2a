package ed;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Contructor de la clase persona con los diferentes atributos
	 * @param String dni
	 * @param String nombre
	 * @param String apellido
	 * */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Metodo que devuelve el dni de la persona seleccionada
	 * */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Metodo que permite cambiar y estabalecer un nuevo dni para una persona en concreto 
	 * @param String dni
	 * @throws Exception si el ultimo caracter del String dni no es una letra
	 * */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * Metodo que permite el nombre de la persona seleccionada
	 * */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo que te permite establecer un nuevo nombre para una persona 
	 * */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Pemrite obtener el apellido de una persona
	 * */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 *Permite cambiar al apellido de una persona 
	 * */
	
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
