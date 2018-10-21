package mypractiseprograms;

public class PrintlargestNumberInArray {
	
	public static void main(String [] args) {
		
		int [] numbers = {34,3,1,99,88,2,23};

		//Arrays.sort(numbers);
		int largest = Integer.MIN_VALUE;
		for (int number:numbers) {
			//System.out.println(number);
			if(number > largest) {
				largest = number;
			}
		}	
		System.out.println("The largest number in array is " + largest);
		
		int smallest = Integer.MAX_VALUE;
		for (int number:numbers) {
			if(number < smallest) {
				smallest = number;
			}
		}	
		System.out.println("The smallest number in array is " + smallest);
	}
}
