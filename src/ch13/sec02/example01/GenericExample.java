package ch13.sec02.example01;

public class GenericExample {
  public static void main(String[] args){
    Product<Tv, String> p1 = new Product<>();
    p1.setKind(new Tv());
    p1.setModel("스마트Tv");

    Tv tv = p1.getKind(); // Tv객체의 주소값 리턴
    String model = p1.getModel(); // String객체의 주소값 리턴

    System.out.println("---------------");

    Product<Car, String> p2 = new Product<>();
    p2.setKind(new Car());
  }
}
