package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 89;
		int cond = 0;
		for (int i = 2; i <= number-1; i++) {
			if (number%i == 0) {
				cond = 1;
				break;
			}
		}
		if (cond == 1) {
			System.out.println("The number "+number +" is not a prime");
		}else {
			System.out.println("The number "+number +" is a prime");
		}
	}

}
