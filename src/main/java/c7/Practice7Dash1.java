package c7;

import c7.dash1.Task1;
import c7.dash1.Task2;
import c7.dash1.Task3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Practice7Dash1 {

  public static void main(String[] args) {
    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
      CountDownLatch gate = new CountDownLatch(1); // 閘門，初始 1
      CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Task1(gate),
          executor).thenAccept(unused -> System.out.println("Task1 thread Finally"));
      CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(new Task2(gate),
          executor).thenAccept(unused -> System.out.println("Task2 thread Finally"));
      CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(new Task3(gate),
          executor).thenAccept(unused -> System.out.println("Task3 thread Finally"));

//      pool.submit(new Task1(gate));
//      pool.submit(new Task2(gate));
//      pool.submit(new Task3(gate));
      gate.countDown();
      executor.shutdown(); // 不再接新任務
      executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS); // 等全部跑完

      System.out.println("執行緒結束");

    } catch (Exception e) {

    }

  }

}
