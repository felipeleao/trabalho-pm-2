package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Rotina para realizar testes no método de força bruta
 * 
 * @author Felipe
 * @version 1.0
 * 
 */
public class TestesRotinasForcaBruta {
	
	TestePrimos numeroTeste = new TestePrimos();
	
	/**Método para testar somente números inteiros e positivos.
	 * Todo número testado neste método é primo.
	 * 
	 * @author Felipe
	 * 
	 */
	@Test
	public void testIntPosPrimos(){
		
		numeroTeste.setNumero(2);
		assertTrue(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(3);
		assertTrue(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(5);
		assertTrue(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(7919);
		assertTrue(numeroTeste.calculaForcaBruta());
		
	}
	
	
	/**Método para testar o maior inteiro possível.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * @author Felipe
	 */
	@Test
	public void testLimiteInt(){
		numeroTeste.setNumero((int)(Math.pow(2, 31)-1));
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	
	/**Método para testar somente números inteiros e positivos.
	 * Este caso de teste tem como objetivo testar somente números
	 * que NÃO são primos!
	 * 
	 * @author Felipe
	 */
	@Test
	public void testIntPosNPrimo(){
		numeroTeste.setNumero(1);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(4);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(6);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(8);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(7917);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(8);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**Método para testar somente números inteiros e negativos.
	 * Passam-se números inteiros negativos e espera-se que 
	 * eles não sejam Primos.
	 * 
	 * @author Felipe
	 */
	@Test
	public void testIntNegativo(){
		numeroTeste.setNumero(-1);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(-2);
		assertFalse(numeroTeste.calculaForcaBruta());
		
	}
	
	/**Método para testar os números adjacentes ao
	 * maior inteiro possível.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * Adjacentes testados:
	 * (2^31)-2 = +2147483646
	 * (2^31)-3 = +2147483645
	 * 
	 * @author Felipe
	 */
	@Test
	public void testAdjLimiteInt(){
		numeroTeste.setNumero((int)(Math.pow(2, 31)-2));
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero((int)(Math.pow(2, 31)-3));
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**Método para testar números de Carmichael. Numeros de 
	 * Carmichael são números NÃO primos que ao serem testados 
	 * pelo método de Fermat são reconhecidos como primos. O 
	 * método de força bruta deve informar que os números NÃO SÃO PRIMOS.
	 * 
	 * Números testados:
	 * 	# 561 - Resultado esperado: False -> OK
	 *  # 1105 - Resultado esperado: False -> OK
	 * 
	 * @author Felipe
	 */
	@Test
	public void testCarmichael(){
		numeroTeste.setNumero(561);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(1105);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
}
