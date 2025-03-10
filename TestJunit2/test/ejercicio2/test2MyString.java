package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.model.MyString2;

class MyStringObjTest {
	@Test
	public void esPalindromoTest() {
		MyString2 str = new MyString2("Hola Mundo");
		MyString2 str2 = new MyString2("reconocer");
		assertFalse(str.getEsPalindromo());
		assertTrue(str2.getEsPalindromo());
	}
	
}
