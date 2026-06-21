package finalexam;

import finalexam.exceptions.EatMoreException;
import finalexam.exceptions.WeightOverExceptions;
import java.util.Scanner;

public class FinalExam1 {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("請輸入身高:");
      int height = sc.nextInt();
      System.out.print("請輸入體重:");
      int width = sc.nextInt();
      //這邊做數值處理
      int value = height - width;
      if (value < 100) {
        //這裡輸入老師要的訊息，並丟出exception
        throw new WeightOverExceptions("該去運動了");
      } else if (value > 120) {
        //這裡輸入老師要的訊息，並丟出exception
        throw new EatMoreException("該吃多一點");
      }
    } catch (Exception e) {
      //這裡會將exception內容印出來
      System.out.println(e.getMessage());
    } finally {
      System.out.println("祝你天天快樂!");
    }

  }
}
