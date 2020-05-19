package ed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CursoTest {
	
   Curso c1 = new Curso();
	
	
	Persona c= new Persona("12345678L","Pepe","1");
	Persona a= new Persona("87654321L","Alerto","Mendez");
	
	
	@Test
	void testEliminarAlumno() {
		
		c1.aniadirAlumno(a);
		
		
		assertTrue(c1.estaRegistrado(a.getDni()));
		
		try {
			c1.eliminarAlumno(a.getDni());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertFalse(c1.estaRegistrado(a.getDni()));
		
	}

	@Test
	void testAniadirAlumno() {
		c1.aniadirAlumno(a);
		assertEquals(1, c1.numeroAlumnos());
	}

	@Test
	void testEstaRegistrado() {
	
		boolean antes= c1.estaRegistrado(c.getDni());
		
		assertFalse(antes);
		
		c1.aniadirAlumno(c);
		
		assertTrue(c1.estaRegistrado(c.getDni()));
	
	
	
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
