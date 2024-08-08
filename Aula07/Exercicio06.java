import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] nomeProduto = new String[5];
		double [][] precos = new double [5][4];
		double [] precoTransporte = new double [5];
		double [][] imposto = new double [5][4];
		
		for(int i=0;i<5;i++){
			System.out.print("Digite o nome do produto: ");
			nomeProduto [i] = entrada.next();
			System.out.print("Informe o pre�o do transporte: ");
			precoTransporte[i] = entrada.nextDouble();
		}
		
		System.out.println("");
		
		for(int i=0;i<5;i++){//Linha
			System.out.println("------------------ Informe o pre�o do produto: "+nomeProduto[i]+" ------------------");
			for(int j=0;j<4;j++){//Coluna
				System.out.print("Digite o pre�o da "+(j+1) +"� loja: ");
				precos [i][j] = entrada.nextDouble();
				
				if (precos[i][j] <= 50){
					imposto[i][j] = precos [i][j] * 0.05;
				} else {
					if(precos[i][j] > 50 && precos[i][j] <= 100){
						imposto[i][j] = precos [i][j] * 0.1;
					} else {
						imposto[i][j] = precos [i][j] * 0.2;
					}
				}
				
			}
			System.out.println("");
		}
		
		//Sa�da
		System.out.println("-----------------------------------------------");
		for(int i=0;i<5;i++){
			System.out.println("Nome do produto: "+nomeProduto[i]+" - Custo de Transporte:R$ "+precoTransporte[i]);
			for(int j=0;j<4;j++){
				System.out.println("------------ Loja: "+(j+1)+" ------------");
				System.out.println("Imposto = R$"+imposto[i][j]);
				System.out.println("Pre�o = R$"+precos[i][j]);
				System.out.println("Pre�o Final = R$"+(precos[i][j]+imposto[i][j]+precoTransporte[i]));
			}
			System.out.println("-----------------------------------------------");
		}
		
		
		
	}

}
