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
        String continua;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("Entre com um n�mero inteiro: ");
            numero = entrada.nextInt();
            try{
                testaMaiorUm(numero);
                eNumeroUm(numero);
                TestePrimos numero_testes_primalidade = new TestePrimos(numero);

                System.out.println("Deseja testar por qual t�cnica?");
                System.out.println("1- For�a Bruta");
                System.out.println("2- Teste de Fermat");

                opcao = entrada.nextInt();
                switch (opcao){
                        case 1:
                            if(numero_testes_primalidade.calculaForcaBruta()){
                            	System.out.println("O n�mero " + numero + " � primo");
                            }
                            else{
                            	System.out.println("O n�mero " + numero + " n�o � primo");
                            }
                            break;
                        case 2:
                            if(numero_testes_primalidade.calculaFermat()){
                            	System.out.println("O n�mero " + numero + " � primo");
                            }
                            else{
                            	System.out.println("O n�mero " + numero + " n�o � primo");
                            }
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
     * @throws Exception
     */
    public static void testaMaiorUm(int numero) throws Exception{
        if(numero<1){
            throw new Exception("\nO n�mero deve ser maior que 1 (um).");
        }
    }
    
    public static void eNumeroUm(int numero) throws Exception{
        if(numero==1){
            throw new Exception("\nO n�mero 1 (um) n�o � primo.");
        }
    }

}
