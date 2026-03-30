package book.c3;

public class ArrayChar1 {

  public static void main(String args[]) {

    char[] dat = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    for (int k = 0; k < dat.length; k++) {
      System.out.println("dat[" + k + "]=" + dat[k]);
    }
    for (int k = 0; k < dat.length; k++) {
      dat[k] = (char) (k + 70);
    }
    System.out.println("change data to ascii code 70-78");
    for ( int k = 0; k < dat.length; k++) {
      System.out.print("dat[" + k + "]=" + dat[k]);
      System.out.println("\t ascii code=" + (int) dat[k]);
    }
  }

}
