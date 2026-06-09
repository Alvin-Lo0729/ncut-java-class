package c7.dash1;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

public class Task3 implements Runnable {

  private CountDownLatch gate;

  public Task3() {
    System.out.println("Task3");
  }

  public Task3(CountDownLatch gate) {
    this.gate = gate;
    System.out.println("Task3");
  }

  @Override
  public void run() {
    try {
      if (Objects.nonNull(gate)) {
        gate.await(); // ← 一開始先卡在閘門，等鳴槍
      }
      for (int i = 0; i < 5; i++) {
        System.out.println("C");
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}
