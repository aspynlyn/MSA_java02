package ch06.sec04;

public class StudentExample {
  public static void main(String[] args) {
    Student s1 = new Student();
//    참조타입. Student 객체의 주소값만 저장할 수 있음
    Student s2 = new Student();
//    Student두개는 각각 다른 객체임 동일X 동등O

    s1.name = "홍길동";
    s2.name = "신사임당";

    s1.introduce();
    s2.introduce();
  }

}
