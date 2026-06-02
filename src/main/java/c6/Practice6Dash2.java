package c6;

import java.util.Scanner;

public class Practice6Dash2 {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("請輸入身高:");
      int height = sc.nextInt();
      System.out.print("請輸入體重:");
      int width = sc.nextInt();

      int value = height - width;
      if (value < 100) {
        throw new IllegalArgumentException("該做做運動了!");
      } else if (value > 115) {
        throw new IllegalArgumentException("要多吃點飯!");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("祝你天天快樂!");
    }

  }
}
