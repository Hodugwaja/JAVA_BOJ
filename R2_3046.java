package BronzeV;
import java.util.Scanner;

public class R2_3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int R2;
		int R1 = sc.nextInt();
		int S = sc.nextInt();
		
		R2 = (S * 2) - R1;
		System.out.println(R2);
		
		sc.close();
	}

}
