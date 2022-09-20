package dam2.inicial.ejercicio2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
        ArrayList<Integer> array = leerValores();
        double suma = calcularSuma(array);
        double media = suma / array.size();
        mostrarResultados(array, suma, media);
  }

  //pedir por teclado los valores y guardarlos en el ArrayList
  //la lectura acaba cuando se introduzca 1
  public static ArrayList<Integer> leerValores() {
       ArrayList<Integer> valores = new ArrayList();
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("Introduce entero. 1 para acabar: ");
       n = sc.nextInt();
       while (n != 1) {
                valores.add(n);
                System.out.print("Introduce entero. 1 para acabar: ");
                n = sc.nextInt();
       }
       return valores;
  }

  //recorrer el ArrayList y sumar todos sus elementos
  public static double calcularSuma(ArrayList<Integer> valores) {
        double suma = 0;
        Iterator it = valores.iterator();
        while (it.hasNext()) {
                 suma = suma + (Integer) it.next();
                //next() devuelve un dato de tipo Object. Hay que convertirlo a Integer
        }
        return suma;
  }

  //Mostrar valores, su suma y su media aritmética
  //y cuántos hay superiores a la media
  public static void mostrarResultados(ArrayList<Integer> valores, double suma, double media) {             
        int cont = 0;
        System.out.println("Valores introducidos: ");
        System.out.println(valores);
        System.out.println("Suma: " + suma);
        System.out.printf("Media: %.2f %n", media);
        for (Integer i : valores) {
              if (i > media) {
                 cont++;
             }
        }
     System.out.println(cont + " valores superiores a la media");
  }
}
//Ejercicio 2. Desarrolla un programa que lea una serie de valores numéricos enteros
//desde el teclado y los guarde en un ArrayList de tipo Integer. La lectura de números
//terminará cuando se introduzca el valor -1. Este valor no se almacenará en el ArrayList.
//A continuación el programa mostrará por pantalla el número de valores que se han leído,
//su suma y su media. Por último se mostrarán todos los valores leídos, indicando cuántos
//de ellos son mayores que la media.