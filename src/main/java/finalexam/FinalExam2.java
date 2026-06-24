package finalexam;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FinalExam2 {

  public static void main(String[] args) {

    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
      //這裡輸入老師要的資訊
      CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(
          new ExamFinalTask(600L, "R", 8),
          executor).thenAccept(unused -> System.out.println("Task1 thread Finally"));
      //這裡輸入老師要的資訊
      CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(
          new ExamFinalTask(900L, "Q", 6),
          executor).thenAccept(unused -> System.out.println("Task2 thread Finally"));
      //這裡輸入老師要的資訊
      CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(
          new ExamFinalTask(700L, "T", 7),
          executor).thenAccept(unused -> System.out.println("Task3 thread Finally"));

      CompletableFuture.allOf(completableFuture, completableFuture2, completableFuture3).join();
      //這裡輸入老師要的訊息
      System.out.println("子執行緒全部完成");

    } catch (Exception e) {

    }

  }

}
