package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Classe de Testes para o método calculaFermat() 
 * 
 * @author Bruno, Carlos Eduadrdo e Felipe
 * @version 1.1
 * 
 */
public class TestesRotinasFermat {
	private TestePrimos numero = new TestePrimos();
	
	/**Casos de teste para numeros inteiros positivos e PRIMOS.
	 * 
	 *  
	 * @author Cadu, Bruno
	 * @throws Exception 
	 */
	@Test
	public void testFermatPrimeiroInteiroPositivoPrimo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(2); 
		assertTrue(numero.calculaFermat());
	}
	
	@Test
	public void testFermatSegundoInteiroPositivoPrimo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(3); 
		assertTrue(numero.calculaFermat());
	}
	
	@Test
	public void testFermatTerceiroInteiroPositivoPrimo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(5); 
		assertTrue(numero.calculaFermat());
	}
	
	@Test
	public void testFermatNumeroInteiroPositivoPrimo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(7919); 
		assertTrue(numero.calculaFermat());
	}
	
	/**Caso de teste para o número UM.
	 * 
	 *  
	 * @author Cadu, Bruno
	 * @throws Exception - Exceção que informa que o número UM não é primo.
	 */
	@Test (expected = Exception.class)
	public void testFermatNumeroUM() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(1); 
		assertFalse(numero.calculaFermat());
	}
	
	/**Casos de teste para numeros inteiros positivos e NAO primos.
	 * 
	 *  
	 * @author Cadu, Bruno
	 */
	@Test
	public void testFermatPrimeiroInteiroPositivoNaoPrimo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(4); 
		assertFalse(numero.calculaFermat());
	}
	
	@Test
	public void testFermatSegundoInteiroPositivoNaoPrimo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(6); 
		assertFalse(numero.calculaFermat());
	}
		
	@Test
	public void testFermatTerceiroInteiroPositivoNaoPrimo() throws Exception{	
		//fazendo set no numero desejado
		numero.setNumero(8); 
		assertFalse(numero.calculaFermat());
	}
	
	@Test
	public void testFermatNumeroInteiroPositivoNaoPrimo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(7917); 
		assertFalse(numero.calculaFermat());
	}
	
	/**Casos de teste para numeros inteiros negativos.
	 * 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatPrimeiroInteiroNegativo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(-1); 
		assertFalse(numero.calculaFermat());
	}
	
	@Test
	public void testFermatSegundoInteiroNegativo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(-2); 
		assertFalse(numero.calculaFermat());
	}
	
	/**Caso de teste para o numero 0.
	 * 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroZero() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(0); 
		assertFalse(numero.calculaFermat());
	}
	
	/**Caso de teste para numero de Carmichael.
	 *  
	 * Obs: o numero de Carmichael não é um numero primo
	 * mas no teste de Fermat é considerado primo. 
	 *  
	 * @author Cadu
	 */
	@Test
	public void primeiroTestFermatNumeroCarmichael() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(561); 
		assertTrue(numero.calculaFermat());
	}
	
	@Test
	public void segundoTestFermatNumeroCarmichael() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(1729); 
		assertTrue(numero.calculaFermat());		
	}
	
	/**Caso de teste para o maior numero inteiro possivel.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroPositivoExtremo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(2147483647); 
		//o numero (2^31) - 1 é um numero primo
		assertTrue(numero.calculaFermat());
	}
	
	/**Caso de teste para o numero sucessor ao maior inteiro possivel.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * Sucessor testado:
	 * (2^31) 	= +2147483648
	 *
	 * 
	 * @author Cadu
	 */
	@Test (expected = Error.class)
	public void testFermatNumeroSucessorAoInteiroPositivoExtremo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(2147483648); 
		assertFalse(numero.calculaFermat());
	}
	
	/**Caso de teste para o numero antecessor ao maior inteiro possivel.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * Antecessor testado:
	 * (2^31)-2 	= +2147483646
	 *
	 * 
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroAntecessorAoInteiroPositivoExtremo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(2147483646); 
		//o numero (2^31) - 2 não é um numero primo
		assertFalse(numero.calculaFermat());
	}
	
	/**Caso de teste para o menor numero inteiro possivel.
	 * Menor Inteiro: -((2^31)-1) = -2147483648
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroNegativoExtremo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(-2147483648); 
		assertFalse(numero.calculaFermat());
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
	public void testFermatNumeroSucessorAoInteiroNegativoExtremo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(-2147483647); 
		assertFalse(numero.calculaFermat());
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
	public void testFermatNumeroAntecessorAoInteiroNegativoExtremo() throws Exception{
		//fazendo set no numero desejado
		numero.setNumero(2147483649); 
		assertFalse(numero.calculaFermat());
	}
	
	/**Caso de teste para valor nao inteiro (String).
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test (expected = Error.class)
	public void testFermatString() throws Exception{
		numero.setNumero("abc"); 
		assertFalse(numero.calculaFermat());
	}
	
	/**Caso de teste para valor nao inteiro (Ponto Flutuante).
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test (expected = Error.class)
	public void testFermatPontoFlutuante() throws Exception{
		numero.setNumero(18.333); 
		assertFalse(numero.calculaFermat());
	}
	
}
