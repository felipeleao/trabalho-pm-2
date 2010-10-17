package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Classe de Testes para o método calculaFermat() 
 * 
 * @author Bruno, Carlos Eduadrdo e Felipe
 * @version 1.1.1
 * 
 */
public class TestesRotinasFermat {
	private TestePrimos numeroTeste = new TestePrimos();
	
	/**Casos de teste para numeros inteiros positivos e PRIMOS.
	 * 
	 *  
	 * @author Cadu, Bruno
	 * @ 
	 */
	@Test
	public void testFermatInteiroPositivoPrimo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(2); 
		assertTrue(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(3); 
		assertTrue(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(5); 
		assertTrue(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(7919); 
		assertTrue(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para o número UM.
	 * 
	 *  
	 * @author Cadu, Bruno
	 * 
	 */
	@Test
	public void testFermatNumeroUM(){		
		//fazendo set no numero desejado
		numeroTeste.setNumero(1);
		assertFalse(numeroTeste.calculaForcaBruta());
	}
	
	/**Casos de teste para numeros inteiros positivos e NAO primos.
	 * 
	 *  
	 * @author Cadu, Bruno
	 */
	@Test
	public void testFermatInteiroPositivoNaoPrimo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(4); 
		assertFalse(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(6); 
		assertFalse(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(8); 
		assertFalse(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(7917); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Casos de teste para numeros inteiros negativos.
	 * 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatInteiroNegativo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(-1); 
		assertFalse(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(-2); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para o numero 0.
	 * 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroZero() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(0); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para numero de Carmichael.
	 *  
	 * <p>Obs: o numero de Carmichael não é um numero primo
	 * mas no teste de Fermat é considerado primo. 
	 *  
	 * @author Cadu
	 */
	@Test
	public void TestFermatNumeroCarmichael() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(561); 
		assertTrue(numeroTeste.calculaFermat());
		
		//fazendo set no numero desejado
		numeroTeste.setNumero(1729); 
		assertTrue(numeroTeste.calculaFermat());		
	}
	
	/**Caso de teste para o maior numero inteiro possivel.
	 * <br>Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroPositivoExtremo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(2147483647); 
		//o numero (2^31) - 1 é um numero primo
		assertTrue(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para o numero sucessor ao maior inteiro possivel.
	 * <br>Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * <p>Sucessor testado:
	 * <br>(2^31) 	= +2147483648
	 *
	 * 
	 * @author Cadu
	 */
	@Test (expected = Error.class)
	public void testFermatNumeroSucessorAoInteiroPositivoExtremo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(2147483648); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para o numero antecessor ao maior inteiro possivel.
	 * <br>Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * <p>Antecessor testado:
	 * <br>(2^31)-2 	= +2147483646
	 *
	 * 
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroAntecessorAoInteiroPositivoExtremo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(2147483646); 
		//o numero (2^31) - 2 não é um numero primo
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para o menor numero inteiro possivel.
	 * Menor Inteiro: -((2^31)-1) = -2147483648
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroNegativoExtremo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(-2147483648); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para o numero sucessor ao menor inteiro possivel.
	 * Menor Inteiro: -((2^31)-1) = -2147483648
	 * 
	 * Sucessor testado:
	 * -((2^31)) = -2147483647
	 *
	 * 
	 * @author Cadu
	 */
	@Test 
	public void testFermatNumeroSucessorAoInteiroNegativoExtremo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(-2147483647); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para o numero antecessor ao maior inteiro possivel.
	 * Menor Inteiro: -((2^31)-1) = -2147483648
	 * 
	 * Antecessor testado:
	 * -((2^31)-2) = -2147483649
	 *
	 * 
	 * @author Cadu
	 */
	@Test (expected = Error.class)
	public void testFermatNumeroAntecessorAoInteiroNegativoExtremo() {
		//fazendo set no numero desejado
		numeroTeste.setNumero(2147483649); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para valor nao inteiro (String).
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test (expected = Error.class)
	public void testFermatString() {
		numeroTeste.setNumero("abc"); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
	/**Caso de teste para valor nao inteiro (Ponto Flutuante).
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test (expected = Error.class)
	public void testFermatPontoFlutuante() {
		numeroTeste.setNumero(18.333); 
		assertFalse(numeroTeste.calculaFermat());
	}
	
}
