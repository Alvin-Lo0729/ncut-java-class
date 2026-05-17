package c5.lotto;

import java.util.stream.IntStream;

public class OpenLotto extends Lotto {

  @Override
  public void sort() {
    lottoNumber = IntStream.of(getLottoNumber()).sorted().toArray();
  }


  public int[] getMathNumber(Lotto lotto) {

    return IntStream.of(lotto.lottoNumber)
        .filter(num -> IntStream.of(getLottoNumber()).anyMatch(n -> n == num))
        .toArray();

  }
}
