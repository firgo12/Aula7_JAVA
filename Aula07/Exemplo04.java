import java.util.Scanner;	
public class Exemplo04 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int infoProduto [][] = new int [5][2];
		double calculoProduto [][] = new double [5][2];
		double totalGeral =0;
		
		for (int i=0;i < 5;i++){ //LINHA!
			System.out.println("Produto "+(i+1));

				System.out.print("Digite o código do produto: ");
				infoProduto [i][0] = entrada.nextInt();
				System.out.print("Digite o preço: ");
				calculoProduto [i][0] = entrada.nextDouble();
				System.out.print("Digite a quantidade: ");
				infoProduto [i][1] = entrada.nextInt();
			
		} // fim do for LINHA
		
		//Saída
		for (int i=0;i < 5;i++){
			calculoProduto[i][1] = calculoProduto[i][0] * infoProduto [i][1];
			totalGeral += calculoProduto[i][1];
			
				System.out.println("Código: "+infoProduto [i][0]+ "\t Preço: "
				+calculoProduto [i][0]+ "\t Quantidade: "+infoProduto[i][1]+"\t SubTotal: "
				+calculoProduto[i][1]);
				
		} // fim do for LINHA!!!
		System.out.println("Total Geral: "+totalGeral);
		
	}

}
