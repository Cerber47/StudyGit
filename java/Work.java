import java.util.Scanner;
import java.util.Random;
class Work{
	public static void main(String[] args){
		Random random = new Random();
		Scanner reader = new Scanner(System.in);
		

		for(int i = 0; i <= 10; i++){
            int bonus = random.nextInt(100);
            System.out.println("bonus equels: " + bonus);
			System.out.print("Угадай премию?");
			int guess  = reader.nextInt();
           
			if(bonus > guess ){
				System.out.println("You did't guess, bonus is biggest");
				
			}
			else if(bonus < guess){
				System.out.println("You did't guess, bonus is smallest");
				
			}
			else { 
				System.out.println("You were right");
				break;
			}			
		}
		System.out.println("You cannot get bonus");
    }
}