package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import primos.TestePrimos;

/**
 * Classe de Testes para o m�todo calculaFermat() 
 * 
 * @author Cadu
 * @version 1.0
 * 
 */
public class TestesRotinasFermat {
	private TestePrimos numero = new TestePrimos();
	
	/**Teste pertencente a classe de equivalencia:
	 * N � um numero inteiro positivo primo
	 *  
	 * valores 2,3,5,7919
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
	
	/**Teste pertencente a classe de equivalencia:
	 * N � um numero inteiro positivo nao primo
	 *  
	 * valores 1,4,6,8,7917
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
	
	/**Teste pertencente a classe de equivalencia:
	 * N � um numero inteiro negativo
	 *  
	 * valores -1,-2
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
	
	/**Teste pertencente a classe de equivalencia:
	 * N � igual a 0
	 *  
	 * valores 0
	 */
	@Test
	public void testFermatNumeroZero(){
		
		//fazendo set no numero desejado
		numero.setNumero(0); 
		assertFalse(numero.calculaFermat());
		
	}
	
	/**Teste pertencente a classe de equivalencia:
	 * N � um n�mero de Carmichael
	 * 
	 * Obs: o numero de Carmichael � numero primo mas no teste de Fermat � considerado n�o primo  
	 *  
	 * valores 561,1105,1729
	 */
	@Test
	public void testFermatNumeroCarmichael(){
		
		//fazendo set no numero desejado
		numero.setNumero(561); 
		assertFalse(numero.calculaFermat());
		
		
		//fazendo set no numero desejado
		numero.setNumero(1105); 
		assertFalse(numero.calculaFermat());		
				
		
	}
	
	/**Caso de teste para o maior n�mero inteiro poss�vel.
	 * Maior Inteiro: (2^31)-1 = +2147483647
	 * 
	 * 
	 * 
	 * @author Cadu
	 */
	@Test
	public void testFermatNumeroInteiroPositivoExtremo(){
		
		//fazendo set no numero desejado
		numero.setNumero((int) (Math.pow(2,31)- 1)); 
		
		//o numero (2^31) - 1 � um numero primo
		assertTrue(numero.calculaFermat());
				
		
	}
	
	/**Caso de teste para o n�mero sucessor ao maior inteiro poss�vel.
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
		
		//o numero (2^31) - 1 � um numero primo
		assertFalse(numero.calculaFermat());
				
		
	}
	
	
	
}
