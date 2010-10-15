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
	public void testIntPositivoPrimos(){
		
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
	public void testLimiteSuperiorInt(){
		numeroTeste.setNumero(2147483647);
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todo para testar o menor inteiro poss�vel.
	 * <br>Menor Inteiro: -(2^31) = -2147483648
	 * <p>
	 * N�mero testado:
	 * <br># -(2^31) - Resultado esperado: False -> OK
	 * 
	 * @author Felipe
	 */
	@Test 
	public void testLimiteInferiorInt(){
		numeroTeste.setNumero(-2147483648);
		assertFalse(numeroTeste.calculaForcaBruta());
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
	public void testIntPositivoNaoPrimo(){
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
	public void testAdjacenteLimiteInt(){
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
	public void testIntPositivoOutOfRange(){
		numeroTeste.setNumero(2147483648);
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
	public void testIntNegativoOutOfRange(){
		numeroTeste.setNumero(-2147483649);
	}
	
	
	/**M�todo para testar a passagem de String como par�metro
	 * <p>
	 * String testada:
	 * <br># ABC - Resultado Esperado: Exce��o -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testParametroString(){
		numeroTeste.setNumero("ABC");
	}
	
	
	/**M�todo para testar a passagem de Ponto Flutuante como par�metro
	 * <p>
	 * String testada:
	 * <br># 18.333 - Resultado Esperado: Exce��o -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testParametroPontoFlutuante(){
		numeroTeste.setNumero(18.333);
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
	public void testNumeroCarmichael(){
		numeroTeste.setNumero(561);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(1105);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
}
