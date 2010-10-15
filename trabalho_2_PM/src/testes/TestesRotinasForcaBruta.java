package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Rotina para realizar testes no m�todo de for�a bruta
 * 
 * @author Felipe
 * @version 1.0
 * 
 */
public class TestesRotinasForcaBruta {
	
	TestePrimos numeroTeste = new TestePrimos();
	
	/**M�todo para testar somente n�meros inteiros e positivos.
	 * Todo n�mero testado neste m�todo � primo.
	 * 
	 * N�meros testados:
	 * 	# 2 - Resultado esperado: True -> OK
	 *  # 3 - Resultado esperado: True -> OK
	 *  # 5 - Resultado esperado: True -> OK
	 *  # 7919 - Resultado esperado: True -> OK
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
	
	
	/**M�todo para testar o maior inteiro poss�vel.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * N�mero testado:
	 * 	# (2^31)-1 - Resultado esperado: True -> OK
	 * 
	 * @author Felipe
	 */
	@Test
	public void testLimiteInt(){
		numeroTeste.setNumero((int)(Math.pow(2, 31)-1));
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todo para testar somente n�meros inteiros e positivos.
	 * Este caso de teste tem como objetivo testar somente n�meros
	 * que N�O s�o primos!
	 * 
	 * N�meros testados:
	 * 	# 1 - Resultado esperado: False -> OK
	 *  # 4 - Resultado esperado: False -> OK
	 *  # 6 - Resultado esperado: False -> OK
	 *  # 8 - Resultado esperado: False -> OK
	 *  # 7917 - Resultado esperado: False -> OK
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
		
	}
	
	
	/**M�todo para testar somente n�meros inteiros e negativos.
	 * Passam-se n�meros inteiros negativos e espera-se que 
	 * eles n�o sejam Primos.
	 * 
	 * N�meros testados:
	 * 	# (-1) - Resultado esperado: False -> OK
	 *  # (-2) - Resultado esperado: False -> OK
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
	
	/**M�todo para testar os n�meros adjacentes ao
	 * maior inteiro poss�vel.
	 * 
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * Adjacentes testados:
	 *  # (2^31)-2 = +2147483646 - Resultado Esperado: False -> OK
	 *  # (2^31)-3 = +2147483645 - Resultado Esperado: False -> OK
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
	
	
	/**M�todo para testar n�meros de Carmichael. Numeros de 
	 * Carmichael s�o n�meros N�O primos que ao serem testados 
	 * pelo m�todo de Fermat s�o reconhecidos como primos. O 
	 * m�todo de for�a bruta deve informar que os n�meros N�O S�O PRIMOS.
	 * 
	 * N�meros testados:
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
