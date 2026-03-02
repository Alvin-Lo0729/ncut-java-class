import java.math.BigDecimal;
import java.math.RoundingMode;

public class Practice1on2 {


  public static void main(String[] args) {
    double value1 = (double) 9 / 5;
    double value2 = 32;
    System.out.println("when celsius is 15, fahrenheit is " + calculateTemperature(15.0));

    System.out.println("when celsius is 25, fahrenheit is " + calculateTemperature(25.0));

    System.out.println("when celsius is 35, fahrenheit is " + calculateTemperature(35.0));

  }


  /**
   * 從攝氏溫度計算出華氏溫度
   *
   * @param celsius 攝氏溫度
   * @return 華氏溫度
   */
  public static double calculateTemperature(double celsius) {
//    return ((double) 9 /5)*celsius+32;
    return new BigDecimal("9.0").divide(new BigDecimal("5.0"), RoundingMode.HALF_UP)
        .multiply(new BigDecimal(celsius)).add(new BigDecimal(32)).doubleValue();

  }
}
