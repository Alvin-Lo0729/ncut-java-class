package c7.dash2;

import java.util.Random;

public class Dash2Task3 implements Runnable {

  private final String[] englishArray = new String[]{"a", "b", "c", "d", "e", "f",
      "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
      "v", "w", "x", "y", "z"};

  @Override
  public void run() {
    Random random = new Random();
    int value = random.nextInt(26);
    System.out.println("task3 word: " + englishArray[value]);
    while (!(englishArray[value].equals("f") || englishArray[value].equals("m")
        || englishArray[value].equals("r") || englishArray[value].equals("y"))) {

      value = random.nextInt(26);
      System.out.println("task3 word: " + englishArray[value]);
      try {
        Thread.sleep(700);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
