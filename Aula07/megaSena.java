import java.util.Scanner;

public class megaSena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] numSorteados = new String[60];
		String[] numApostados = new String[60];
		int guardar = 0, acerto = 0;

		System.out.println("----------------- N�meros SORTEADOS -----------------");

		for (int i = 0; i < 6; i++) {
			System.out.print("Informe o " + (i + 1) + "� n�mero sorteado: ");
			guardar = entrada.nextInt();
			numSorteados[guardar - 1] = "1";
		}

		for (int i = 0; i < 60; i++) {
			if (numSorteados[i] == "1") {
				System.out.print("x" + "\t");
			} else {
				if (i < 9) {
					System.out.print("0" + (i + 1) + "\t");
				} else {
					System.out.print((i + 1) + "\t");
				}
			}

			if ((i + 1) % 10 == 0) {
				System.out.println(" ");
			}
		} // fim FOR

		System.out.println("----------------- N�meros APOSTADOS-----------------");

		for (int i = 0; i < 6; i++) {
			System.out.print("Informe o " + (i + 1) + "� n�mero apostado: ");
			guardar = entrada.nextInt();
			numApostados[guardar - 1] = "1";
		}

		for (int i = 0; i < 60; i++) {
			if (numSorteados[i] == "1") {
				System.out.print("x" + "\t");
			} else {
				if (i < 9) {
					System.out.print("0" + (i + 1) + "\t");
				} else {
					System.out.print((i + 1) + "\t");
				}
			}

			if ((i + 1) % 10 == 0) {
				System.out.println(" ");
			}

			if (numSorteados[i] == "1" && numApostados[i] == "1") {
				acerto++;
			}
		} // fim FOR

		if (acerto == 6) {
			System.out.println("Resultado: Acertos " + acerto + " - Usu�rio fez a SENA!!!!!!!! :)");

		} else {
			if (acerto == 5) {
				System.out.println("Resultado: Acertos " + acerto + " - Usu�rio fez a QUINA! ");
			} else {
				if (acerto == 4) {
					System.out.println("Resultado: Acertos " + acerto + " - Usu�rio fez a QUADRA! ");
				} else {
					System.out.println("Resultado: Acertos " + acerto + " - Voc� n�o ganhou... PERDEU PLAYBOY!!! :)");
				}
			}
		}

	}

}
