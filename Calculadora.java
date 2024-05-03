public class Calculadora{
    public static void main(String[] args){
           System.out.println("la suma es: " + sumar(5,5));
           System.out.println("la resta es: " + resta(10,5));
           System.out.println("la multiplicacion es: " + multiplicacion(5,5));
           System.out.println("la division es: " + division(10,5));
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