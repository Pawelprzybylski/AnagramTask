public class AnagramVerifyTools {
  private static final int characterRange = 4999;

  public static boolean isAnagram(String firstWord, String secondWord) {
    if (firstWord.length() != secondWord.length()) {
      return false;
    }

    int[] count = new int[characterRange];
    for (int i = 0; i < firstWord.length(); i++) {
      count[firstWord.charAt(i)]++;
      count[secondWord.charAt(i)]--;
    }

    for (int i = 0; i < characterRange; i++) {
      if (count[i] != 0) {
        return false;
      }
    }

    return true;
  }

}