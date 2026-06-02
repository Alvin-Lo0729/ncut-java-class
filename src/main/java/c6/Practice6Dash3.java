package c6;

import c6.exceptions.DataErrorExceptions;
import c6.exceptions.NoDataException;
import java.util.ArrayList;
import java.util.List;

public class Practice6Dash3 {

  public static void main(String[] args) {
    try {
      Integer aa = 44;
      checkData(aa);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    } finally {
      System.out.println("9B417004 羅星傑");
    }
    try {
      List<String> list = new ArrayList<>();
      checkDataValue(list);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    } finally {
      System.out.println("9B417004 羅星傑");
    }
  }

  public static void checkData(Object o) {
    if (!(o instanceof String)) {
      throw new DataErrorExceptions();
    }
  }

  public static void checkDataValue(List<String> list) {
    if (list.isEmpty()) {
      throw new NoDataException();
    }
  }
}
