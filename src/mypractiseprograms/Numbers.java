package mypractiseprograms;

public class Numbers {
	
	public static void main(String [] args) {
		
		isTheNumberPrime(24);
		printPrimeNumbers();
	}

	private static void isTheNumberPrime(int n) {
		
		int temp = 0;
		for(int i = 2; i < n; i ++) {
			if(n%i == 0) {
				temp += 1;
				break;
			} 
		} 
		if (temp ==0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is Composite");
		}
		
	}

	private static void printPrimeNumbers() {
		int n = 99;
		int temp = 0;
		System.out.println("The prime numbers are : ");
		for(int i=1; i <n; i++) {
			for (int j = 2; j<i; j++) {
				
				if(i%j == 0) {
					temp +=1;
					break;
				}
				
			}
			if(temp == 0) {
				System.out.println(" " +i);
			} else {
				temp = 0;
			}
		}
	}
}
