package ed;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona c= new Persona("12345678L","Pepe","1");
	Persona a= new Persona("87654321L","Alerto","Mendez");
	@Test
	void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDni() {
		
		
		assertEquals("12345678L", c.getDni());
		assertEquals("87654321L", a.getDni());
		assertNotEquals("1", c.getDni());
	}

	@Test
	void testSetDni() throws Exception {
		
		String dni="1234567";
		
		Boolean pasaCatch = false;
		try{
			c.setDni(dni);
		}catch(Exception e){
		pasaCatch = true;
		}
		
		assertTrue(pasaCatch);
		
		String dni2="12345678L";
		
		try{
			c.setDni(dni2);
		}catch(Exception e){
		
		}
		assertEquals(dni2, c.getDni());
	}

	@Test
	void testGetNombre() {
		assertEquals("Pepe", c.getNombre());
	}

	@Test
	void testSetNombre() {
		String h="hola";
		c.setNombre(h);
		assertEquals("hola", c.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("1", c.getApellido1());
	}

	@Test
	void testSetApellido1() {
		
		c.setApellido1("2");
		assertEquals("2", c.getApellido1());
	}

}
