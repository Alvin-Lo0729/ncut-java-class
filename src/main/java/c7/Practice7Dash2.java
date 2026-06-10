package c7;

import c7.dash2.Dash2Task1;
import c7.dash2.Dash2Task2;
import c7.dash2.Dash2Task3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice7Dash2 {

  public static void main(String[] args) {

    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
      CountDownLatch gate = new CountDownLatch(1); // 閘門，初始 1
      CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Dash2Task1(),
          executor).thenAccept(unused -> System.out.println("Task1 thread Finally"));
      CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(new Dash2Task2(),
          executor).thenAccept(unused -> System.out.println("Task2 thread Finally"));
      CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(new Dash2Task3(),
          executor).thenAccept(unused -> System.out.println("Task3 thread Finally"));
      System.out.println("==========");
      CompletableFuture.allOf(completableFuture, completableFuture2, completableFuture3).join();
      System.out.println("執行緒全部結束");

    } catch (Exception e) {

    }

  }

}
