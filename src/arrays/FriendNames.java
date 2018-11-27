package arrays;

import java.util.Scanner;

public class FriendNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		System.out.println("Enter the length of a first name");
		int length = input.nextInt();
		int num = 0;
		input.nextLine();
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter a name");
			names[i] = input.nextLine();
			int namesLength = names[i].length();
			if(namesLength == length){
				num++;
			}
			namesLength = 0;
		}
		System.out.println(num);
/*		System.out.println("Enter a word");
		String word = input.next();
		char userLetter = word.charAt(0);
		for(int i = 0; i < names.length; i++){
			int namesLength = names[i].length();
			char lastLetter = names[i].charAt(namesLength-1);
			if(lastLetter == userLetter){
				System.out.println(names[i]);
			}
		}
*/
		input.close();

	}

}
