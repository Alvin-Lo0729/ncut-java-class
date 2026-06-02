package c6.exceptions;

import java.io.Serial;

public class NoDataException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 4454397711223199530L;

  public NoDataException(String s) {
    super(s);
  }

  public NoDataException() {
    super("請輸入資料");
  }

}
