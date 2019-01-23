import java.util.Scanner;
public class Absolute{
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the first number");
		int first = reader.nextInt();
		System.out.print("Enter the second number");
		int second = reader.nextInt();

		int result;

		if(first>second){
			result = first - second;

		}
		else{
			result = second - first;

		}
		
		System.out.println(result);
		

		



		}


	}
}