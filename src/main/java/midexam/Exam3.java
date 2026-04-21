package midexam;

public class Exam3 {

  private static final int LEVEL = 5;

  public static void main(String[] args) {

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
      int number = 8;
      int start;
      int space;
      if (i < 4) {
        number = 8 - i * 2;
        start = 6 - i;
        space = i;
      } else if (i == 4) {
        number = 0;
        start = 0;
        space = 5;
      } else {
        number = i * 2 - 8;
        start = i - 2;
        space = 6 - start;
      }

      System.out.println(
          " ".repeat(space) + String.valueOf(number).repeat(start == 0 ? 1 : start));
    }
  }

}
