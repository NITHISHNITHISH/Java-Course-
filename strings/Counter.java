package strings;

public class Counter {

	public static void main(String[] args) {

		int vowel = 0, character = 0, word = 0, specialChar = 0, number = 0, sentence = 0;

		String str = "as/(2,4hfd adjhds riwendf,adh37@35. d78*92 92.";
		char temp;
		for (int i = 0; i < str.length(); i++) {

			temp = str.charAt(i);
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U' || temp == 'a' || temp == 'e'
					|| temp == 'i' || temp == 'o' || temp == 'u') {
				vowel++;
				character++;
			}

			else if ((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')) {

				character++;
			}

			else if (temp >= 0 && temp <= 9) {
				number++;
			}

			else if (temp == ',' || temp == ' ') {
				specialChar++;
				word++;
			} else if (temp == '.') {
				word++;
				sentence++;
			}

		}

		System.out.println("Vowel Count : " + vowel);
		System.out.println("Character Count : " + character);
		System.out.println("Word Count : " + word);
		System.out.println("Sentence Count : " + sentence);

	}

}
