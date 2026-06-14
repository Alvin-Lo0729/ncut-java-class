package finalexam.task;

public class ExamFinalTask1 implements Runnable {


  @Override
  public void run() {
    for (int i = 0; i < 8; i++) {
      System.out.println("task1 word: " + "A" + " Counter:" + (i + 1));
      try {
        //這裡做等待動作
        Thread.sleep(600);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
