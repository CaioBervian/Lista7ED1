package Lista7;

public class Exercicio02 {
	public static void main(String[] args) {

		for (int i = 0; i <= 15; i++) {
			System.out.println(i + " = " + Rec(i));
			}
}

public static int Rec(int n) {
	if(n<=0) {
		return (2*n*n+2*n+8);
	} else {
		return Rec(n-1)+(2*n*n+2*n+8);
	}
	

}}
