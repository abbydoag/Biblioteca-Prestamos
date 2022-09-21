package main;
import java.util.Scanner;

public class Prestamos_y_otros {
	public static void main (String args[]) {
		System.out.println("BIENVENID@ AL SERIVICO ELECTRONICO DE LA BIBLIOTECA");
		System.out.println("CREAR NUEVO USUARIO(si/no)?");
		Scanner in = new Scanner (System.in);
		String op = in.nextLine();
		Usuario[] usuario = new Usuario [100];
			if (op.equals ("si")) {
				System.out.println("INGRESE SU NOMBRE: ");
				String nombre = in.nextLine();
				Usuario.setNombre(nombre);
				System.out.println("INGRESE SU DIRECCION: ");
				String direccion = in.nextLine();
				Usuario.setDireccion(direccion);
				System.out.println("ESTE ES SU ID: "+ID);
			}
			else {
				System.out.println("INGRESE SU ID: ");
				String id = in.nextLine();
				if (id.)
			}
	}
	
 
	
}
