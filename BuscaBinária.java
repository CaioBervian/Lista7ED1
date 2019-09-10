package Lista7;

import java.util.Scanner;

public class BuscaBinária {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int vet[] = {1,5,50,100,21,48,18};
		String vet2[]= {"g","p","t","y","a","l","q","w","s","o"};
		System.out.println("Deseja procurar 1- Número ou 2- String!");
		int opcao = entrada.nextInt();
		if(opcao == 1) {
		System.out.println("Informe qual número deseja buscar!!");
		int x = entrada.nextInt();
		System.out.println(Binaria(x,vet));}
		else if (opcao == 2) {
			System.out.println("Informe qual String deseja buscar!!");
			entrada.nextLine();
			String texto = entrada.nextLine();
			System.out.println(BinariaString(texto, vet2));
		}
		entrada.close();
	}
		
		public static boolean Binaria(int x, int dados[]){     
	        int n = dados.length;     
	        int aux = 0;     
	        for(int i = 0; i < n-1; i++){   
	            for(int j = i+1 ; j < n; j++){     
	                if(dados[i] > dados[j]){   
	                    aux = dados[j];     
	                    dados[j] = dados[i];     
	                    dados[i] = aux;     
	                }     
	            }     
	        }     
	        int meio;     
	        int inicio = 0;     
	        int fim = dados.length-1;     
	        while (inicio <= fim) {     
	                 meio = (inicio + fim)/2;     
	                 if (x == dados[meio])     
	                          return true;     
	                 if (x < dados[meio])     
	                          fim = meio - 1;     
	                 else     
	                          inicio = meio + 1;     
	        }     
	        return false;     

	}
		public static boolean BinariaString(String x, String dados[]){     
			int n = dados.length;     
	        String aux = "";     
	        for(int i = 0; i < n-1; i++){   
	            for(int j = i+1 ; j < n; j++){     
	                int compare = dados[j].compareTo(dados[i]);
	            	if(compare < 0){   
	                    aux = dados[j];     
	                    dados[j] = dados[i];     
	                    dados[i] = aux;     
	                }     
	            }     
	        }
	        int meio;     
	        int inicio = 0;     
	        int fim = dados.length-1;     
	        while (inicio <= fim) {     
	                 meio = (inicio + fim)/2;
	                 int result = x.compareTo(dados[meio]);
	                 if (x.equals(dados[meio]))     
	                          return true;     
	                 if (result < 0)
	                          fim = meio - 1;     
	                 else     
	                          inicio = meio + 1;     
	        }     
	        return false; 

	}
	
}
