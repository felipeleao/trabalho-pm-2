
package primos;

/** Classe para realizar testes com os n�meros e verificar se eles s�o
 * primos.
 * @author Bruno, Carlos Eduardo e Felipe;
 * @version 1.2;
 */
public class TestePrimos {
	private static int num_UM = 1;
    private static int num_padrao_teste_fermat = 2;
    private int numero=0;

    /**
     * Construtor Default
     */
    public TestePrimos(){ }
    
    /** Construtor da classe
    *
    * @param Integer - numero
    */
    public TestePrimos(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**M�todo para verificar se um n�mero � primo atrav�s de for�a bruta,
     * divide-se o n�mero passado como parametro por todos os numeros menores
     * que ele e maiores que 1, se houver resto de divis�o igual a zero
     * o n�mero n�o � primo
     *
     * @return Boolean - Informa se o n�mero � primo ou n�o;
     */
    public boolean calculaForcaBruta(){
    	//Teste para verificar se o n�mero � menor que 2
    	if(testaMaiorOuIgualUm()){return false;}
    	
    	for(int i = 2; i < (numero/2) + 1; i++){
            if((numero%i) == 0){
                return false;
            }
        }
        return true;
    }

    /**M�todo de FERMAT para calcular se um n�mero � primo, 
     * este M�todo � menos custoso pois n�o precisa dividir
     * o n�mero por todos os seus antecessores
     * 
     * 
     * @return Boolean - informando se o n�mero � primo ou n�o
     */
    public boolean calculaFermat(){  	
    	//Se o numero for menor ou igual a um o m�todo testaMaiorOuIgualUm()
    	//retorna true e o if retorna false informando que ele n�o � primo
    	if(testaMaiorOuIgualUm()){return false;}
    	
    	//o numero 2 � primo mas nao passa no teste no fermat
    	//pois o n�mero 2 � igual a base do teste de Fermat
        if(numero == 2){return true;}
        
    	if((Math.pow(num_padrao_teste_fermat,numero - 1) % numero) == 1){
            return true;
        }
        return false;
    }
   
    /**M�todo para verificar se o numero passado � maior que 1(um).
    *
    * @param numero
    * @return boolean - informando se o n�mero � menor ou igual a 1 (um).
    */
   private boolean testaMaiorOuIgualUm(){
       if(numero <= num_UM){
           return true;
       }
       return false;
   }
}
