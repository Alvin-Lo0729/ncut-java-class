package c6.exceptions;

public class DataErrorExceptions extends RuntimeException {

  public DataErrorExceptions() {
    super("參數錯誤");
  }

  public DataErrorExceptions(String s) {
    super(s);
  }

}
