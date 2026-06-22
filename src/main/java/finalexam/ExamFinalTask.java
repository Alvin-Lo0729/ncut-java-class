package finalexam;

public class ExamFinalTask implements Runnable {

  private final long millis;
  private final String word;
  private final int times;

  public ExamFinalTask(long millis, String word, int times) {
    this.millis = millis;
    this.word = word;
    this.times = times;
  }

  @Override
  public void run() {
    for (int i = 0; i < times; i++) {
      System.out.println("word: " + word + " Counter:" + (i + 1));
      try {
        //這裡做等待動作
        Thread.sleep(millis);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
