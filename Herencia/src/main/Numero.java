package main;
import java.util.ArrayList;
import java.util.Random;

public class Numero {
	public void IDN() {
		ArrayList<Integer> iD = new ArrayList<Integer>();
		Random rnd = new Random();
		int idn= 100000 + rnd.nextInt(9999);
		iD.add(idn);
		System.out.print(iD);
	}
	
}
