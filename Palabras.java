package examenparcial;

public class Palabras {
	private String cadena;
	public Palabras(String cadena){
		this.cadena = cadena;
	}
	
	public void primeraMayus() {
		if(cadena != null && !cadena.isEmpty())	{
			String primeraMayus = cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
			System.out.println("Primera letra en mayuscula: "+primeraMayus);
		}else {
			System.out.println("La cadena está vacía");
		}
		
	}
	public void invertirCadena() {
		if(cadena != null && !cadena.isEmpty())	{
			StringBuilder invertida = new StringBuilder(cadena);
			System.out.println("Cadena invertida: "+invertida.reverse());
		}else {
			System.out.println("La cadena está vacía");
		}	
	}
	public void vocalesMayus(){
		if(cadena != null && !cadena.isEmpty()){
			StringBuilder resultado = new StringBuilder();
	        for (int i = 0; i < cadena.length(); i++) {
	            char c = cadena.charAt(i);
	            if ("aeiouAEIOU".indexOf(c) != -1) {
	                resultado.append(Character.toUpperCase(c));
	            } else {
	                resultado.append(c);
	            }
	        }
	        System.out.println("Cadena con vocales en mayúscula: " + resultado.toString());
		}else {
			System.out.println("La cadena está vacía");
		}
	}
	public void esPalindromo() {
		if (cadena != null && !cadena.isEmpty()) {
            String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
            StringBuilder cadenaInvertida = new StringBuilder(cadenaSinEspacios).reverse();
            if (cadenaSinEspacios.equals(cadenaInvertida.toString())) {
                System.out.println("La cadena es un palíndromo.");
            } else {
                System.out.println("La cadena no es un palíndromo.");
            }
        } else {
            System.out.println("La cadena está vacía.");
        }
	}
}
