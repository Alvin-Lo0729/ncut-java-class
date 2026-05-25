package c5;

import c4.sales7.Employer;
import c5.em2.PriceUtil2;
import c5.em2.Sale2;
import java.util.Arrays;

public class Practice5Dash4 {

  public static void main(String[] args) {
    Sale2 jack = new Sale2("Jack", 985000, 1000000, 1050000, 1100000);
    Sale2 lena = new Sale2("Lena", 850000, 950000, 1020000, 1150000);
    Sale2 barbara = new Sale2("Barbara", 1200000, 1350000, 1250000, 1330000);
    Sale2 jackson = new Sale2("Jackson", 1500000, 1300000, 999000, 1370000);
    Sale2 me = new Sale2("Alvin", 2000000, 2500000, 1000000, 2540000);
    PriceUtil2.cal(Arrays.asList(jack, lena, barbara, jackson, me));
    System.out.println("共有幾個員工:" + Employer.getEmployerCounter());
  }

}
