package c4.sales7;

import java.math.BigInteger;
import lombok.Getter;

@Getter
public class Sale extends Employer {

  private final BigInteger season1Score;
  private final BigInteger season2Score;
  private final BigInteger season3Score;
  private final BigInteger season4Score;

  public Sale(String name, Integer season1Score, Integer season2Score,
      Integer season3Score, Integer season4Score) {
    this(name, BigInteger.valueOf(season1Score), BigInteger.valueOf(season2Score),
        BigInteger.valueOf(season3Score), BigInteger.valueOf(season4Score));
  }

  public Sale(String name, BigInteger season1Score, BigInteger season2Score,
      BigInteger season3Score,
      BigInteger season4Score) {
    super(name);
    this.season1Score = season1Score;
    this.season2Score = season2Score;
    this.season3Score = season3Score;
    this.season4Score = season4Score;
  }

  public boolean isOverSeason1() {
    return overPrice(season1Score);
  }

  public boolean isOverSeason2() {
    return overPrice(season2Score);
  }

  public boolean isOverSeason3() {
    return overPrice(season3Score);
  }

  public boolean isOverSeason4() {
    return overPrice(season4Score);
  }


  public BigInteger getYearScore() {
    return season1Score.add(season2Score).add(season3Score).add(season4Score);
  }

  public boolean is4SeasonOver() {
    return isOverSeason1() && isOverSeason2() && isOverSeason3() && isOverSeason4();
  }

  private boolean overPrice(BigInteger bigInteger) {
    return bigInteger.compareTo(BigInteger.valueOf(1000000)) >= 0;
  }

}
