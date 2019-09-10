package Lista7;

import java.util.Arrays;

public class Exercicio08 {
	private static boolean busca(int[] array, int chave) {
		return BinRecursiva(array, 0, array.length - 1, chave);
	}

	private static boolean BinRecursiva(int[] array, int menor, int maior,int chave) {
		int media = (maior + menor) / 2;
		int valorMeio = array[media];

		if (menor > maior)
			return false;
		else if(valorMeio == chave) 
			return true;
		else if (valorMeio < chave)
			return BinRecursiva(array, media+1, maior, chave);
		else
			return BinRecursiva(array, menor, media-1, chave);
}
	 public static void main(String[] args) {
			int[] array = { 6,4,66,3,55,74,36,75,8,5 };
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));
			System.out.println(busca(array, 6));
		}
}	
