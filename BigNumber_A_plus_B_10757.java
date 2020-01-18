package BronzeV;
import java.util.Scanner;

public class BigNumber_A_plus_B_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = A + B;
		System.out.printf("%.0lf", C);
		sc.close();
	}
}
