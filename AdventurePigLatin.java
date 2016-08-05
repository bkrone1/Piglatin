import java.util.Scanner;

public class AdventurePigLatin {

	public static void main(String[] args) {
		int whatever;

		wordsInput();

	}

	public static void wordsInput() {
		Scanner whatWord = new Scanner(System.in);

		System.out.println("Please enter the words you would like translated");
		String sentence = whatWord.nextLine();

		String[] arrayOfWords = sentence.split("\\s");

		for (int i = 0; i < arrayOfWords.length; i++) {
			translator(arrayOfWords[i]);

		}

	}

	public static void translator(String wordToBeTranslatered) {

		StringBuilder word = new StringBuilder(wordToBeTranslatered);

		char firstLetter = word.charAt(0);

		switch (Character.toLowerCase(firstLetter)) {
		case 'a':
			System.out.print(wordToBeTranslatered + "nay" + " ");
			break;
		case 'e':
			System.out.print(wordToBeTranslatered + "nay" + " ");
			break;
		case 'o':
			System.out.print(wordToBeTranslatered + "nay" + " ");
			break;
		case 'i':
			System.out.print(wordToBeTranslatered + "nay" + " ");
			break;
		case 'u':
			System.out.print(wordToBeTranslatered + "nay" + " ");
			break;
		default:
			consanents(wordToBeTranslatered);
			break;
		}
	}

	public static void consanents(String userInput) {
		StringBuilder modUserInput = new StringBuilder(userInput);
		for (int i = 0; i < userInput.length(); i++) {
			char consanent = modUserInput.charAt(i);
			if (vowels(modUserInput.charAt(i))) {
				System.out.print(modUserInput.toString() + "ay" + " ");

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
				|| lookingForVowels == 'u' || lookingForVowels == 'y') {
			isVowel = true;
		}

		return isVowel;

	}

}
