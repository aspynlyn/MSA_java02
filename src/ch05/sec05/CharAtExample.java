package ch05.sec05;

public class CharAtExample {
  public static void main(String[] args) {
    String ssn = "950624-1230123";
    char gender = ssn.charAt(7);
    System.out.println("gender: " + gender);


    if(gender == '1' || gender == '3'){
      System.out.println("남");
    }else if(gender == '2' || gender == '4'){
      System.out.println("여");
    }else{
      System.out.println("인간실격");
    }

    switch(gender){
      case '1':
      case '3':
        System.out.println("남");
        break;
      case '2':
      case '4':
        System.out.println("여");
        break;
      default:
        System.out.println("에일리언");
    }
  }
}
