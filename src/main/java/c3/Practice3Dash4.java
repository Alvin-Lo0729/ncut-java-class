package c3;

public class Practice3Dash4 {

  public static void main(String[] args) {
    int[] array = generalIntArray();
    int count = 0;
    for (int i = 5; i < 18; i++) {
      int value = array[i - 5];
      System.out.println("i:" + i + " value: " + value);
      count += value;
    }
    System.out.println(count);
  }

  private static int[] generalIntArray() {
    int[] array = new int[13];
    for (int i = 0; i < 300; i++) {
      int a = (int) (Math.random() * 13) + 5;
      array[a - 5]++;
    }
    return array;
  }
}
