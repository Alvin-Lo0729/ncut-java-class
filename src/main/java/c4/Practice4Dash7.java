package c4;

import c4.sales7.Employer;
import c4.sales7.PriceUtil;
import c4.sales7.Sale;
import java.util.Arrays;

public class Practice4Dash7 {

  public static void main(String[] args) {
    Sale jack = new Sale("Jack", 985000, 1000000, 1050000, 1100000);
    Sale lena = new Sale("Lena", 850000, 950000, 1020000, 1150000);
    Sale barbara = new Sale("Barbara", 1200000, 1350000, 1250000, 1330000);
    Sale jackson = new Sale("Jackson", 1500000, 1300000, 999000, 1370000);
    Sale me = new Sale("Alvin", 2000000, 2500000, 1000000, 2540000);
    PriceUtil.cal(Arrays.asList(jack, lena, barbara, jackson, me));
    System.out.println("共有幾個員工:" + Employer.getEmployerCounter());
  }

}
