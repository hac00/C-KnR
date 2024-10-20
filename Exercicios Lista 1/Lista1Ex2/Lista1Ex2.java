/*
Criar um algoritmo que imprima a soma de todos os numeros de 1 até 100. Isto é, calcular
o valor de S na expressão S = 1+2+3+...+100.
*/

public class Lista1Ex2{
	public static void main(String[] args){
		int s = 0;
		for (int i = 0; i <= 100; i++)
			s += i;
		System.out.println("A soma dos valores de 1 ate 100 eh: " + s);
	}
}