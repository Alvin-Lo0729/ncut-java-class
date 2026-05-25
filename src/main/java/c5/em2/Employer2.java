package c5.em2;

import lombok.Getter;

@Getter
public class Employer2 {

  private static Integer employerCounter;
  private final String name;

  public Employer2(String name) {
    if (employerCounter == null) {
      employerCounter = 1;
    } else {
      employerCounter++;
    }
    this.name = name;
  }

  public static Integer getEmployerCounter() {
    return employerCounter;
  }
}
