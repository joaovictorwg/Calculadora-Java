import java.util.Scanner;

public class AppCalculadora{

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            

        String opc = " ";

        do{

            System.out.println("----------------------------------------------------------------");
            System.out.println("------------------------Calculadora-----------------------------");

            
            
            scanner.nextLine();

            System.out.println("Deseja continuar calculando?\nDigite: sim ou nao\n");
            opc = scanner.nextLine();

        }while(opc.equals("sim"));

    }
}