package c1.bean;

import java.util.Random;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Student6Score {

  private int language;

  private int math;

  private int science;

  private int english;

  private int earth;

  private int history;

public Student6Score(){
  Random r=new Random();
  this.language=r.nextInt(101);
  this.math=r.nextInt(101);
  this.science=r.nextInt(101);
  this.english=r.nextInt(101);
  this.earth=r.nextInt(101);
  this.history=r.nextInt(101);
}
  public String printScore(){
    return "language: " + language + " math: " + math + " science: " + science + " english: " + english + " earth: " + earth + " history: " + history ;
  }

  public int averageByInt(){
    return (language + math + science + english + earth + history) / 6;
  }

  public  double averageByDouble(){

    return (language + math + science + english + earth + history) / 6.0;
  }

}
