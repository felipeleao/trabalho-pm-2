package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Rotina para realizar testes no m�todo de for�a bruta
 * 
 * @author Bruno, Carlos Eduadrdo e Felipe
 * @version 1.1.1
 * 
 */
public class TestesRotinasForcaBruta {
	
	TestePrimos numeroTeste = new TestePrimos();
	
	/**M�todos para testar somente n�meros inteiros e positivos.
	 * Todos os n�meros testado nestes m�todos s�o primos.
	 * <p>
	 * N�meros testados:
	 * <br># 2 - Resultado esperado: True -> OK
	 * <br># 3 - Resultado esperado: True -> OK
	 * <br># 5 - Resultado esperado: True -> OK
	 * <br># 7919 - Resultado esperado: True -> OK
	 * 
	 * @author Felipe
	 * @ 
	 * 
	 */
	@Test
	public void testPrimeiroIntPositivoPrimos() {
		numeroTeste.setNumero(2);
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void testSegundoIntPositivoPrimos() {
		numeroTeste.setNumero(3);
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void tesTerceirotIntPositivoPrimos() {
		numeroTeste.setNumero(5);
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void testIntPositivoPrimos() {
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
	 * @ 
	 */
	@Test 
	public void testLimiteSuperiorInt() {
		numeroTeste.setNumero(2147483647);
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todo para testar o menor inteiro poss�vel.
	 * <br>Menor Inteiro: -(2^31) = -2147483648
	 * <p>
	 * N�mero testado:
	 * <br># -(2^31) - Resultado esperado: False -> OK
	 * 
	 * @author Felipe, Bruno
	 * @ 
	 */
	@Test
	public void testLimiteInferiorInt() {
		numeroTeste.setNumero(-2147483648);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todos para testar se o n�mero UM n�o � primo.
	 * 
	 * <p>
	 * N�meros testados:
	 * <br># 1 - Resultado esperado: False -> OK
	 * 
	 * @author Felipe, Bruno
	 *
	 */
	@Test
	public void testNumeroUM(){
		numeroTeste.setNumero(1);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todos para testar somente n�meros inteiros e positivos.
	 * Este caso de teste tem como objetivo testar somente n�meros
	 * que N�O s�o primos!
	 * <p>
	 * N�meros testados:
	 * <br># 4 - Resultado esperado: False -> OK
	 * <br># 6 - Resultado esperado: False -> OK
	 * <br># 8 - Resultado esperado: False -> OK
	 * <br># 7917 - Resultado esperado: False -> OK
	 * 
	 * @author Felipe, Bruno
	 * @ 
	 */
	@Test
	public void testSegundoIntPositivoNaoPrimo() {
		numeroTeste.setNumero(4);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void testTerceiroIntPositivoNaoPrimo() {
		numeroTeste.setNumero(6);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void testQuartoIntPositivoNaoPrimo() {
		numeroTeste.setNumero(8);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void testIntPositivoNaoPrimo() {
		numeroTeste.setNumero(7917);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**M�todos para testar somente n�meros inteiros e negativos.
	 * Passam-se n�meros inteiros negativos e espera-se que 
	 * eles n�o sejam Primos.
	 * <p>
	 * N�meros testados:
	 * <br># (-1) - Resultado esperado: False -> OK
	 * <br># (-2) - Resultado esperado: False -> OK
	 * 
	 * @author Felipe
	 * @ 
	 */
	@Test
	public void testPrimeiroIntNegativo() {
		numeroTeste.setNumero(-1);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void testSegundoIntNegativo() {
		numeroTeste.setNumero(-2);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	/**M�todo para testar o segundo maior inteiro positivo poss�vel 
	 * <p>
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * </p>
	 * <p>
	 * N�mero testado:
	 * <br># (2^31)-2 = +2147483646 - Resultado Esperado: False -> OK
	 * </p>
	 * @author Felipe, Bruno
	 * @ 
	 */
	
	@Test 
	public void testAdjacenteLimiteSuperiorInt() {
		numeroTeste.setNumero(2147483646);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	/**M�todo para testar o segundo maior inteiro negativo poss�vel
	 * <p>
	 * <br>Menor Inteiro: -(2^31) = -2147483648
	 * </p>
	 * <p>
	 * N�mero testado:
	 * <br># -(2^31)+1 = -2147483647 - Resultado Esperado: False -> OK
	 * </p>
	 * @author Felipe, Bruno
	 * @ 
	 */
	@Test
	public void testAdjacenteLimiteInferiorInt() {
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
	public void testIntPositivoOutOfRange() {
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
	public void testIntNegativoOutOfRange() {
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
	public void testParametroString() {
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
	public void testParametroPontoFlutuante() {
		numeroTeste.setNumero(18.333);
	}
	
	
	/**M�todos para testar n�meros de Carmichael. Numeros de 
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
	public void primeiroTestNumeroCarmichael() {
		numeroTeste.setNumero(561);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	@Test
	public void segundoTestNumeroCarmichael() {
		numeroTeste.setNumero(1105);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
}
