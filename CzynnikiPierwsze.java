import java.util.Scanner;

public class CzynnikiPierwsze {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
				
		System.out.println("Program do rozbijania liczby na czynniki pierwsze\n");
		
				
		while (true){
			System.out.print("\nPodaj liczbę: n = ");
			int n = scn.nextInt();
			
			// jesli podana liczba to '1' lub jest mniejsza od zera
			if (n <= 1) break;
			
			System.out.print(n + " = ");
			int dzielnik = 3;
			
			while(n>1){
				while (n > 1 && n%2 == 0){
					System.out.print(2 + " ");
					n /= 2;
				}
				// Dzielniki nieparzyste
				while (n > 1 && n%dzielnik == 0){
					System.out.print(dzielnik + " ");
					n /=dzielnik;
				}
				dzielnik +=2;
			}	
		  
		}
		scn.close();
		System.out.println("KONIEC");
	}

}
