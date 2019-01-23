import java.util.Scanner;

class Age{
	public static void main(String[] args){

		Scanner reader = new Scanner(System.in);

		final int DAY = 30;
		final int MONTH = 10;
		final int YEAR = 2018;

		System.out.print( "enter your day of birth:");
		int birthday = reader.nextInt();

		System.out.print( "enter your month of birth:");
		int birthMonth = reader.nextInt();

		System.out.print( "enter your year of birth:");
		int birthYear = reader.nextInt();

		int age;
		age = YEAR - birthYear - 1;
		if(birthMonth == MONTH){
			if(birthday == DAY){
				System.out.println("Happy birthday!");
				age +=1;
			
	
				} else {
					if(birthday < DAY){
						age += 1;
					}
				}
					} else{
						if(birthday < MONTH){
							age++;

						}
					}

			System.out.println(age + " years old.");

		}
	}
	
