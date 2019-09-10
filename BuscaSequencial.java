package Lista7;

import java.util.Scanner;

public class BuscaSequencial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vet[]= {1,4,5,6,3,25,64,234,65,212,512};
		String vet2[]= {"a","b","c","d","e","f","g","h","i","j"};
		final int TAM = vet.length;
		final int TAM2 = vet2.length;
		boolean achou = false;
		System.out.println("Deseja procurar 1-String ou 2-Número?");
		int opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Qual String deseja procurar??");
			entrada.nextLine();
			String texto = entrada.nextLine();
			int cont = 0; 
			String aux = texto;
			while (!(achou) && cont < TAM2) {
				int result = vet2[cont].compareTo(aux);
				if (result == 0) {
					achou = true;
				}
				else
					cont++;
					
			}
			
			break;
			
		case 2:
			System.out.println("Qual Número deseja procurar??");
		int num = entrada.nextInt();
		int cont1 = 0, aux1 = num;
		while (!(achou) && cont1 < TAM) {
			if (vet[cont1] == aux1) {
				achou = true;
			}
			else
				cont1++;
				
		}
		break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		System.out.println(achou);
		entrada.close();
	}

}
