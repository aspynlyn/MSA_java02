package ch13.sec02.example01;

class Car {}
class Tv {}
public class Product <K, M>{
  private K kind;
  private M model;

  public M getModel() {
    return model;
  }

  public void setModel(M model) {
    this.model = model;
  }

  public K getKind() {
    return kind;
  }

  public void setKind(K kind) {
    this.kind = kind;
  }
}
