import java.util.Scanner;

public class Lista1Ex1{
	
	public static void main (String[] args){
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o valor da variavel A: ");
		int a = ler.nextInt();
		System.out.println("Informe o valor da variavel B: ");
		int b = ler.nextInt();
		int c = a;
		System.out.println("Os valores antes da troca: A = "+a+" e B = "+b);
		a = b;
		b = c;
		System.out.println("Os valores apos a troca: A = "+a+" e B = "+b);
	}
}