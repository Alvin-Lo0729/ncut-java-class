package c4;

public class Practice4Dash5 {

  public static void main(String[] args) {
    OtherShape2 otherShape = new OtherShape2();

    System.out.println("正方形的面積是：" + otherShape.cal_area(10.58));
    System.out.println("長方形的面積是：" + otherShape.cal_area(20.45, 5.12));
    System.out.println("圓形的面積是：" + otherShape.cal_area(120.68f));
    System.out.println("梯形的面積是：" + otherShape.cal_area(10.3, 3.98, 15.79));

  }
}
