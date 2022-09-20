package dam2.inicial.ejercicio1;

public class ejercicio1 {

	public static void main(String[] args) {
		String nombreCompleto = "Tomás Campos PerezTomás Campos Pérez";
		System.out.println(nombreCompleto);
		System.out.println("Arreglado es: "+arreglaNombres(nombreCompleto));
		
	}

	public static String arreglaNombres(String s) {
		int longitud=s.length()/2;
		String nombre=s.substring(longitud);
		return nombre;
	}

}
//Ejercicio 1. Los profesores de la escuela hemos tenido un problema a la hora de exportar
//los listados de los alumnos y cada uno de ellos se ha duplicado en cada línea.
//Suponiendo la lectura de un fichero, línea a línea (podemos crear una variable de tipo
//Cadena para almacenar una supuesta línea errónea y probar con ella). Ayúdanos a
//generar el listado correcto, mostrándolo corregido por pantalla.
//Tomando como ejemplo la lectura de una línea de un supuesto fichero proporcionado
//“Tomás Pérez CamposTomás Pérez Campos”, como resultado debería generarse una
//línea con “Tomás Pérez Campos”, es decir, habrá que hacer el correspondiente
//tratamiento de cadenas para que se corrija cualquier cadena con dicho error (fíjate bien
//en el formato de entrada y en el de salida deseado).