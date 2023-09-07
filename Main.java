package examenparcial;

public class Main {

	public static void main(String[] args) {
		Palabras palabras = new Palabras("hola");
		
        Ejecucion ejecucion = new Ejecucion();
        ejecucion.IniciarPrograma();
        
        palabras.primeraMayus();
        palabras.invertirCadena();
        palabras.vocalesMayus();
        palabras.esPalindromo();
	}

}
