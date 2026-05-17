package c5.lotto;

import java.util.Random;
import lombok.Getter;

@Getter
public abstract class Lotto {


  protected int[] lottoNumber = new int[5];

  public Lotto() {

    Random random = new Random();

    for (int i = 0; i < 5; i++) {
      int number = random.nextInt(1, 14);
      while (isExist(number)) {
        number = random.nextInt(1, 14);
      }
      lottoNumber[i] = number;
    }

    sort();
  }

  private boolean isExist(int number) {
    for (int i : getLottoNumber()) {
      if (i == number) {
        return true;
      }
    }
    return false;
  }

  public abstract void sort();


}
