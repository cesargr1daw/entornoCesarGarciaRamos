package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.EDD.MyString1;

class testMyString1 {
	@Test
	void testContarPalabras() {
		assertEquals(0, MyString1.contarPalabras(null));
		assertEquals(0, MyString1.contarPalabras(""));
		assertEquals(2, MyString1.contarPalabras(" Hola mundo "));
		assertEquals(5, MyString1.contarPalabras("Este es un test simple"));
	}

	@Test
	void testContarLetrasDiferentes() {
		assertEquals(0, MyString1.contarLetrasDiferentes(null)); 
        assertEquals(0, MyString1.contarLetrasDiferentes(""));
        assertEquals(5, MyString1.contarLetrasDiferentes(" Holña"));
        assertEquals(4, MyString1.contarLetrasDiferentes("aaaabbbcccd")); 
        assertEquals(0, MyString1.contarLetrasDiferentes("1234!@#$"));
	}

	@Test
	void testContarFrecuenciaPalabras() {
		Map<String, Integer> esperado = new HashMap<>();
        esperado.put("hola", 2);
        esperado.put("mundo", 1);
        assertEquals(esperado, MyString1.contarFrecuenciaPalabras("Hola mundo hola"));
        esperado.clear();
	}
	
/*
	@Test
	void testContarFrecuenciaLetras() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPalindroma() {
		fail("Not yet implemented");
	}
*/
}
