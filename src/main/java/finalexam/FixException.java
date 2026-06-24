package finalexam;

import java.io.Serial;

public class FixException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 7511908878812471720L;

  public FixException(String s) {
    super(s);
  }


}
