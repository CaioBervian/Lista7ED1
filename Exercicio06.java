package Lista7;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		do {
		n = entrada.nextInt();
		} while (n <0);
		System.out.println(Rec(n));
		entrada.close();
}
	static float Rec(int n) {
		if (n == 0)
			return 0;
		else 
			return (1+(n*n))/n + Rec(n - 1);
	}}
