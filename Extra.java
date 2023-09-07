package examenparcial;
import java.util.Scanner;

public class Extra {
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public boolean preguntarEjecucionFizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea ejecutar FizzBuzz? (si(S)/no(N)): ");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("S");
    }
}