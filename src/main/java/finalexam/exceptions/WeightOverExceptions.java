package finalexam.exceptions;

import java.io.Serial;

public class WeightOverExceptions extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 969779394946857704L;


  public WeightOverExceptions(String s) {
    super(s);
  }
}
