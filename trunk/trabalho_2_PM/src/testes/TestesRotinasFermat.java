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
	
	/**Teste pertencente a classe de equivalencia:
	 * N é um numero inteiro positivo primo
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
	 * N é um numero inteiro positivo nao primo
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
	 * N é um numero inteiro negativo
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
	
	
}
