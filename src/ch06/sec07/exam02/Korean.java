package ch06.sec07.exam02;

public class Korean {
  String nation;
  String name;
  String ssn;


  public Korean(){
    this("신사임당", "901022-2754312");
  }
  public Korean(String name, String ssn){
    this.nation = "대한민국";
    this.name = name;
    this.ssn = ssn;
  }
}
