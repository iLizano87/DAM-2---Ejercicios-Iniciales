package dam2.inicial.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Contacto> agenda = new ArrayList<>();
		cargarAgenda(agenda);

		boolean menu = false;
		while (!menu) {
			System.out.println("1 - Ver lista");
			System.out.println("2 - Nuevo contacto");
			System.out.println("3 - Borrar Contacto");
			System.out.println("s - salir");

			switch (input.nextLine()) {
			case "1":
				verLista(agenda);
				break;
			case "2":
				agregarContacto(agenda);
				break;
			case "3":
				System.out.println("Cúal deseas eliminar???");
				verLista(agenda);
				borrarContacto(agenda);
				break;
			case "s":
				System.exit(0);
			default:
				System.err.println("ERROR, inserta opción válida");
			}
		}
	}

	public static void cargarAgenda(ArrayList<Contacto> agenda) {
		agenda.add(new Contacto(1, "Manuel", "Fan", "Toche", "616787879"));
		agenda.add(new Contacto(2, "Antonio", "Adios", "Hola", "666554433"));
		agenda.add(new Contacto(3, "Lorena", "Casa", "Calle", "109876543"));
		agenda.add(new Contacto(4, "Maria", "De La", "O", "983454647"));
		agenda.add(new Contacto(5, "Jacinto", "Uno", "Aqui", "985963951"));
	}

	public static void verLista(ArrayList<Contacto> agenda) {
		for (int i = 0; i < agenda.size(); i++) {
			System.out.println(
					agenda.get(i).getId() + "." + agenda.get(i).getNombre() + " " + agenda.get(i).getApellido1() + " "
							+ agenda.get(i).getApellido2() + " " + agenda.get(i).getTelefono());
		}
	}

	public static void agregarContacto(ArrayList<Contacto> agenda) {
		Scanner introducir = new Scanner(System.in);
		System.out.println("Introduce nombre:");
		String nombre = introducir.nextLine();
		System.out.println("Introduce apellido 1:");
		String apellido1 = introducir.nextLine();
		System.out.println("Introduce apellido 2:");
		String apellido2 = introducir.nextLine();
		System.out.println("Introduce telefono:");
		String telefono = introducir.nextLine();
		agenda.add(new Contacto(agenda.size() + 1, nombre, apellido1, apellido2, telefono));
	}
	
	public static void borrarContacto(ArrayList<Contacto> agenda) {
		Scanner remove = new Scanner(System.in);
		int eleccion = remove.nextInt();
		eleccion = eleccion - 1;
		agenda.remove(eleccion);
	}
	
}

//Ejercicio 3. Crea una agenda de contactos con las funcionalidades de leer, añadir y borrar 
//contactos haciendo uso de un ArrayList de tipo Contacto (se debe crear dicha clase con los 
//atributos necesarios) para almacenar los contactos de dicha agenda. Constará de un menú en la 
//función main que llamará a las funciones correspondientes para cada acción. Dicho menú deberá 
//mostrarse indeﬁnidamente una vez realizada cada acción, pudiendo salir del programa cuando se 
//introduzca el valor ‘s’ (el programa únicamente lo tendrá en cuenta si el carácter se ha 
//introducido en minúsculas, en caso contrario o si la opción del menú introducida no existe, deberá 
//indicar que la opción no es válida, informando de ello al  usuario,  volviendo  a  solicitar  la  
//introducción  de  una  opción  válida  de  manera indeﬁnida).
