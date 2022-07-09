package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		
		System.out.println(number1);
		System.out.println(number2);
		for (int i = 2; i < 11; i++) {
			
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
			System.out.println(sum);

		}
	}

}
