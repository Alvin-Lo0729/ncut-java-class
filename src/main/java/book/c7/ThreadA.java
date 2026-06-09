package book.c7;

public class ThreadA implements Runnable {

  Thread td;

  ThreadA() //建構函式
  {
    td = new Thread(this, "Runnable example");
    System.out.println("Second thread:" + td);
    td.start(); //啟動執行緒(進入備妥狀態)
  }

  @Override
  public void run() {
    try {
      for (int k = 3; k > 0; k--) {
        System.out.println("Second thread:" + k);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    } finally {
      System.out.println("Second thread Finally");
    }
  }
}
