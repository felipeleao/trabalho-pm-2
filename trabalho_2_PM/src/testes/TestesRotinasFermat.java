package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import primos.TestePrimos;


public class TestesRotinasFermat {
private TestePrimos numero1 = new TestePrimos(7);
	
	@Test
	public void testForcaBruta(){
		assertTrue(numero1.calculaFermat());
		
		
	}
}
