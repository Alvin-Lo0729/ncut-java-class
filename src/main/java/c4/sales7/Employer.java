package c4.sales7;

import lombok.Getter;

@Getter
public class Employer {

  private static Integer employerCounter;
  private final String name;

  public Employer(String name) {
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
