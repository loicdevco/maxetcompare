package maxCompare;

import java.util.Scanner;

public class MaxCompareMain {
	public static void donneLaPlusGrandeValeur(double valeur1, double valeur2) {

		if (valeur1 < valeur2) {
			System.out.println("La plus grande valeur est " + valeur2);
		} else {
			System.out.println("La plus grande valeur est " + valeur1);
		}
	}

	public static void comparaison(double valeur1, double valeur2) {
		if (valeur1 == valeur2) {
			System.out.println("0");
		} else if (valeur1 > valeur2) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}

	}

	public static void main(String[] args) {
		char r = ' ';
		do {
			System.out.println("Veuillez entrer une première valeur :");
			Scanner scan = new Scanner(System.in);
			double valeur1 = scan.nextInt();

			System.out.println("Veuillez entrer une deuxième valeur :");
			double valeur2 = scan.nextInt();

			donneLaPlusGrandeValeur(valeur1, valeur2);
			comparaison(valeur1, valeur2);

			System.out.println("Voulez vous recommencer : (O/N)");
			Scanner rep = new Scanner(System.in);
			r = rep.nextLine().charAt(0);

		} while (r == 'O' || r == 'o');

		System.out.println("Merci et à  bientôt");
	}

}
