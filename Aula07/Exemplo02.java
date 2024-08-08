import java.util.Scanner;
public class Exemplo02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int somaLinha=0, totalGeral=0;
		
		//Criar Matriz
		int[][] arrayNumeros = new int [4][4];
		
		//Carregar Matriz
		for(int i =0;i<4;i++){//linha
			for(int j =0; j<4;j++){//Coluna
				System.out.print("Digite o valor da [Linha "+ i+" - Coluna: "+j+"]: ");
				
				arrayNumeros[i][j]=entrada.nextInt();
			}
			
		}
		
		//Somar LInha
		for(int i =0;i<4;i++){//linha
			somaLinha=0;
			for(int j =0; j<4;j++){//Coluna
				somaLinha+= arrayNumeros[j][i];
			}
			System.out.println("Soma Coluna "+i+":"+somaLinha);
			totalGeral+=somaLinha;
		}
		System.out.println("Total Geral: "+totalGeral);
		

	}

}
