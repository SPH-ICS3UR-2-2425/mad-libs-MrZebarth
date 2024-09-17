import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Mr. Zebarth
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a verb ending in ing");
		String verb1 = in.nextLine();
		System.out.println("Enter a person's name ");
		String person = in.nextLine();
		System.out.println("Enter a fruit: ");
		String fruit = in.nextLine();
		System.out.println("Enter a number");
		int num1 = in.nextInt();
		
		
		
		
		//STORY
		System.out.println("One day while "+verb1+" to class, "+person+" tripped on a "+fruit+"peel and fell into a bicycle rack. When he got up, he noticed he broke "+num1+" teeth.");

	}

}
