/*
Fazer um algoritmo que leia um numero e imprima uma das mensagens: 'maior do que
20', 'igual a 20' ou 'menor do que 20'.
*/

import java.util.Scanner;

public class Lista1Ex3{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = ler.nextInt();
		if(n > 20)
			System.out.println("" + n + " eh maior que 20");
		else if(n < 20)
			System.out.println("" + n + " eh menor que 20");
		else
			System.out.println("" + n + " eh igual a 20");
	}
}