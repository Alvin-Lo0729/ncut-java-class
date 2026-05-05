package c4;

import c4.bean.Sales;
import c4.bean.SeniorSales;

public class Practice4Dash6 {

  public static void main(String[] args) {
    Sales jack = new Sales();
    System.out.println("jack salary:" + jack.getSalary(985000));
    Sales Lena = new Sales();
    System.out.println("Lena salary:" + Lena.getSalary(850000));
    Sales Barbara = new Sales();
    System.out.println("Barbara salary:" + Barbara.getSalary(1200000));
    Sales Jackson = new SeniorSales();
    System.out.println("Jackson salary:" + Jackson.getSalary(1500000));
    Sales me = new SeniorSales();
    System.out.println("my salary:" + me.getSalary(20000000));

  }

}
