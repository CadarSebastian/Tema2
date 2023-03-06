import java.util.Scanner;

public class Piramida {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Mate(n);

	}
	public static void Mate(int n) {
		int o =2;
		int m=n-1;
		for(int i=n;i>=1;i--) {
			for(int p=m;p>=0;p--) {
				System.out.print(" ");	
			}m=m-1;
			for(int j=o;j>=1;j--) {
				
				System.out.print(i); 
			}o=o+2;
			System.out.println();
			
		}
	}

}
