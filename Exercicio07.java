package Lista7;

public class Exercicio07 {
	public static int fatorialRecursiva(int k) {
		if (k == 1)
			return 1;
		else return k * fatorialRecursiva(k-1);
}
	public static double recursiva(int n) {
		int fator = 0;
		if (n < 2)
			return 2;
		else 
			 fator = fatorialRecursiva(n);
		System.out.println(fator);
			return  (1/ fator) + recursiva(n-1);
}
	public static void main(String[] args) {
		System.out.println(recursiva(5));
	}
}