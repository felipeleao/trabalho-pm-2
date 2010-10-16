package primos;

import java.util.Scanner;

/** Classe principal para chamar o sistema.
 * @author Bruno, Carlos Eduardo e Felipe
 * @version 1.2;
 */
public class Main {

    /** m�todo MAIN para executar o sistema
     */
    public static void main(String[] args) {
        int opcao;
        int numero;
        boolean numeroEPrimo;
        String continua;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("Entre com um n�mero inteiro: ");
            numero = entrada.nextInt();
            try{
                testaMaiorUm(numero);
                TestePrimos numero_testes_primalidade = new TestePrimos(numero);

                System.out.println("Deseja testar por qual t�cnica?");
                System.out.println("1- For�a Bruta");
                System.out.println("2- Teste de Fermat");

                opcao = entrada.nextInt();
                switch (opcao){
                        case 1:
                        	numeroEPrimo = numero_testes_primalidade.calculaForcaBruta();
                        	ePrimo(numero, numeroEPrimo);
                        	break;
                            
                        case 2:
                        	numeroEPrimo = numero_testes_primalidade.calculaFermat();
                        	ePrimo(numero, numeroEPrimo);
                        	break;
                        	
                        default:
                            System.out.println("Op��o inv�lida.");
                            break;
                            
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("\nDeseja continuar (Sim ou Nao)? ");
            continua = entrada.next();
            System.out.println();
        }while(continua.equals("sim") || continua.equals("Sim"));
        System.out.println("Programa Terminado");
    }

    /**M�todo para verificar se o numero passado � maior que 1(um).
     *
     * @param numero
     * @throws Exception - informando que o n�mero passado deve ser maior que 1 (um)
     */
    public static void testaMaiorUm(int numero) throws Exception{
        if(numero<1){
            throw new Exception("\nO n�mero deve ser maior que 1 (um).");
        }
    }
   
   /**M�todo para verificar se o numero passado � primo ou n�o e dar a 
    * resposta adequada.
    *
    * @param numero
    * @param ePrimoFlag - indica o resultado obtido passado pela fun��o de c�lculo
    */
    public static void ePrimo(int numero, boolean ePrimoFlag){
    	if(ePrimoFlag){
        	System.out.println("O n�mero " + numero + " � primo");
        }
        else{
        	System.out.println("O n�mero " + numero + " n�o � primo");
        }
    }
    
}
