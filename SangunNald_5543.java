package BronzeIV;
import java.util.Scanner;

public class SangunNald_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int LastBurger = 3000, LastBeverage = 3000;
		int[] burger = new int[3];
		int[] beverage = new int[2];
		
		for(int i = 0; i < 3; i++) {
			burger[i] = sc.nextInt();
			if(LastBurger > burger[i]) {
				LastBurger = burger[i];
			}
		}
		for(int i = 0; i < 2; i++) {
			beverage[i] = sc.nextInt();
			if(LastBeverage > beverage[i]) {
				LastBeverage = beverage[i];
			}
		}
		System.out.println(LastBeverage + LastBurger - 50);
		sc.close();
	}
}
