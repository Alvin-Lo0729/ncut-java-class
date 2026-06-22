package finalexam;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FinalExam2 {

  public static void main(String[] args) {

    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
      //這裡輸入老師要的資訊
      CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(
          new ExamFinalTask(600L, "A", 8),
          executor).thenAccept(unused -> System.out.println("Task1 thread Finally"));
      //這裡輸入老師要的資訊
      CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(
          new ExamFinalTask(800L, "B", 6),
          executor).thenAccept(unused -> System.out.println("Task2 thread Finally"));
      //這裡輸入老師要的資訊
      CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(
          new ExamFinalTask(1000L, "C", 5),
          executor).thenAccept(unused -> System.out.println("Task3 thread Finally"));

      CompletableFuture.allOf(completableFuture, completableFuture2, completableFuture3).join();
      //這裡輸入老師要的訊息
      System.out.println("執行緒全部結束");

    } catch (Exception e) {

    }

  }

}
