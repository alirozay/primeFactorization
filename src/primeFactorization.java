import java.util.Scanner;
public class primeFactorization {
	public static void main(String[] args) {
		int number;
		Scanner keyboard = new Scanner(System.in);
		String result = "";
		do {
		System.out.println("Enter a number to find its prime factors:");
		number = keyboard.nextInt();
		for(int i=1;i<=number;i++) {
			if(number%i == 0) {
				boolean isPrime = true;
				for(int j=2;j<Math.sqrt(i) && isPrime ;j++) {
					isPrime = (i%j != 0);
				}
				if(isPrime) result+=i+" ";
			}
		}
		System.out.println(result);
		result = "";
	}while(number!=0);
}
}