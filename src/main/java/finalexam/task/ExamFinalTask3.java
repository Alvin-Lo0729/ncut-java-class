package finalexam.task;

public class ExamFinalTask3 implements Runnable {


  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("task3 word: " + "C" + " Counter:" + (i + 1));
      try {
        //這裡做等待動作
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
