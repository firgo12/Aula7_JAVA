import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat moedaForm = new DecimalFormat("R$ #,##0.00");
		
		double [][] estoqueProd = new double [5][3];
		double [] qtdArmazem = new double [4];
		double [] custoProd = new double [3];
		double [] custoArm =  new double [4];
		double maiorEst2 =0;
		int indEst2 =0;
		int indArmBaixo=0, indArmAlto=0, indProdBaixo =0, indProdAlto=0;
		double maiorEst=0,menorEst=0;
		
		//Carregar Matriz
		for (int i=0;i<4;i++){
			System.out.println("Armazém "+(i+1));
			for(int j=0;j<3;j++){
				System.out.print("Informe a qtd em estoque do produto "+(j+1)+ " :");
				estoqueProd [i][j] = entrada.nextDouble();
			}
		}
		System.out.println("");
		//Custo de cada produto
		for(int i=0;i<3;i++){
			System.out.print("Digite o custo do produto "+(i+1)+ ":");
			estoqueProd[4][i] = entrada.nextDouble();//Linha FIXA
		}
		
		//a)
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				qtdArmazem[i] += estoqueProd[i][j];
			}
			System.out.println("Total Armazém "+(i+1)+":"+qtdArmazem[i]);
		}
		//b)
		for(int i=0;i<4;i++){
			if(estoqueProd[i][1]>maiorEst2){
				maiorEst2=estoqueProd[i][1];
				indEst2 =i;
			}
		}
		System.out.println("--------------- Armazém com Maior Estoque produto 2 ---------------");
		System.out.println("Armazém:"+(indEst2+1)+" - "+maiorEst2);

		//c)
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				
				if(i==0 && j==0){
					indArmBaixo = i;
					indProdBaixo=j;
					menorEst = estoqueProd[i][j];
					
					indArmAlto =i;
					indProdAlto =j;
					maiorEst = estoqueProd[i][j];
				} else{
					if(estoqueProd[i][j]>maiorEst){
						indArmAlto =i;
						indProdAlto =j;
						maiorEst = estoqueProd[i][j];
					}
					if(estoqueProd[i][j]<menorEst){
						indArmBaixo = i;
						indProdBaixo=j;
						menorEst = estoqueProd[i][j];
					}
				}
			}
		}
		
		System.out.println("");
		System.out.println("Maior Estoque: "+maiorEst+" - "+" Armazém "
		+(indArmAlto+1)+ " - Produto:"+(indProdAlto+1));
		System.out.println("Menor Estoque: "+menorEst+" - "+" Armazém "
		+(indArmBaixo+1)+ " - Produto:"+(indProdBaixo+1));
		
		//d)
		for(int i=0;i<3;i++){//Coluna
			for(int j=0;j<4;j++){//Linha
				custoProd[i] += estoqueProd[j][i] * estoqueProd[4][i];
			}
			System.out.println("Produto "+(i+1)+" :"+custoProd[i]);
		}
		//e)
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				custoArm[i] += estoqueProd[i][j] * estoqueProd [4][j];
			}
			System.out.println("Armazém "+(i+1)+" - Custo: "+custoArm[i]);
		}
		
	}

}
