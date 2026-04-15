package midexam;

public class Exam3 {

  private static final int MAX_NUMBER = 7;
  private static final int LEVEL = 4;

  public static void main(String[] args) {

  }

  private static void MoreToMinToMore() {
    int total = (LEVEL * 2) - 1;
    for (int i = 0; i < total; i++) {
      int start = (i + 1) > 4 ? 5 : total - (i * 2);
    }
  }

}
