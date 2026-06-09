package c7.dash1;

import java.util.concurrent.CountDownLatch;

public class Task1 implements Runnable {

  private CountDownLatch gate; // ← 任務自己拿著閘門

  public Task1(CountDownLatch gate) {
    this.gate = gate;
    System.out.println("Task1 ");
  }

  @Override
  public void run() {
    try {
      gate.await(); // ← 一開始先卡在閘門，等鳴槍

      for (int i = 0; i < 8; i++) {
        System.out.println("A");
        Thread.sleep(600);
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    } finally {
      System.out.println("Task1 thread Finally");
    }
  }
}
