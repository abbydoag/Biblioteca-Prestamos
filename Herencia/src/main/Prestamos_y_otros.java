package main;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Prestamos_y_otros {
	private static Biblioteca biblioteca;
	public static void main (String args[]) {
		System.out.println("BIENVENID@ AL SERIVICO ELECTRONICO DE LA BIBLIOTECA");
		System.out.println("CREAR NUEVO USUARIO(si/no)?");
		Scanner in = new Scanner (System.in);
		String op = in.nextLine();
			if (op.equals ("si")) {
				ArrayList<String> Nombre = new ArrayList<String>();
				String nom=("");
				System.out.println("INGRESE SU NOMBRE: ");
				nom=in.nextLine();
				Nombre.add(nom);
				ArrayList<String> Direccion = new ArrayList<String>();
				String dir=("");
				System.out.println("INGRESE SU DIRECCION: ");
				dir=in.nextLine();
				Direccion.add(dir);
				class Prestamos_y_otros extends Numero{	
					super();
					System.out.println("BIENVENID@, ESTE ES SU CODIGO DE IDENTIFICACION: "+IDN);
					Prestamos_y_otros identificacion = new Prestamos_y_otros();
					identificacion.IDN(); 
				}
				
	
			}
			
			else {
				System.out.println("INGRESE SU CODIGO: ");
				String cod=in.nextLine();
				if (ID.contains(cod)){
					
				}
				else {
					System.out.println("ID NO VALIDO, USUARIO NO REGISTRADO");
				}
			}
			System.out.println("SELECCIONE UNA OPCION (1-3): ");
			System.out.println("1. PRESTAR\r\n2. DEVOLVER\r\n3. SALIR");
			String OP0 = in.nextLine();
			B[] b=new b[3];
			
			if (OP0.equals("1")) {
				System.out.println("QUE DESEA PRESTAR? (1-3)\r\n1. LIBROS\r\n2. REVISTAS\r\n3. ARTICULOS");
				String OP1 = in.nextLine();
				if (OP1.equals("1")) {
					ArrayList<String>libros=biblioteca.getlibros();
					
					for (int i=1; i<=3; i++) {
						b[i].setPrestado();
					}
				}
				if (OP1.equals("2")) {
					ArrayList<String>revistas=biblioteca.getrevistas();
					System.out.println("SELECCIONE UN LIBRO: ");
					String L = in.nextLine();
					for (int i=1; i<=3; i++) {
						b[i].setPrestado();
					}
				}
				if (OP1.equals("3")) {
					ArrayList<String>articulos=biblioteca.getarticulos();
					for (int i=1; i<=3; i++) {
						b[i].setPrestado();
					}
				}
			 }
			if (OP0.equals("2")) {
				System.out.println("ESTA ACCION DEVOLVERÁ LOS LIBROS QUE HAYA PRESTADO");
			}
			if (OP0.equals("3")) {
				System.out.println("GRACIAS POR USAR EL SERIVICIO");
			}
	}	
	
}
