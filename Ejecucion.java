package examenparcial;
import java.util.Scanner;

public class Ejecucion {

    public void IniciarPrograma() {
        Scanner scanner = new Scanner(System.in);
        Extra extra = new Extra();

        boolean ejecutarFizzBuzz = extra.preguntarEjecucionFizzBuzz();

        if (ejecutarFizzBuzz) {
            extra.fizzBuzz();
        }
    }

}
