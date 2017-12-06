package inputOutput;

import java.util.Scanner;

public class InputOutput1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String name1 = stdin.next();
		String name2 = stdin.next();
		String name3 = stdin.next();
		
		System.out.println("\""+name1+", "+name2+", and "+name1+"\"");
		System.out.println("\""+name2+", "+name1+", and "+name1+"\"");
	}

}

/*
 * Output is 
 * "Shumee, Imran, and Shumee"
	"Imran, Shumee, and Shumee"
 * */
