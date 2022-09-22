package exbasic2;

import java.util.Scanner;

public class ExBasic2 {

	public static void main(String[] args) {
		
		
		//Le pedimos la edad al usuario
		System.out.print("Introduzca su edad y pulse Intro: ");
		
		//Declaro la variable num donde se guarda el número introducido
		int num;
		
		//Creo el escáner
		Scanner sc= new Scanner (System.in);
		
		//Guardo el número introducido y le añado uno
		num= sc.nextInt()+1;
		
		//Mostramos el resultado
		System.out.println("Esta será su edad el año que viene: "+num+" años.");
		
		//Cerramos el escáner
		sc.close();
		

	}

}
