package c5;

import c5.lotto.Lotto;
import c5.lotto.OpenLotto;
import c5.lotto.UserLotto;
import java.util.Arrays;

public class Practice5Dash1 {


  public static void main(String[] args) {
    OpenLotto openLotto = new OpenLotto();
    System.out.println("開獎號碼:" + Arrays.toString(openLotto.getLottoNumber()));

    Lotto user1 = new UserLotto();
    System.out.println("user1 選擇的號碼:" + Arrays.toString(user1.getLottoNumber()) + "\t");
    System.out.println("中獎號碼:" + Arrays.toString(openLotto.getMathNumber(user1)));
    Lotto user2 = new UserLotto();
    System.out.println("user2 選擇的號碼:" + Arrays.toString(user2.getLottoNumber()) + "\t");
    System.out.println("中獎號碼:" + Arrays.toString(openLotto.getMathNumber(user2)));
    Lotto user3 = new UserLotto();
    System.out.println("user3 選擇的號碼:" + Arrays.toString(user3.getLottoNumber()) + "\t");
    System.out.println("中獎號碼:" + Arrays.toString(openLotto.getMathNumber(user3)));


  }
}
