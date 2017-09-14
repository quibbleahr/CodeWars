public class Vowels {
  public static int getCount(String str) {
    int vowelsCount = 0;
    char[] strC = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      if (strC[i] == 'a' || strC[i] == 'e' || strC[i] == 'i' || strC[i] == 'o' || strC[i] == 'u')
      vowelsCount += 1;
    }
    return vowelsCount;
  }
}
