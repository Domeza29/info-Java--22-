import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese 2 numeros:");
        Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("La suma de dos numeros es:" + (a + b));
            System.out.println("La resta de dos numeros es:" + (a - b));
            System.out.println("La multiplicacion de dos numeros es:" + (a * b));
            System.out.println("La division de dos numeros es:" + (a / b));
            System.out.println("el modulo de dos numeros es:" + (a % b));
            scan.close();

        
    }


}
