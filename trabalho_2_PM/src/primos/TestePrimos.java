/*
 *
 */

package primos;

/** Classe para realizar testes com os n�meros e verificar se eles s�o
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
    public TestePrimos(){
        this.numero = numero;
    }
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
    public boolean calculaForcaBruta() {
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
    public boolean calculaFermat() {
        if((Math.pow(num_padrao_teste_fermat,numero - 1) % numero) == 1){
            return true;
        }
        return false;
    }

   
}
