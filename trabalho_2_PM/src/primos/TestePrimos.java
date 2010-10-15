
package primos;

/** Classe para realizar testes com os números e verificar se eles são
 * primos.
 * @author Bruno, Carlos Eduardo e Felipe;
 * @version 1.0;
 */
public class TestePrimos {
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
    /**Método para verificar se um número é primo através de força bruta,
     * divide-se o número passado como parametro por todos os numeros menores
     * que ele e maiores que 1, se houver resto de divisão igual a zero
     * o número não é primo
     *
     * @return Boolean - Informa se o número é primo ou não;
     */
    public boolean calculaForcaBruta(){
        
    	if(numero == 1 || numero == 4){return false;}
        
        if(numero < 1){return false;}
    	
    	for(int i = 2; i < (numero/2) + 1; i++){
            if((numero%i) == 0){
                return false;
            }
        }
        return true;
    }

    /**Método de FERMAT para calcular se um número é primo, 
     * este Método é menos custoso pois não precisa dividir
     * o número por todos os seus antecessores
     * 
     * 
     * @return Boolean - informando se o número é primo ou não
     */
    public boolean calculaFermat() {
    	
    	if(numero == 1){return false;}
        
        if(numero < 1){return false;}
    	
        //o numero 2 é primo mas nao passa no teste no fermat
        if(numero == 2){return true;}
        
    	if((Math.pow(num_padrao_teste_fermat,numero - 1) % numero) == 1){
            return true;
        }
        return false;
    }

   
}
