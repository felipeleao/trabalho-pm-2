package testes;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import primos.TestePrimos;


public class TestesRotinasPrimalidade {
	private TestePrimos numero1 = new TestePrimos(7);
	
	@Test
	public void testForcaBruta(){
		assertTrue(numero1.calculaForcaBruta());	
		
	}
	
	@Test
	public void testFermat(){
		assertTrue(numero1.calculaFermat());
	}
}
