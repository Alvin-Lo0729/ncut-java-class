package midexam;

import java.util.Random;

public class Exam2 {

  private static final int MIN = 50;
  private static final int MAX = 60;
  private static final int NUMBER = 50;
  private static final int COUNT = 5;

  public static void main(String[] args) {
    int[] intArray = getRandomNumber();
    printValue(intArray);
    printFirstValue(intArray);
  }

  private static void printFirstValue(int[] intArray) {
    int lastMax = NUMBER;
    int lastCount = Math.min((MAX - MIN + 1), COUNT);
    for (int i = 0; i < lastCount; i++) {
      int currentMax = 0;
      StringBuilder number = new StringBuilder();
      int count = 1;
      for (int j = 0; j < intArray.length; j++) {
        if (intArray[j] >= currentMax && intArray[j] < lastMax) {
          if (intArray[j] > currentMax) {
            number = new StringBuilder((j + MIN) + "號");
            count = 1;
          } else {
            count++;
            number.append(",").append(j + MIN).append("號");
          }
          currentMax = intArray[j];
        }
      }
      lastMax = currentMax;
      if (!number.isEmpty()) {
        System.out.println(number + "出現" + currentMax + "次");
      }
      if (count > 1) {
        i = i + (count - 1);
      }
    }
  }

  public static void printValue(int[] ary) {
    int countAll = 0;
    for (int i = 0; i < ary.length; i++) {
      System.out.println((i + MIN) + "號，共開出" + ary[i] + "次");
      countAll += ary[i];
    }
    System.out.println("共開獎" + countAll + "次");
  }

  public static int[] getRandomNumber() {
    Random random = new Random();
    int[] intArray = new int[MAX - MIN + 1];
    for (int i = 0; i < NUMBER; i++) {
      int value = random.nextInt(MIN, MAX + 1);
      intArray[value - MIN]++;
    }
    return intArray;
  }
}
