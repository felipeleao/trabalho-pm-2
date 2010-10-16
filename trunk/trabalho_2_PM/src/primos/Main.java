package primos;

import java.util.Scanner;

/** Classe principal para chamar o sistema.
 * @author Bruno, Carlos Eduardo e Felipe
 * @version 1.2;
 */
public class Main {

    /** método MAIN para executar o sistema
     */
    public static void main(String[] args) {
        int opcao;
        int numero;
        String continua;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("Entre com um número inteiro: ");
            numero = entrada.nextInt();
            try{
                testaMaiorUm(numero);
                eNumeroUm(numero);
                TestePrimos numero_testes_primalidade = new TestePrimos(numero);

                System.out.println("Deseja testar por qual técnica?");
                System.out.println("1- Força Bruta");
                System.out.println("2- Teste de Fermat");

                opcao = entrada.nextInt();
                switch (opcao){
                        case 1:
                            if(numero_testes_primalidade.calculaForcaBruta()){
                            	System.out.println("O número " + numero + " é primo");
                            }
                            else{
                            	System.out.println("O número " + numero + " não é primo");
                            }
                            break;
                        case 2:
                            if(numero_testes_primalidade.calculaFermat()){
                            	System.out.println("O número " + numero + " é primo");
                            }
                            else{
                            	System.out.println("O número " + numero + " não é primo");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
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

    /**Método para verificar se o numero passado é maior que 1(um).
     *
     * @param numero
     * @throws Exception
     */
    public static void testaMaiorUm(int numero) throws Exception{
        if(numero<1){
            throw new Exception("\nO número deve ser maior que 1 (um).");
        }
    }
    
    public static void eNumeroUm(int numero) throws Exception{
        if(numero==1){
            throw new Exception("\nO número 1 (um) não é primo.");
        }
    }

}
