import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] nomeCidade = new String [5];
		double [][] distanciaCid = new double [5][5];
		double combustivel = 0;
		
		System.out.println("------------------ CIDADES ------------------");
		for(int i=0;i<5;i++){
			System.out.print("Informe o nome da "+(i+1)+"ª cidade: ");
			nomeCidade [i] = entrada.next();
		}//Entrada das cidades
		
		System.out.println("------------------ DISTÂNCIA ------------------");
		for(int i=0;i<5;i++){//Linha
			for(int j=0;j<5;j++){//Coluna
				if(i != j){
				System.out.print("Informe a distância entre "+nomeCidade[i]+" e "+nomeCidade[j] +":");
				distanciaCid [i][j] = entrada.nextDouble();
				} else {
					distanciaCid [i][j] =0;
				}
			}
		}
		
		System.out.println("------------------ GASTO EM COMBUSTÍVEL ------------------");
		System.out.println("Informe o consumo de um cumbustível: ");
		combustivel = entrada.nextDouble();
		System.out.println("----------------------------------------------------------");
		System.out.println("------------------ PERCURSOS INFERIORES A 250 KM ------------------");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(distanciaCid [i][j] < 250){
					System.out.println("-- Distância: "+distanciaCid [i][j]+" km    - entre "+nomeCidade[i]+" e "+nomeCidade[j]);
				}
			}
		}
		
		System.out.println("------------------ CONSUMO POR PERCURSO ------------------");
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println("Consumo entre a cidade "+nomeCidade[i]+" e "+nomeCidade[i]+" é: "+(distanciaCid[i][j]/combustivel)+ " Litros");
			}
		}
	}
}