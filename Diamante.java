import java.util.Scanner;

public class star_wars {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de linhas: ");
		int x = Sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Não pode ser feito");
		} else {
			
			int i = 0;
			
			double b = x / 2 - 0.5;
			
			int c = 1;
			
			int e = 0;
			
			for (int d = 0; d < x; d++) {
				if (c < x) {
					for (int a = 0; a < b; a++) {
						System.out.print(" ");	
					}
					
					for (int z = 0; z < c; z++) {
						System.out.print("*");
					}
					
					System.out.println();
					
					c += 2;
				
					i++;
					b -= 1;
					e = c;
				} else {
					for (int a = 0; a < b; a++) {
						System.out.print(" ");	
					}
					
					for (int z = 0; z < e; z++) {
						System.out.print("*");
					}
					
					System.out.println();
					
					e -= 2;
					
				
					i++;
					b += 1;
				}
			}
			
			
			
		}
	
	}
	
}
