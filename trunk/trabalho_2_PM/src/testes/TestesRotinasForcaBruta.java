package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Rotina para realizar testes no método de força bruta
 * 
 * @author Bruno, Carlos Eduadrdo e Felipe
 * @version 1.1.1
 * 
 */
public class TestesRotinasForcaBruta {
	
	TestePrimos numeroTeste = new TestePrimos();
	
	/**Métodos para testar somente números inteiros e positivos.
	 * Todos os números testado nestes métodos são primos.
	 * <p>
	 * Números testados:
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
	
	
	/**Método para testar o maior inteiro possível.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * <p>
	 * Número testado:
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
	
	
	/**Método para testar o menor inteiro possível.
	 * <br>Menor Inteiro: -(2^31) = -2147483648
	 * <p>
	 * Número testado:
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
	
	
	/**Métodos para testar se o número UM não é primo.
	 * 
	 * <p>
	 * Números testados:
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
	
	
	/**Métodos para testar somente números inteiros e positivos.
	 * Este caso de teste tem como objetivo testar somente números
	 * que NÃO são primos!
	 * <p>
	 * Números testados:
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
	
	
	/**Métodos para testar somente números inteiros e negativos.
	 * Passam-se números inteiros negativos e espera-se que 
	 * eles não sejam Primos.
	 * <p>
	 * Números testados:
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
	
	/**Método para testar o segundo maior inteiro positivo possível 
	 * <p>
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * </p>
	 * <p>
	 * Número testado:
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
	
	/**Método para testar o segundo maior inteiro negativo possível
	 * <p>
	 * <br>Menor Inteiro: -(2^31) = -2147483648
	 * </p>
	 * <p>
	 * Número testado:
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
	
	
	/**Método para testar o primeiro número positivo não suportado 
	 * pelo tipo INT
	 * <p>
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * </p>
	 * <p>
	 * Adjacente testado:
	 * <br># (2^31) = +2147483648 - Resultado Esperado: Exceção -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testIntPositivoOutOfRange() {
		numeroTeste.setNumero(2147483648);
	}
	
	
	/**Método para testar o primeiro número negativo não suportado 
	 * pelo tipo INT
	 * <p>
	 * Menor Inteiro: -(2^31) = -2147483648
	 * </p>
	 * <p>
	 * Adjacente testado:
	 * <br># -(2^31)-1 = -2147483649 - Resultado Esperado: Exceção -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testIntNegativoOutOfRange() {
		numeroTeste.setNumero(-2147483649);
	}
	
	
	/**Método para testar a passagem de String como parâmetro
	 * <p>
	 * String testada:
	 * <br># ABC - Resultado Esperado: Exceção -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testParametroString() {
		numeroTeste.setNumero("ABC");
	}
	
	
	/**Método para testar a passagem de Ponto Flutuante como parâmetro
	 * <p>
	 * String testada:
	 * <br># 18.333 - Resultado Esperado: Exceção -> OK
	 * </p>
	 * @author Felipe
	 */
	@Test(expected = Error.class)
	public void testParametroPontoFlutuante() {
		numeroTeste.setNumero(18.333);
	}
	
	
	/**Métodos para testar números de Carmichael. Numeros de 
	 * Carmichael são números NÃO primos que ao serem testados 
	 * pelo método de Fermat são reconhecidos como primos. O 
	 * método de força bruta deve informar que os números NÃO SÃO PRIMOS.
	 * <p>
	 * Números testados:
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
