package Lista7;

import java.util.Scanner;

public class Exercicio03 {

	static int recursiva(int n, int i) {
		if (n == 1)
			return (2*(i*i)+2*i+8);
		else return (2*(i*i)+2*i+8) + recursiva(n-1,i);
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o i para o somatório 2*(i*i)+2*i+8!");
		int i = entrada.nextInt();
		System.out.println("Informe quantas vezes repetir o somatório 2*(i*i)+2*i+8 !");
		int n = entrada.nextInt();
		System.out.println(recursiva(n,i));
		entrada.close();


}
}