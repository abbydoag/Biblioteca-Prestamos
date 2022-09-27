package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Usuario {
	private String Nombre;
	private String ID;
	private int Prestado;
	private String Direccion;
	private int Codigo;
	
	public void setNombre (String Nombre){
		this.Nombre=Nombre;
	}
	public void setCodigo (int Codigo) {
		this.Codigo=Codigo;
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
