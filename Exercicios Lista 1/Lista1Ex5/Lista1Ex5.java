/*
Faça um algoritmo que carregue um vetor de seis elementos numericos inteiros, calcule e
mostre:
- A quantidade de numeros pares;
- Quais os numeros pares;
- A quantidade de numeros impares;
- Quais os numeros impares.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Lista1Ex5{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seis numeros: ");
		int[] n = new int[5];
		Array par = new Array[];
		Array impar = new Array[];
		for(int i = 0; i < 5; i++){
			int j = k = 0;
			n[i] = ler.nextInt();
			if(n[i]%2 == 0)
				par[j++] = n[i];
			else
				impar[k++] = n[i];
		}
		System.out.println("Quantidade de numeros pares: "+ par.length);
		System.out.println("Os numeros pares sao: ");
		for(int i = 0; i < par.length; i++)
			System.out.print(""+par[i]+" ");
		System.out.println("Quantidade de numeros impares: "+ impar.length);
		System.out.println("Os numeros impares sao: ");
		for(int i = 0; i < impar.length; i++)
			System.out.print(""+impar[i]+" ");
	}
}