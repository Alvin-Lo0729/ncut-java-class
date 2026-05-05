package c4.bean;

public class SeniorSales extends Sales {


  @Override
  public int getSalary(int yage) {
    int PAY = 12000;
    return (int) (PAY + (yage * 0.06));
  }
}
