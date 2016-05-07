package prueba;

import static org.junit.Assert.*;
import org.junit.Test;
import src.FromRomanToEntero;


public class FromRomanToEnteroTest {
	FromRomanToEntero arabic = new FromRomanToEntero();
	int n;
	@Test
	public void testI() {
		 n = arabic.toEntero("I");
		assertEquals(1, n);
	}

	@Test
	public void testV() {
		 n = arabic.toEntero("IX");
		assertEquals(9, n);
	}

	@Test
	public void testL() {
		n = arabic.toEntero("LI");
		assertEquals(51, n);
	}

	@Test
	public void testDLXXIX() {		
		n = arabic.toEntero("DCXLIV");
		assertEquals(644, n);
	}
	
	@Test
	public void testM() {
		n = arabic.toEntero("M");
		assertEquals(1000, n);
	}
}