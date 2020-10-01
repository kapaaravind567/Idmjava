
import java.util.Scanner;

public class SumOfFactors {
	static int sumFactor(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find sum of factors");
		int number = sc.nextInt();
		System.out.println("The sum of factors of "+number+" "+"is :"+sumFactor(number));
	}

}
