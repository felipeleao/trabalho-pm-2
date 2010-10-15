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
	 * <p>
	 * N�meros testados:
	 * <br># 2 - Resultado esperado: True -> OK
	 * <br># 3 - Resultado esperado: True -> OK
	 * <br># 5 - Resultado esperado: True -> OK
	 * <br># 7919 - Resultado esperado: True -> OK
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
	 * <p>
	 * N�mero testado:
	 * <br># (2^31)-1 - Resultado esperado: True -> OK
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
	 * <p>
	 * N�meros testados:
	 * <br># 1 - Resultado esperado: False -> OK
	 * <br># 4 - Resultado esperado: False -> OK
	 * <br># 6 - Resultado esperado: False -> OK
	 * <br># 8 - Resultado esperado: False -> OK
	 * <br># 7917 - Resultado esperado: False -> OK
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
	 * <p>
	 * N�meros testados:
	 * <br># (-1) - Resultado esperado: False -> OK
	 * <br># (-2) - Resultado esperado: False -> OK
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
	 * maior inteiro poss�vel e ao menor inteiro poss�vel.
	 * <p>
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * <br>Menor Inteiro: -(2^31) = -2147483648
	 * </p>
	 * <p>
	 * Adjacentes testados:
	 * <br># (2^31)-2 = +2147483646 - Resultado Esperado: False -> OK
	 * <br># -(2^31)+1 = -2147483647 - Resultado Esperado: False -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test
	public void testAdjLimiteInt(){
		numeroTeste.setNumero(2147483646);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(-2147483647);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todo para testar o primeiro n�mero positivo n�o suportado 
	 * pelo tipo INT
	 * <p>
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * </p>
	 * <p>
	 * Adjacente testado:
	 * <br># (2^31) = +2147483648 - Resultado Esperado: Exce��o -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testIntPosOutRange(){
		numeroTeste.setNumero(2147483648);
		//assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todo para testar o primeiro n�mero negativo n�o suportado 
	 * pelo tipo INT
	 * <p>
	 * Menor Inteiro: -(2^31) = -2147483648
	 * </p>
	 * <p>
	 * Adjacente testado:
	 * <br># -(2^31)-1 = -2147483649 - Resultado Esperado: Exce��o -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testIntNegOutRange(){
		numeroTeste.setNumero(-2147483649);
		//assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todo para testar a passagem de String como par�metro
	 * <p>
	 * String testada:
	 * <br># ABC - Resultado Esperado: Exce��o -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testParamString(){
		numeroTeste.setNumero("ABC");
		//assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	
	/**M�todo para testar n�meros de Carmichael. Numeros de 
	 * Carmichael s�o n�meros N�O primos que ao serem testados 
	 * pelo m�todo de Fermat s�o reconhecidos como primos. O 
	 * m�todo de for�a bruta deve informar que os n�meros N�O S�O PRIMOS.
	 * <p>
	 * N�meros testados:
	 * <br># 561 - Resultado esperado: False -> OK
	 * <br># 1105 - Resultado esperado: False -> OK
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
