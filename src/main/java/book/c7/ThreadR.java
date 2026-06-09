package book.c7;

public class ThreadR {

  public static void main(String[] args) {
    new ThreadA();

    try {
      for (int k = 3; k > 0; k--) {
        System.out.println("main thread:" + k);
        Thread.sleep(1500);
      }
    } catch (Exception e) {
      System.out.println("end of main thread.");
    }
  }

}
