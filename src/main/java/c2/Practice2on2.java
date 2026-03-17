package c2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice2on2 {

  public static void main(String[] args) {

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

      System.out.print("請輸入第一個數：");
      String a = bufferedReader.readLine();

      System.out.print("請輸入第二個數：");
      String b = bufferedReader.readLine();

      System.out.print("請輸入第三個數：");
      String c = bufferedReader.readLine();

      int aInteger = Integer.parseInt(a);
      int bInteger = Integer.parseInt(b);
      int cInteger = Integer.parseInt(c);

      int maxValue = IntStream.of(aInteger, bInteger, cInteger).max().getAsInt();
      int minValue = IntStream.of(aInteger, bInteger, cInteger).min().getAsInt();

      int sum = aInteger + bInteger + cInteger;
      float average = sum / 3f;

      String averageValueString = String.format("%.3f", average);

      System.out.println("最大數：" + maxValue);
      System.out.println("最小數：" + minValue);
      System.out.println("平均數：" + averageValueString);

    } catch (Exception exception) {
      exception.printStackTrace();
    }


  }


}
