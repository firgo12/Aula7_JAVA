package matriz;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat moedaForm = new DecimalFormat("R$ #,##0.00");
		
		String [] produtos = new String []{"W","X","Z","Y"};
		String [] lojas = new String []{"A","B","C","D","E","F","G","H"};
		
		
		double [][] precos = new double [4][8];
		
		//CARREGAR MATRIZ
		for(int i=0;i<4;i++){
			System.out.println("Produto: "+produtos[i]);
			for(int j = 0;j < 8;j++){
				//Carregar automáticamente os preços
				precos[i][j]=(double)(Math.random()*190);
						
			}
		}

		//Mostrar Matriz
		//for(int i=0;i<4;i++){
			//for(int j=0;j<8;j++){
				//System.out.print(moedaForm.format(precos[i][j])+"\t\t\t");
			//}
			//System.out.println(" ");
		//}
		
		System.out.println("");
		System.out.println("Produtos com preço inferiror 120,00");
		
		for(int i=0;i<4;i++){
			System.out.println("Produto: "+produtos[i]);
			for(int j=0;j<8;j++){
				if(precos[i][j]<120){
					System.out.println("Loja: "+lojas[j]+" Preços: "+moedaForm.format(precos[i][j]));
				}
			}
		}
		
	}

}
