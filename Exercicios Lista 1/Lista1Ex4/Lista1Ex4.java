/*
Usando um comando de repetição, criar um algoritmo que permita entrar com cinco
números e imprima o quadrado de cada número lido, caso o número lido seja ímpar e a
raiz quadrada, caso o número seja par
*/

import java.util.Scanner;

public class Lista1Ex4{
	public static void main(String[] args){
		double[] n = new double[5];
		Scanner ler = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.print("Digite um numero: ");
			n[i] = ler.nextDouble();
		}
		for(int i = 0; i < 5; i++){
			if(n[i] % 2 == 0)
				System.out.println("O numero "+n[i]+" eh par, portanto, sua raiz quadrada eh: "+ (Math.sqrt(n[i])));
			else
				System.out.println("O numero "+n[i]+" eh impar, portanto, seu quadrado eh: "+ (n[i]*n[i]));
		}
	}
}