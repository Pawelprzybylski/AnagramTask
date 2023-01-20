import org.junit.Assert;
import org.junit.Test;

public class AnagramVerifyToolsTest {

  @Test
  public void shouldWordsAreAnagram() {
    //give
    String firstWord= "nosek";
    String secondWord= "keson";
    //when
    boolean wordsIsAnagram = AnagramVerifyTools.isAnagram(firstWord,secondWord);
    //then
    Assert.assertTrue(wordsIsAnagram);
  }

  @Test
  public void shouldWordsAreNotAnagram() {
    //give
    String firstWord= "nosek";
    String secondWord= "palec";
    //when
    boolean wordsIsNotAnagram = AnagramVerifyTools.isAnagram(firstWord,secondWord);
    //then
    Assert.assertFalse(wordsIsNotAnagram);
  }

}