package exbasic2;

import java.util.Scanner;

public class ExBasic2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Introduzca su edad:");
		int numero= sc.nextInt()+1;
		System.out.println(numero);
		sc.close();
		

	}

}
