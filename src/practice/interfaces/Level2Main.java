package practice.interfaces;

public class Level2Main {
  public static void main(String[] args) {
    String password = "비밀번호";
    CryptInterface crypt = CryptFactory.createCrypt(args[0]);
    crypt.encode(password);
    crypt.decode(password);
  }
}
