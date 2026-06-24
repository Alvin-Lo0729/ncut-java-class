package finalexam;

import java.io.Serial;

public class WorkOurException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 969779394946857704L;


  public WorkOurException(String s) {
    super(s);
  }
}
