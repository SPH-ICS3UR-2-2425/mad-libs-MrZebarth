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
		System.out.println("Give me a day of the week: ");
		String dayOfWeek = in.nextLine();
		System.out.println("Give me a sport");
		String sport = in.nextLine();
		System.out.println("Give me a number: ");
		int score = in.nextInt();
		System.out.println("Give me a decimal number: ");
		double decNumber = in.nextDouble();
		System.out.println("Give me a name: ");
		in.nextLine();
		String person1 = in.nextLine();
		System.out.println("Give me another name: ");
		String person2 = in.nextLine();
		
		
		System.out.println("On "+dayOfWeek+", "+person1+" and "+person2+" were playing "+sport+" when a seagull crashed the game and scored "+score+" points. That broke a record that was "+decNumber+" years old.");

		in.close();
	}

}
