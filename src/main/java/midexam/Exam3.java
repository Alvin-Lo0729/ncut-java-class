package midexam;

public class Exam3 {

  private static final int LEVEL = 5;

  public static void main(String[] args) {
    minToMore();
    System.out.println("---------------");
    moreToMinToMore();
  }

  private static void minToMore() {
    int total = (LEVEL * 2) - 1;
    for (int i = 0; i < total; i++) {
      int start = i >= LEVEL ? total - i : i + 1;
      int space = LEVEL - start;
      System.out.println(
          " ".repeat(space) + String.valueOf(start).repeat(start));
    }
  }

  private static void moreToMinToMore() {
    int total = (LEVEL * 2) - 1;

    for (int i = 0; i < total; i++) {
      int start = i >= LEVEL ? ((i * 2) - total) + 2 : total - (i * 2);
      int space = (total - start) / 2;
      System.out.println(
          " ".repeat(space) + "*".repeat(start) + " ".repeat(space));
    }
  }

}
