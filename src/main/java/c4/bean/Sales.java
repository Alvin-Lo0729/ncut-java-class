package c4.bean;

public class Sales {


  public int getSalary(int yage) {
    int PAY = 10000;
    return (int) (PAY + (yage * 0.05));
  }
}
