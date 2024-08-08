import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int matrizM [][] = new int [2][2];
		int matrizR [][] = new int [2][2];
		int maior =0;
		
		for(int i=0;i < 2;i++){//LINHA
			for(int j=0;j < 2;j++){
				System.out.print("Informe um número: ");
				matrizM [i][j] = entrada.nextInt();
				if(matrizM [i][j] > maior){
					maior = matrizM [i][j];
				}
			}//FIM FOR
		}//FIM FOR
		
		for(int i=0;i < 2;i++){//LINHA
			for(int j=0;j < 2;j++){
				matrizR [i][j] = matrizM [i][j] * maior;
				System.out.println("Resultado - Matriz R["+(i+1)+","+(j+1)+"]= "+matrizR [i][j]);
			}//FIM FOR
		}//FIM FOR
		

	}

}
