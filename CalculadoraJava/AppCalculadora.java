import java.util.Scanner;

public class AppCalculadora{

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*Soma implementada */

        String opc = " ";

        do{

            System.out.println("----------------------------------------------------------------");
            System.out.println("------------------------Calculadora-----------------------------");

            System.out.println("Digite: \n1 - Para realizar uma soma\n");
            int opc2 = scanner.nextInt();

            switch (opc2) {
                case 1:
                    System.out.println("Insira um numero: \n");
                    float s1 = scanner.nextFloat();

                    System.out.println("Insira o outro numero: \n");
                    float s2 = scanner.nextFloat();

                    float soma = s1 + s2;

                    System.out.println("O resultado da some entre " +s1+ " + " +s2+ " é igual a "+soma);
                    break;
                
                default:
                    break;
            }
            
            scanner.nextLine();

            System.out.println("Deseja continuar calculando?\nDigite: sim ou nao\n");
            opc = scanner.nextLine();

        }while(opc.equals("sim"));

    }
}