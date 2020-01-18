package BronzeIV;
import java.util.Scanner;

public class TenDays_10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int Day = sc.nextInt();
		int[] Cars = new int[5];
		
		Day %= 10;
		for(int i = 0; i < 5; i++) {
			Cars[i] = sc.nextInt();
			if(Day == Cars[i]) {
				count++;
			}
		}
		
		System.out.println(count); 
		sc.close();
	}
}
