package c1.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class P3Student {

  private String name;

  private int attendance;

  private int score;

  private boolean cheated;

  public boolean isAttendanceOver80(){
    return getAttendance() >= 80;
  }

  public boolean isScoreOver60(){
    return getScore() >= 60;
  }

  /**
   * 是否符合獎勵資格
   * @return boolean
   */
  public boolean isEligible(){
    return isAttendanceOver80() && isScoreOver60() && !isCheated();
  }

  public String printData(){
    return  "學生"+getName()+
        "\n出席達標："+(isAttendanceOver80())+
        "\n成績及格："+(isScoreOver60()) +
        "\n沒有作弊："+!(isCheated())+
        "\n符合獎勵資格："+isEligible();
  }


}
