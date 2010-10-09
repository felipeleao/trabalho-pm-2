/*
 *
 */

package primos;

/** Classe para realizar testes com os números e verificar se eles são
 * primos.
 * @author Bruno, Felipe e Cadu;
 * @version 1.0;
 */
public class TestePrimos {
    private static int num_padrao_teste_fermat = 2;
    private int numero;

    /** Construtor da classe
     *
     * @param numero
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
     * @return String - Informa se o número é primo ou não;
     */
    public String calculaForcaBruta() {
        for(int i = 2; i < numero; i++){
            if((numero%i) == 0){
                return "O número " + numero + " não é primo";
            }
        }
        return "O número " + numero + " é primo";
    }

    /** Método de FERMAT para calcular se um número é primo, 
     * este método é menos custoso pois não precisa dividir
     * o número por todos os seus antecessores
     * 
     * @return String - Texto infromando se o número é primo ou não
     */
    public String calculaFermat() {
        if((Math.pow(num_padrao_teste_fermat,numero - 1) % numero) == 1){
            return "O número " + numero +" é primo";
        }
        return "O número " + numero + " não é primo";
    }

   
}
