package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Classe de Testes para o método calculaFermat() 
 * 
 * @author Cadu
 * @version 1.0
 * 
 */
public class TestesRotinasFermat {
	private TestePrimos numero = new TestePrimos();
	
	/**Caso de teste para numeros inteiros positivos e PRIMOS.
	 * 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroPositivoPrimo(){
		
		//fazendo set no numero desejado
		numero.setNumero(2); 
		//assertTrue(numero.calculaFermat());
		
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
	 * Obs: o numero de Carmichael não é um numero primo
	 * mas no teste de Fermat é considerado primo. 
	 *  
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroCarmichael(){
		
		//fazendo set no numero desejado
		numero.setNumero(561); 
		assertTrue(numero.calculaFermat());
		
		
		//fazendo set no numero desejado
		numero.setNumero(1105); 
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
		
		//o numero (2^31) - 2 não é um numero primo
		assertFalse(numero.calculaFermat());
				
		
	}
	
	
	
}
