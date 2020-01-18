package BronzeIV;
import java.util.Scanner;

public class AverageScore_10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] score = new int[5];
		
		for(int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();
			if(score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		System.out.println(sum / 5);
		sc.close();
	}
}
