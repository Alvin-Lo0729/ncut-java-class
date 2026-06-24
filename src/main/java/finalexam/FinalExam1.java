package finalexam;

import java.util.Scanner;

public class FinalExam1 {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("請輸入身高:");
      int height = sc.nextInt();
      System.out.print("請輸入體重:");
      int width = sc.nextInt();
      //這邊做數值處理
      int value = height - width;
      if (value < 95) {
        //這裡輸入老師要的訊息，並丟出exception
        throw new WorkOurException("1");
      } else if (value > 120) {
        //這裡輸入老師要的訊息，並丟出exception
        throw new FixException("2");
      }
    } catch (WorkOurException e) {
      //這裡會將exception內容印出來
      System.out.println("要開始健身了");
    } catch (FixException e) {
      System.out.println("要多多保養了");
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      System.out.println("祝你萬事如意!");
    }

  }
}
