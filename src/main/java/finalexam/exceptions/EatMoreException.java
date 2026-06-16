package finalexam.exceptions;

import java.io.Serial;

public class EatMoreException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 7511908878812471720L;

  public EatMoreException(String s) {
    super(s);
  }


}
