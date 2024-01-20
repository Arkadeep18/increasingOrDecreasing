import java.util.*;
public class increasingOrDecreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int firstNum = sc.nextInt();
		

		System.out.println("Enter first number");
		int secNum = sc.nextInt();

		System.out.println("Enter first number");
		int thirdNum = sc.nextInt();
		
		if(firstNum < secNum && secNum < thirdNum) {
			System.out.println("Increasing");
		}
		else if(firstNum > secNum && secNum > thirdNum) {
			System.out.println("Decreasing");
		}
		else {
			System.out.println("Neither increasing nor decresing");
		}
		
	}

}
