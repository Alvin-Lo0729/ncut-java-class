package finalexam.task;

public class ExamFinalTask2 implements Runnable {


  @Override
  public void run() {
    for (int i = 0; i < 6; i++) {
      System.out.println("task2 word: " + "B" + " Counter:" + (i + 1));
      try {
        //這裡做等待動作
        Thread.sleep(800);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
