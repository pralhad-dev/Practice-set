package String;

public class VowelConsent {
  public static void main(String[] args) {
    String str = "programming";
    int vowel = 0;
    int consonent =0;

    for (char c : str.toCharArray()) {
      if (Character.isLetter(c)) {
        if ("aeiou".indexOf(c) != -1) {
          vowel++;
        } else {
          consonent++;
        }
      }
    }

    System.out.println("Vowels = " + vowel);
    System.out.println("Consonants = " + consonent);
  }
}
