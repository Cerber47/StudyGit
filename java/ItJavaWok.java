import java util.Scanner;
import java util.Random;
public class ItJavaWok{
public static void main(String[]args){
		Scanner reader = new Scanner(system.in);
		Random random = new Random();


//Переменные

String eggsUdon = "Eggs Udon";
String meatUdon = "Meat Udon";
String vegetableUdon = "Vegetable Udon";

String chicken = "Chicken";
String beef = "Beef";
String seaFood = "Sea Food";

String spicySauce = "Spicy Sauce";
String sweetSauce = "Sweet Sauce";
String soySauce = "Soy Sauce";

//Выбор
		System.out.print("Menu Noodles:"
			+"\n" 
			+ eggsUdon
			+ "\n" 
			+ meatUdon
			+ "\n"
			+ vegetableUdon);
		System.out.print("enter your choice:");
		int noodles = reader.nextInt();

		System.out.print("Menu filling:"
			+"\n" 
			+chicken 
			+ "\n" 
			+ beef 
			+ "\n"
			+ seaFood);
		System.out.print("enter your choice:");
		int filling = reader.nextInt();

		System.out.print("Menu Sauce :"
			+"\n" 
			+ spicySauce 
			+ "\n" 
			+ sweetSauce 
			+ "\n"
			+ soySauce);
		System.out.print("enter your choice:");
		int sauce  = reader.nextInt();



//выбор яйца
		if(noodles == 1 ){
			System.out.println("Your choice is noodles with " + eggsUdon);
			if(filling == 1 ){ //выбор курицы
				System.out.println("with " + chicken);
					if(sauce == 1 ){ 
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else if(filling == 2){ // выбор мяса
				System.out.println("with " + beef);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else if(filling == 3){ //морская еда
				System.out.println("with " + seaFood);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else{
			System.out.println("Your choice is uncorrect, please, try again");
			}	
		}
//выбор мясовой лапши
		if(noodles == 2 ){
			System.out.println("Your choice is noodles with " + meatUdon);
			if(filling == 1 ){
				System.out.println("with " + chicken);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else if(filling == 2){
				System.out.println("with " + beef);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else if(filling == 3){
				System.out.println("with " + seaFood);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else{
			System.out.println("Your choice is uncorrect, please, try again");
			}
//выбор vegan лапши
		if(noodles == 3 ){
			System.out.println("Your choice is noodles with " + vegetableUdon);
			if(filling == 1 ){
				System.out.println("with " + chicken);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else if(filling == 2){
				System.out.println("with " + beef);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else if(filling == 3){
				System.out.println("with " + seaFood);
					if(sauce == 1 ){
						System.out.println("and " + spicySauce);
					}else if(sauce == 2){
						System.out.println("and " + sweetSauce);
					}else if(sauce == 3){
						System.out.println("and " + soySauce);
					}else{
						System.out.println("Your choice is uncorrect, please, try again");
					}	
			}else{
			System.out.println("Your choice is uncorrect, please, try again");
			}	
		}

		int num = 10000 + random.nextInt(11000 - 10000);
		System.out.println("you order is:" + num);	
	}
}
