package c4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class StudentDemo1 {

  private int id;
  private String name;
  private int math;
  private int com;
  private int java;

  private int average() {
    return (getMath() + getCom() + getJava()) / 3;
  }

  public void display() {
    System.out.println("the ID:" + getId());
    System.out.println("the name:" + getName());
    System.out.println("the average score:" + average());
  }
}
