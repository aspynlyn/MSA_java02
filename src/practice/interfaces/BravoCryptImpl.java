package practice.interfaces;

public class BravoCryptImpl implements CryptInterface {
  private BravoCrypt crypt = new BravoCrypt();
  @Override
  public void encode(String str) {
    crypt.mcc(str);
  }

  @Override
  public void decode(String str) {
    crypt.mdd(str);
  }
}
