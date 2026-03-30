package book.c3;

import org.apache.commons.lang3.ArrayUtils;

public class Aryneu2 {

  public static void main(String[] args) {
    int[] dat = {33, 55, 77, 99, 66, 44, 22, 11};
    System.out.println("the data before sorting");
    for (int j : dat) {
      System.out.print(j + " ");
    }
    System.out.println();
    int tmp;
    for (int j = 0; j < dat.length - 1; j++) {
      for (int k = j + 1; k < dat.length; k++) {
        if (dat[j] < dat[k]) {
          tmp = dat[j];
          dat[j] = dat[k];
          dat[k] = tmp;
        }
      }
    }
    System.out.println("the data after sorting");
    for (int k = 0; k < dat.length; k++) {
      System.out.println("dat[" + k + "]=" + dat[k]);
    }
  }
}


