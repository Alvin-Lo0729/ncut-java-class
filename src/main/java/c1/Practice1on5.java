package c1;

import c1.bean.P3Student;
import c1.bean.Student6Score;

public class Practice1on5 {

  public static void main(String[] args) {
    Student6Score student1=new Student6Score();

    Student6Score student2=new Student6Score();

    System.out.println("學生1成績:"+student1.printScore());
    System.out.println("學生2成績:"+student2.printScore());

    System.out.println("學生1平均INT格式："+student1.averageByInt());

    System.out.println("學生2平均INT格式："+student2.averageByInt());


    System.out.println("學生1平均double格式："+student1.averageByDouble());


    System.out.println("學生2平均double格式："+student2.averageByDouble());
  }
}
