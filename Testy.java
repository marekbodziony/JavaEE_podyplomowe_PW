import java.util.Random;
import java.util.Scanner;

public class Testy {

	public static void main(String[] args) {
		
		System.out.println("\n\tProgranm do tworzenia dwu-wymiarowej tablicy! \n");
		System.out.println("Podaj trzy liczby (m - liczba wierszy; n - liczba kolumn; z - zakres generowania losowych liczb do tablicy)");
		
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		
		while(true){
			System.out.print("m = ");
			int m = scn.nextInt();
		
			System.out.print("n = ");
			int n = scn.nextInt();
		
			System.out.print("z = ");
			int z = scn.nextInt();
		
			if (n <= 0 || m <= 0 || z <= 0) break;
			
			int [][] tablica = new int[m][n];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
				
					tablica[i][j] = rnd.nextInt(2*z)-z;
					System.out.print(tablica[i][j] + " ");
				}	
				System.out.println(); // następna linia (wyswietla nastepny rzad elementów)
			}
			System.out.println(); // następna linia (puste miejsce pod tablicą)
			//printTab(tablica);	// wywołujemy metode, która wyswietla cała tablice
			
			System.out.println("\nWydruk wg zmiennych szerokości pól\n");
			//System.out.printf("%d %d == %d\n", m, n, z);
			//System.out.printf("%5d %5d == %5d\n", m, n, z);
			System.out.printf("%" + m + "d%" + n + "d%" + z + "d\n", m, n, z);
			System.out.printf("%-" + m + "d%-" + n + "d%-" + z + "d\n", m, n, z);
		}
		scn.close();
		System.out.println("KONIEC");
	}
	
	static void printTab(int [][]tab){
		
		for (int [] row : tab){
			for (int x : row){
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
