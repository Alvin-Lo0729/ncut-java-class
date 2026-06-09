package c7;

import c7.dash1.Task1;
import c7.dash1.Task2;
import c7.dash1.Task3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Practice7Dash1 {

  public static void main(String[] args) {
    try (ExecutorService pool = Executors.newVirtualThreadPerTaskExecutor()) {
      CountDownLatch gate = new CountDownLatch(1); // 閘門，初始 1

      pool.submit(new Task1(gate));
      pool.submit(new Task2(gate));
      pool.submit(new Task3(gate));
      gate.countDown();
      pool.shutdown(); // 不再接新任務
      pool.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS); // 等全部跑完

      System.out.println("執行緒結束");

    } catch (Exception e) {

    }

  }

}
