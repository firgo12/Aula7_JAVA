import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//DecimalFormat moedaForm = new DecimalFormat("R$ #,##0.00");
		
		String [] produtos = new String []{"A","B","C","D","E","F","G","H","I","J","K","L"};
		String [] lojas = new String []{"V","W","X","Y","Z"};
		
		double [][] precos = new double [5][12];
		
		double maiorPreco=0, menorPreco =0;
		String maiorLoja = null, menorLoja = null, maiorProduto = null,menorProduto = null;
		
		//É possível guardar somente o índice do MAIOR e MENOR, não é necessário 
		//guardar o valor dentro da matriz!!!
		
		for(int i=0;i<5;i++){
			System.out.println("Produto: "+produtos[i]);
			for(int j = 0;j < 12;j++){
				System.out.println("Digite o preço da LOJA "+produtos[j]+" :");
				precos[i][j] = entrada.nextDouble(); 
						
			}
		}
		
		menorPreco = precos[0][0];
		menorProduto = produtos[0];
		menorLoja = lojas[0];
		
		for(int i=0;i<5;i++){
			for(int j = 0;j < 12;j++){
				if (precos[i][j] > maiorPreco){
					maiorPreco = precos[i][j];
					maiorLoja = lojas[i];
					maiorProduto = produtos[j];
				} else {
					if (precos[i][j] < menorPreco ){
						menorPreco = precos[i][j];
						menorLoja = lojas[i];
						menorProduto = produtos[j];
					}
				}
						
			}
		}
		
		System.out.println("Produto mais Barato: "+menorProduto);
		System.out.println("Loja: "+menorLoja);
		System.out.println("Preço: "+menorPreco);
		System.out.println("Produto mais caro: "+maiorProduto);
		System.out.println("Loja: "+maiorLoja);
		System.out.println("Preço: "+maiorPreco);

	}

}
