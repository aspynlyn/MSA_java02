package practice.interfaces;

public class AlphaCryptImpl implements CryptInterface {
  private AlphaCrypt crypt = new AlphaCrypt();
  @Override
  public void encode(String str) {
    crypt.maa(str);
  }

  @Override
  public void decode(String str) {
    crypt.mbb(str);
  }
}
