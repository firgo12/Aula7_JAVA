import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] [] semestre1 = new int [5][3];
		int [] [] semestre2 = new int [5][3];
		int [] [] anual = new int [5][3];
		int [] somaUni = new int [3];
		int [] somaCurso = new int [5];
		int maiorCurso =0, indMaior =0;

		
		System.out.println("------------------------ 1º Semestre ------------------------ ");
	
		for(int c=0; c<5;c++){
			for(int u=0;u<3;u++){
				semestre1[c][u] = (int)(Math.random()*200);
			}
		}
		System.out.println("");
		System.out.println("------------------------ 2º Semestre ------------------------ ");
		
		for(int c=0; c<5;c++){
			for(int u=0;u<3;u++){
				semestre2[c][u] = (int)(Math.random()*200);
			}
		}
		//Carregar a matriz anual
		System.out.println("");
		System.out.println("------------------------ Matrícula Anual ------------------------");
		for(int c=0; c<5;c++){
			for(int u=0;u<3;u++){
				//a)
				anual[c][u] = semestre1[c][u] + semestre2[c][u];
			}
		}
		
		for(int c=0; c<5;c++){
			for(int u=0;u<3;u++){
				System.out.print(anual[c][u]+"\t\t");
			}
			System.out.println("");
		}
		//b)
		for(int u=0;u<3;u++){
			for (int c=0; c<5;c++){
				somaUni[u] += anual[c][u];
			}
		}
		System.out.println("");
		System.out.println("Soma das Unidades");
		for(int i=0;i<3;i++){
			System.out.println("Unidade" +(i+1)+":"+somaUni[i]);
		}
		
		//c)
		for(int c=0;c<5;c++){
			for(int u=0;u<3;u++){
				somaCurso[c] += anual[c][u];
			}
		}
		System.out.println("");
		System.out.println("Soma dos Cursos");
		for (int i=0;i<5;i++){
			System.out.println("Cursos " +(i+1)+":"+somaCurso[i]);
		}
		
		//d)
		for(int i=0;i<5;i++){
			
			if(somaCurso[i] >maiorCurso){
				maiorCurso=somaCurso[i];
				indMaior =i;
			}
		}
		System.out.println("");
		System.out.println("Maior Curso: "+(indMaior+1)+" - "+maiorCurso);
		
	}

}
