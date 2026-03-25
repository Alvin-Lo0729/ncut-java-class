package c2;

import java.util.Scanner;
import org.apache.commons.collections4.bloomfilter.SparseBloomFilter;

public class Practice2dash4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("請輸入圈數");
    int n = sc.nextInt();
    int total = n * 2 - 1;
    for (int i = 0; i < total; i++) {
      int start = i >= n ? (total - i) * 2 - 1 : i * 2 + 1;
      int space = (total - start) / 2;
      System.out.println(" ".repeat(space) + "*".repeat(start) + " ".repeat(space));
    }
    System.out.println(" ");
    for (int i = 0; i < total; i++) {
      int start = i >= n ? ((i * 2) - total) + 2 : total - (i * 2);
      int space = (total - start) / 2;
      System.out.println(" ".repeat(space) + "*".repeat(start) + " ".repeat(space));
    }

  }
}
