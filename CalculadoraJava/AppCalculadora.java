import java.util.Scanner;

public class AppCalculadora{

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*Soma implementada 
         *Subtracao Implentada ok
         Multiplicação Implementada ok
         */

        String opc = " ";

        do{

            System.out.println("----------------------------------------------------------------");
            System.out.println("------------------------Calculadora-----------------------------");

            System.out.println("Digite: \n1 - Para realizar uma soma\n2 - Para realizar uma subtração\n3 - Para realizar uma multiplicação");
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
                case 2: 
                    System.out.println("Insira um numero: \n");
                    float n1 = scanner.nextFloat();

                    System.out.println("Insira o outro numero: \n");
                    float n2 = scanner.nextFloat();

                    float sub = n1 - n2;

                    System.out.println("O resultado da subtração entre " +n1+ " + " +n2+ " é igual a "+sub);
                    break;
                case 3: 
                    System.out.println("Insira um numero: \n");
                    float m1 = scanner.nextFloat();

                    System.out.println("Insira outro numero: \n");
                    float m2 = scanner.nextFloat();

                    float multi = m1 * m2;

                    System.out.println("O resultado da multiplicação entre " +m1+ " x " +m2+ " é igual a "+multi);
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