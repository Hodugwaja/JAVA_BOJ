package BronzeV;
import java.util.Scanner;

public class Hexa_1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Hexa = sc.next();
		int num = Integer.parseInt(Hexa, 16);
		System.out.println(num);
		sc.close();
	}
}
