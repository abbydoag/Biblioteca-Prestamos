package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
	

	private static ArrayList<String> libros() {
		ArrayList<String> libros= new ArrayList<String>();
		libros.add("Titulo: La Princesita\\r\\nAutor: Antoniette de Saint-Exupéry\\r\\nNo. de Identificacion: 480461\\r\\nEditorial: La Piedra\\r\\nMateria: Literatura\\r\\nCantidad Ejemplares: 10");
		libros.add("Titulo: El Señor de los Ajillos \\r\\nAutor: T.R.R Jolkien\\r\\nNo. de Identificacion: 347602 \\r\\nEditorial: Los 7 Mares\\r\\nMateria: Literatura \\r\\nCantidad Ejemplares: 10");
		libros.add("Titulo: Calculo 2\\r\\nAutor: Antonio Stein\\r\\nNo. de Identificacion: 562043\\r\\nEditorial: H&E Education\\r\\nMateria: Matemáticas\\r\\nCantidad Ejemplares: 10");
		libros.add("Titulo: Cartas en la Pared\\r\\nAutor: Jaelyn Clover\\r\\nNo. de Identificacion:502503 \\r\\nEditorial: WebReads\\r\\nMateria: Literatura\\r\\nCantidad Ejemplares: 10");
		libros.add("Titulo: Bioquimica\\r\\nAutor: Marie Mendelev\\r\\nNo. de Identificacion: 239561\\r\\nEditorial: H&E Education\\r\\nMateria: Quimica\\r\\nCantidad Ejemplares: 10");
		libros.add("Titulo: ITS\\r\\nAutor: Esteban Rey\\r\\nNo. de Identificacion: 056946 \\r\\nEditorial: The Post\\r\\nMateria: Literatura \\r\\nCantidad Ejemplares: 10");
		return libros;
	}
		
		
	private static ArrayList<String> revistas() {
		ArrayList<String> revistas= new ArrayList<String>();
		revistas.add("Titulo: Club Nintendo\r\nNo. de Identificacion: 100345\r\nAño: 2020 \r\nNo. de Revista:03\r\nMateria: Entretenimiento \r\nCantidad Ejemplares: 20");
		revistas.add("Titulo: WebToon\r\nNo. de Identificacion: 620423\r\nAño: 2022\r\nNo. de Revista: 09\r\nMateria: Entretenimiento\r\nCantidad Ejemplares: 20");
		revistas.add("Titulo: SciELO\r\nNo. de Identificacion: 237098\r\nAño: 2019\r\nNo. de Revista: 10\r\nMateria: Ciencia\r\nCantidad Ejemplares: 20");
		revistas.add("Titulo: Vouge\r\nNo. de Identificacion: 394857\r\nAño: 2021\r\nNo. de Revista: 12\r\nMateria: Entretenimiento\r\nCantidad Ejemplares: 20");
		revistas.add("Titulo: Remi´s\r\nNo. de Identificacion: 381640\r\nAño: 2003\r\nNo. de Revista: \r\nMateria: Cocina\r\nCantidad Ejemplares: 20");
		return revistas;
	}	
	
	private static ArrayList<String> articulos() {
	ArrayList<String> articulos= new ArrayList<String>();
	articulos.add("Titulo: Parálisis del Sueño\r\nAutor: Sofia Agreda\r\nNo. de Identificacion: 345123\r\nAño: 2017\r\nMateria: Ciencia\r\nCantidad Ejemplares: 5");
	articulos.add("Titulo: Historia del Siglo Reciente\r\nAutor: Port Ooblek\r\nNo. de Identificacion: 011213\r\nAño: 2013\r\nMateria: Historia\r\nCantidad Ejemplares: 5");
	articulos.add("Titulo: Observación de Aves en la Región Norte\r\nAutor: Alexander Branwen\r\nNo. de Identificacion: 041316\r\nAño: 2016\r\nMateria: Naturaleza\r\nCantidad Ejemplares: 5");
	articulos.add("Titulo: Principios de la construcción\r\nAutor: Lloyd Frontera\r\nNo. de Identificacion: 022046\r\nAño: 2022\r\nMateria: Trabajo\r\nCantidad Ejemplares: 5");
	return articulos;
	}
	
}
