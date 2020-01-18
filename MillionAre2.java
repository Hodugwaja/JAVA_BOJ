package BronzeV;
import java.util.Scanner;

public class MillionAre2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		float m = sc.nextFloat();
		
		float nanum = n / m;
		float leftover = n % m;
		System.out.println((int)nanum);
		System.out.println((int)leftover);
		
		sc.close();
	}
}
