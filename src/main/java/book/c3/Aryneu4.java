package book.c3;

import java.util.stream.IntStream;

public class Aryneu4 {

  public static void main(String[] args) {
    int[][] dat = {{65, 85, 90, 100}, {80, 90, 95, 115}
        , {95, 85, 75, 110}, {90, 60, 80, 120}};

    printValue(dat);
    int sum = 0;

    for (int[] ints : dat) {
      for (int anInt : ints) {
        sum += anInt;
      }
    }
    System.out.println("sum=" + sum);

  }

  public static void printValue(int[][] dat) {
    for (int[] ints : dat) {
      for (int anInt : ints) {
        System.out.print(anInt + "\t");
      }
      System.out.println();
    }
  }
}
