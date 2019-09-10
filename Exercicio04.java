package Lista7;

public class Exercicio04 {
	public static void main(String[] args) {
		
		int b[] ={3,5,6,3,6,7,3,5,8,3,9,22,32,1};
			System.out.println("Maior: "+Maior(b));
			System.out.println("Menor: " +Menor(b));
			
}

	public static int Maior(int b[]) {
	
		return Maiora(b.length, b);
	}

	private static int Maiora (int a, int b[]) {
	    if (a == 1){
	        return b[0];
	    } else {   
	        int x = Maiora (a-1, b);

	        if (x > b[a-1]){
	            return x;
	        }else{
	            return b[a-1]; 
	        }
	    }	      
	}
	
	public static int Menor(int b[]) {
		
		return Menora(b.length, b);
	}

	private static int Menora (int a, int b[]) {
	    if (a == 1){
	        return b[0];
	    } else {   
	        int x = Menora (a-1, b);

	        if (x < b[a-1]){
	            return x;
	        }else{
	            return b[a-1]; 
	        }
	    }	      
	}

}
