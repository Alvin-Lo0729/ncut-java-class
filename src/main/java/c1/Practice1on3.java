package c1;

import c1.bean.P3Student;
import java.util.Arrays;

public class Practice1on3 {

  public static void main(String[] args) {
    P3Student student1 = new P3Student("1", 85, 72, false);
    P3Student student2 = new P3Student("2", 75, 60, false);
    P3Student student3 = new P3Student("3", 80, 90, true);

    Arrays.asList(student1, student2, student3)
        .forEach(ele -> {
          System.out.println(ele.printData());
          System.out.println("==============");
        });

  }

}
