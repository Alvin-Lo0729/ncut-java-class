package c7.dash2;

import java.util.Random;

public class Dash2Task2 implements Runnable {


  @Override
  public void run() {
    Random random = new Random();
    int value = random.nextInt(10);
    System.out.println("task2 number: " + value);
    while (value != 5) {
      value = random.nextInt(10);
      System.out.println("task2 number: " + value);
      try {
        Thread.sleep(600);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
