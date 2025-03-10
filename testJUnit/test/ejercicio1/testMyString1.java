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
		Map<String, Integer> resultadoPalabras = MyString1.contarFrecuenciaPalabras("hola hola mundo");
        assert (resultadoPalabras.get("hola") == 2);
        assert (resultadoPalabras.get("mundo") == 1);
        assert (resultadoPalabras.size() == 2);
        assert(MyString1.contarFrecuenciaPalabras("").isEmpty());
        assert(MyString1.contarFrecuenciaPalabras(null).isEmpty());
	}
	
	@Test
	void testContarFrecuenciaLetras() {
		Map<Character, Integer> resultadoLetras = MyString1.contarFrecuenciaLetras("banana");
        assert resultadoLetras.get('b') == 1;
        assert resultadoLetras.get('a') == 3;
        assert resultadoLetras.get('n') == 2;
        assert resultadoLetras.size() == 3;
        assert MyString1.contarFrecuenciaLetras("").isEmpty();
        assert MyString1.contarFrecuenciaLetras(null).isEmpty();
	}

	@Test
	void testEsPalindroma() {
		 assert MyString1.esPalindroma("reconocer") == true;
	        assert MyString1.esPalindroma("abccba") == true;
	        assert MyString1.esPalindroma("hola") == false;
	        assert MyString1.esPalindroma("a") == false;
	        assert MyString1.esPalindroma("") == false;
	        assert MyString1.esPalindroma(null) == false;
	}
}
