package Lista7;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int x = entrada.nextInt();
		do {
		n = entrada.nextInt();
		} while (n <0);
		System.out.println(Rec(x,n));
		entrada.close();
}

public static int Rec(int x,int n) {
    if (n<0){
    	return 1/Rec(x,-n);
    	} else if (n==1) {
    		return x;}
    	return x*Rec(x,n-1); }  

}
