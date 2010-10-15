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
	 * <p>
	 * Números testados:
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
	
	
	/**Método para testar o maior inteiro possível.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * <p>
	 * Número testado:
	 * <br># (2^31)-1 - Resultado esperado: True -> OK
	 * 
	 * @author Felipe
	 */
	@Test 
	public void testLimiteSuperiorInt(){
		numeroTeste.setNumero(2147483647);
		assertTrue(numeroTeste.calculaForcaBruta());
	}
	
	
	/**Método para testar o menor inteiro possível.
	 * <br>Menor Inteiro: -(2^31) = -2147483648
	 * <p>
	 * Número testado:
	 * <br># -(2^31) - Resultado esperado: False -> OK
	 * 
	 * @author Felipe
	 */
	@Test 
	public void testLimiteInferiorInt(){
		numeroTeste.setNumero(-2147483648);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	
	/**Método para testar somente números inteiros e positivos.
	 * Este caso de teste tem como objetivo testar somente números
	 * que NÃO são primos!
	 * <p>
	 * Números testados:
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
	
	
	/**Método para testar somente números inteiros e negativos.
	 * Passam-se números inteiros negativos e espera-se que 
	 * eles não sejam Primos.
	 * <p>
	 * Números testados:
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
	
	/**Método para testar os números adjacentes ao
	 * maior inteiro possível e ao menor inteiro possível.
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
	public void testIntPositivoOutOfRange(){
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
	public void testIntNegativoOutOfRange(){
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
	public void testParametroString(){
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
	public void testParametroPontoFlutuante(){
		numeroTeste.setNumero(18.333);
	}
	
	
	/**Método para testar números de Carmichael. Numeros de 
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
	public void testNumeroCarmichael(){
		numeroTeste.setNumero(561);
		assertFalse(numeroTeste.calculaForcaBruta());
		
		numeroTeste.setNumero(1105);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
}
