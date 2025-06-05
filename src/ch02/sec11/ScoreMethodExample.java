package ch02.sec11;

import javax.swing.plaf.metal.MetalTheme;

public class ScoreMethodExample {
  public static void main(String[] args){
    int randomScore = getRandomValue(10, 100);
    System.out.println(randomScore);

    char grade = getGrade(randomScore);
    // 100점 초과시 혹은 0점 미만시 ' ' 리턴
    // 90점 이상 'A'리턴
    // 80점 이상 'B'리턴
    // 70점 이상 'C'리턴
    // 나머지 'D'리턴
    System.out.println(grade);
  }

  public static char getGrade(int temp){
    if(temp > 100 || temp < 0){
      return '땡';
    }else if(temp >= 90){
      return 'A';
    }else if(temp >= 80){
      return  'B';
    }else if(temp >= 70){
      return 'C';
    }else{
      return 'D';
    }
  }

  public static int getRandomValue(int from, int to){
    return (int)(Math.random() * (to - from + 1) ) + from;

  }
}
