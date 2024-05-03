import java.util.Scanner;

public class Calculadora2{
    public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           int n1 = 5, n2=10;
           System.out.println("1 = suma");
           System.out.println("2 = resta");
           System.out.println("3 = multiplicacion");
           System.out.println("4 = division");
           System.out.print("elige una opcion: ");
           int op = scanner.nextInt();
           System.out.println(op);

           switch (op){
            case 1:
                System.out.println("Resultado de la suma: " + sumar(n1, n2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + resta(n1, n2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicacion: " + multiplicacion(n1, n2));
                break;
            case 4:
                System.out.println("Resultado de la division: " + division(n1, n2));
                break;
            default:
                System.out.println("Opcion incorrecta");
           }
    }

    public static int sumar(int a, int b){
           return a + b;
    }

    public static int resta(int a, int b){
           return a - b;
    }


    public static int multiplicacion(int a, int b){
           return a * b;
    }


    public static int division(int a, int b){
           return a / b;
    }


}