package practice.interfaces;

public class CharlieCryptImpl implements CryptInterface{
  private CharlieCrypt crypt = new CharlieCrypt();

  @Override
  public void encode(String str) {
    crypt.ggg(str);
  }

  @Override
  public void decode(String str) {
    crypt.uuu(str);
  }
}
