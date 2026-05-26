package c6;

public class Practice6Dash1 {

  public static void main(String[] args) {
    try {
      if (false) {
        int a = 9 / 0;
      } else {
        int[] ab = new int[1];
        int c = ab[2];
      }
    } catch (ArithmeticException arithmeticException) {
      System.out.println("我抓到算數例外了");
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      System.out.println("我抓到陣列索引例外了");
    } finally {
      System.out.println("9B417004 羅星傑");
    }

  }

}
