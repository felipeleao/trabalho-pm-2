package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Classe de Testes para o m�todo calculaFermat() 
 * 
 * @author Bruno, Carlos Eduadrdo e Felipe
 * @version 1.1
 * 
 */
public class TestesRotinasFermat {
	private TestePrimos numero = new TestePrimos();
	
	/**Caso de teste para numeros inteiros positivos e PRIMOS.
	 * 
	 *  
	 * @author Cadu, Bruno
	 */
	@Test
	public void testFermatNumeroInteiroPositivoPrimo(){
		
		//fazendo set no numero desejado
		numero.setNumero(2); 
		assertTrue(numero.calculaFermat());
		
		//fazendo set no numero desejado
		numero.setNumero(3); 
		assertTrue(numero.calculaFermat());
		
		//fazendo set no numero desejado
		numero.setNumero(5); 
		assertTrue(numero.calculaFermat());
		
		//fazendo set no numero desejado
		numero.setNumero(7919); 
		assertTrue(numero.calculaFermat());
		
		
	}
	
	/**Caso de teste para numeros inteiros positivos e NAO primos.
	 * 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroPositivoNaoPrimo(){
		
		//fazendo set no numero desejado
		numero.setNumero(1); 
		assertFalse(numero.calculaFermat());
		
		//fazendo set no numero desejado
		numero.setNumero(4); 
		assertFalse(numero.calculaFermat());
		
		//fazendo set no numero desejado
		numero.setNumero(6); 
		assertFalse(numero.calculaFermat());
		
		//fazendo set no numero desejado
		numero.setNumero(8); 
		assertFalse(numero.calculaFermat());
		
		//fazendo set no numero desejado
		numero.setNumero(7917); 
		assertFalse(numero.calculaFermat());
	
	}
	
	/**Caso de teste para numeros inteiros negativos.
	 * 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroNegativo(){
		
		//fazendo set no numero desejado
		numero.setNumero(-1); 
		assertFalse(numero.calculaFermat());
		
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
	public void testFermatNumeroZero(){
		
		//fazendo set no numero desejado
		numero.setNumero(0); 
		assertFalse(numero.calculaFermat());
		
	}
	
	/**Caso de teste para numero de Carmichael.
	 *  
	 * Obs: o numero de Carmichael n�o � um numero primo
	 * mas no teste de Fermat � considerado primo. 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroCarmichael(){
		
		//fazendo set no numero desejado
		numero.setNumero(561); 
		assertTrue(numero.calculaFermat());
		
		
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
	public void testFermatNumeroInteiroPositivoExtremo(){
		
		//fazendo set no numero desejado
		numero.setNumero(2147483647); 
		
		//o numero (2^31) - 1 � um numero primo
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
	public void testFermatNumeroSucessorAoInteiroPositivoExtremo(){
		
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
	public void testFermatNumeroAntecessorAoInteiroPositivoExtremo(){
		
		//fazendo set no numero desejado
		numero.setNumero(2147483646); 
		
		//o numero (2^31) - 2 n�o � um numero primo
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
	public void testFermatNumeroInteiroNegativoExtremo(){
		
		//fazendo set no numero desejado
		numero.setNumero(-2147483648); 
		
		
		assertFalse(numero.calculaFermat());
				
		
	}
	
	/////
	
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
	public void testFermatNumeroSucessorAoInteiroNegativoExtremo(){
		
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
	public void testFermatNumeroAntecessorAoInteiroNegativoExtremo(){
		
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
	public void testFermatString(){
				
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
	public void testFermatPontoFlutuante(){
				
		numero.setNumero(18.333); 
				
		assertFalse(numero.calculaFermat());
				
		
	}
	
	
	
	
	
}