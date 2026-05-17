package c5.lotto;

import lombok.Getter;

@Getter
public class UserLotto extends Lotto {


  @Override
  public void sort() {
    for (int i = 0; i < lottoNumber.length - 1; i++) {
      for (int j = i + 1; j < lottoNumber.length; j++) {
        if (lottoNumber[i] > lottoNumber[j]) {
          int temp = lottoNumber[i];
          lottoNumber[i] = lottoNumber[j];
          lottoNumber[j] = temp;
        }
      }
    }
  }
}
