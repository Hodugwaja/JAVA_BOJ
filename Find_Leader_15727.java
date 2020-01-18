package BronzeV;
import java.util.Scanner;

public class Find_Leader_15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int t = L / 5;
		switch(L%5) {
		case 0:
			System.out.println(t);
			break;
		default:
			System.out.println(t+1);
			break;
		}
		sc.close();
	}
}
