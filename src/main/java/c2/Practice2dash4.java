package c2;

import java.util.Scanner;

public class Practice2dash4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("請輸入圈數");
    int n = sc.nextInt();
    int total = n * 2 - 1;
    for (int i = 0; i < total; i++) {
      int start =  i>=n?(total-i)*2-1:i*2+1;
      int space=(total-start)/2;
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < start; k++) {
        System.out.print("*");
      }
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

  }
}
