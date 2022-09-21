package main;
import java.util.Scanner;
import java.util.Random;

public class Usuario {
	private String Nombre;
	private String ID;
	private int Prestado;
	private String Direccion;
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	public static String getRandomNumberString() {
		Random rnd = new Random();
		int ID = rnd.nextInt(9999);
		return String.format("%04d", ID);
	}
	public void setPrestado (int Prestado) {
		this.Prestado=Prestado;
	}
	public void setDireccion(String Direccion) {
		this.Direccion=Direccion;
	}
	public int getPrestado(){
		return Prestado;
	}
}
