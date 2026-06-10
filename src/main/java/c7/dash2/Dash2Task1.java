package c7.dash2;

import java.util.Random;

public class Dash2Task1 implements Runnable {

  private final String[] englishArray = new String[]{"A", "B", "C", "D", "E", "F"
      , "G", "H", "I", "J", "K", "L"
      , "M", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};

  @Override
  public void run() {
    Random random = new Random();
    int value = random.nextInt(26);
    System.out.println("task1 word: " + englishArray[value]);
    while (!(englishArray[value].equals("H") || englishArray[value].equals("P")
        || englishArray[value].equals("X"))) {

      value = random.nextInt(26);
      System.out.println("task1 word: " + englishArray[value]);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
