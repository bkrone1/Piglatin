import java.util.Scanner;

public class MakingPigLatin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Let's learn Pig Latin");
		System.out.println("Type in a word");
		String userInput = sc.nextLine();
		System.out.println(userInput + " becomes...");

		StringBuilder word = new StringBuilder(userInput);

		char firstLetter = word.charAt(0);

		switch (Character.toLowerCase(firstLetter)) {
		case 'a':
			System.out.println(userInput + "nay");
			break;
		case 'e':
			System.out.println(userInput + "nay");
			break;
		case 'o':
			System.out.println(userInput + "nay");
			break;
		case 'i':
			System.out.println(userInput + "nay");
			break;
		case 'u':
			System.out.println(userInput + "nay");
			break;
		default:
			consanents(userInput);
			break;
		}
	}

	public static void consanents(String userInput) {
		StringBuilder modUserInput = new StringBuilder(userInput);
		for (int i = 0; i < userInput.length(); i++) {
			char consanent = modUserInput.charAt(i);
			if (vowels(modUserInput.charAt(i))) {
				System.out.println(modUserInput.toString() + "ay");

				break;

			} else {
				modUserInput.append(consanent);
				modUserInput.deleteCharAt(i);
				i--;

			}

		}

	}

	public static boolean vowels(char lookingForVowels) {

		boolean isVowel = false;

		if (lookingForVowels == 'a' || lookingForVowels == 'e' || lookingForVowels == 'o' || lookingForVowels == 'i'
				|| lookingForVowels == 'u') {
			isVowel = true;
		}

		return isVowel;

	}
}