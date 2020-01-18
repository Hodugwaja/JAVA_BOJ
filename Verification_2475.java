package BronzeV;
import java.util.Scanner;

public class Verification_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Number = new int[5];
		int ver = 0;
		
		for(int i = 0; i < 5; i++) {
			Number[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			ver += Number[i] * Number[i];
		}
		System.out.println(ver % 10);
		sc.close();
	}
}
