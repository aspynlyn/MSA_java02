package ch13.sec01;

public class BoxGeneric<T> {
  private T obj;

  public void setObj(T obj) {
    this.obj = obj;
  }

  public T getObj() {
    return this.obj;
  }
}
