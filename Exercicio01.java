package Lista7;

public class Exercicio01 {
	public static void main(String[] args) {

		for (int i = 0; i <= 15; i++) {
			System.out.println(i + " = " + Rec(i));
			}
}

public static int Rec(int n) {
	if(n<1) {
		return n;
	} else {
		return Rec(n-2)+ Rec(n-1);
	}
	

}}
