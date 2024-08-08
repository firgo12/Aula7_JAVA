import java.util.Scanner;
public class Exemplo03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Criar Matriz
		double[][] arrayNota = new double [3][4];
		
		double somaNota =0;
		
		for(int i =0;i<3;i++){//linha
			somaNota =0;//Zerar
			System.out.println("Aluno "+(i+1));
			for(int j =0;j<3;j++){//coluna
				System.out.print("Informe a nota da "+(j+1)+"a Prova: ");
				arrayNota[i][j]=entrada.nextDouble();
				somaNota +=arrayNota[i][j];

			}
			arrayNota[i][3] = somaNota/3;
			
		}
		
		for(int i =0;i<3;i++){
			System.out.println("Média: "+arrayNota[i][3]);
		}
		

	}

}
