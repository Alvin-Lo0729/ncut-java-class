package c4;

public class Rectangle2 {

  public double cal_area(double value) {
    return Math.pow(value, 3.0);
  }

  public double cal_area(double value, double value2) {
    return value * value2;
  }

  public double cal_area(float value) {
    return Math.PI * Math.pow(value, 2.0);
  }

  public double cal_area(double value, double value2, double value3) {
    return ((value + value2) * value3) / 2;
  }
}
