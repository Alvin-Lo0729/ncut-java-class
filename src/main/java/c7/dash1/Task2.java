package c7.dash1;

import java.util.concurrent.CountDownLatch;

public class Task2 implements Runnable {

  private CountDownLatch gate;

  public Task2(CountDownLatch gate) {
    this.gate = gate;
    System.out.println("Task2");
  }

  @Override
  public void run() {
    try {
      gate.await(); // ← 一開始先卡在閘門，等鳴槍

      for (int i = 0; i < 6; i++) {
        System.out.println("B");
        Thread.sleep(800);
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    } finally {
      System.out.println("Task2 thread Finally");
    }
  }
}
