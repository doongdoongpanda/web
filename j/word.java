package j;

public class word {
	public static void main(String[] args) {
		//
		word word = new word("Hello World");

		System.out.println(word.isVowel1(1));
		System.out.println(word.isVowel2(1));
		System.out.println(word.isVowel3(1));
		System.out.println(word.isConsonat(1));
		System.out.println(word.isConsonat(1));
		System.out.println(word.isConsonat(1));

	}

	private String letters;

	public word(String letters) {
		this.letters = letters.toLowerCase();
	}

	public boolean isVowel1(int i) {
		return letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("i")
				|| letters.substring(i, i + 1).equals("u") || letters.substring(i, i + 1).equals("e")
				|| letters.substring(i, i + 1).equals("o");
	}

	public boolean isVowel2(int i) {
		String vowel = "aiueo";
		return vowel.contains(letters.substring(i, i + 1));
	}

	public boolean isVowel3(int i) {
		String[] vowel = { "a", "i", "u", "e", "o" };
		String word = letters.substring(i, i + 1);
		boolean answer = false;
		for (int j = 0; j < vowel.length; j++) {
			if (word.equals(vowel[0]) || word.equals(vowel[1]) || word.equals(vowel[2]) || word.equals(vowel[3])
					|| word.equals(vowel[4])) {
				answer = true;
			}
		}
		return answer;
	}

	// 자음 확인
	public boolean isConsonat(int i) {
		String[] vowel = { "a", "i", "u", "e", "o" };
		String word = letters.substring(i, i + 1);
		boolean answer = true;
		for (int j = 0; j < vowel.length; j++) {
			if (word.equals(vowel[0]) || word.equals(vowel[1]) || word.equals(vowel[2]) || word.equals(vowel[3])
					|| word.equals(vowel[4])) {
				answer = false;
			}
		}
		return answer;
	}

	// 자음 확인2
	public boolean isConsonat2(int i) {
		String vowel = "aiueo";
		boolean answer = true;
		if (vowel.contains(letters.substring(i, i + 1))) {
			answer = false;
		}
		return answer;
	}

	// 자음 확인3
	public boolean isConsonat3(int i) {
		return !isVowel3(i);
	}
}
