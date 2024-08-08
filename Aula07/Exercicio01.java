import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int milhagem [][] = new int [4][5];
		
		for (int i = 0;i < 4;i++){
			System.out.print("Digite o código do "+(i+1)+"º cliente: ");
			milhagem [i][0] = entrada.nextInt();
			System.out.print("Digite a quantidade da milhagem: ");
			milhagem[i][1] = entrada.nextInt();
			System.out.print("Digite a categoria: ");
			milhagem[i][2] = entrada.nextInt();
			
			if (milhagem[i][2] == 1){
				milhagem[i][3] = 10000;
				milhagem[i][4] = milhagem[i][3] + milhagem[i][1];
			} else{
				if(milhagem[i][2] == 2){
					milhagem[i][3] = 5000;
					milhagem[i][4] = milhagem[i][3] + milhagem[i][1];
				} else {
					if (milhagem[i][2] == 3){
						milhagem[i][3] = 0;
						milhagem[i][4] = milhagem[i][3] + milhagem[i][1];
					}
				}
			}
		}//fim for
		
		for (int i = 0;i < 4;i++){//LINHA!!
			System.out.println("Código do Cliente: "+milhagem [i][0]+"\t Quantidade milhagem: "
			+milhagem[i][1]+"\t Categoria: "+milhagem[i][2]+" \t Bônus: "+milhagem[i][3]+"\t Milhagem Total: "+milhagem[i][4]);
			System.out.println(" ");
		}//FIM FOR

	}

}
