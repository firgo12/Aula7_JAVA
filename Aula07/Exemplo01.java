import java.util.Scanner;
public class Exemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Criar Matriz
		int[][] arrayNumeros = new int [3][3];
		
		//Carregar Matriz
		for(int indLinha =0;indLinha<3;indLinha++){
			for(int indColuna =0; indColuna<3;indColuna++){
				System.out.print("Digite o elemento da matriz - Linha "+ indLinha+" - Coluna "+indColuna+": ");
				
				arrayNumeros[indLinha][indColuna]=entrada.nextInt();
			}
			
		}
		
		//Exibir a matriz
		
		for(int indLinha =0;indLinha<3;indLinha++){
			for(int indColuna =0; indColuna<3;indColuna++){
				System.out.println("Matriz Números["+indLinha+","+indColuna+"]:"+arrayNumeros[indLinha][indColuna]);
				
			}
			
		}
		
		System.out.println("");
		
		for(int indLinha =0;indLinha<3;indLinha++){
			System.out.println("");
			for(int indColuna =0; indColuna<3;indColuna++){
				System.out.print(arrayNumeros[indLinha][indColuna]+"\t");
				
			}
			
		}
		
		
	}

}
