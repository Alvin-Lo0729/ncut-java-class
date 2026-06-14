package finalexam;

import finalexam.task.ExamFinalTask1;
import finalexam.task.ExamFinalTask2;
import finalexam.task.ExamFinalTask3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FinalExam2 {

  public static void main(String[] args) {

    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
      CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new ExamFinalTask1(),
          executor).thenAccept(unused -> System.out.println("Task1 thread Finally"));
      CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(new ExamFinalTask2(),
          executor).thenAccept(unused -> System.out.println("Task2 thread Finally"));
      CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(new ExamFinalTask3(),
          executor).thenAccept(unused -> System.out.println("Task3 thread Finally"));

      CompletableFuture.allOf(completableFuture, completableFuture2, completableFuture3).join();
      System.out.println("==========");
      System.out.println("執行緒全部結束");

    } catch (Exception e) {

    }

  }

}
