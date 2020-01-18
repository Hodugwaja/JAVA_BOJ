package BronzeIV;
import java.util.Scanner;

public class Money_1712 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(B >= C) {
			System.out.println("-1");
		} else {
			money = A / (C - B);
			System.out.println(money + 1);
		}
		sc.close();
	}
}
