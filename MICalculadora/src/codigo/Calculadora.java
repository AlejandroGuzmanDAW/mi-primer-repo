package codigo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1, n2;
		System.out.println("Introduzca 2 numeros:");
		n1=sc.nextInt();
		System.out.println("Introduzca el otro:");
		n2=sc.nextInt();
		
		//operaciones suma y resta
		System.out.println("Suma: "+(n1 + n2));
		System.out.println("Resta: "+(n1 - n2));
		//Falta division

	}

}
