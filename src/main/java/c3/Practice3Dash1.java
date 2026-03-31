package c3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.lang3.StringUtils;

public class Practice3Dash1 {
 
  private static final String NUMBER = "17004";

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("請輸入5~7個字元");
    try {
      String input = bufferedReader.readLine();
      while (!input.equals(NUMBER)) {
        if (StringUtils.isEmpty(input) || (input.length() < 5 || input.length() > 7)) {
          System.out.println("規則不符，請重新輸入");
        } else {
          String resvers = StringUtils.reverse(input);
          System.out.println(resvers);
        }
        System.out.println("請輸入5~7個字元");
        input = bufferedReader.readLine();
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }

  }

}
