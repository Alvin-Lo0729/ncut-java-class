package c5.em2;

import java.util.Comparator;
import java.util.List;

public final class PriceUtil2 {

  public static void cal(List<Sale2> saleList) {
    saleList.sort(Comparator.comparing(Sale2::getYearScore).reversed());
    for (int i = 0; i < saleList.size(); i++) {
      Sale2 sale = saleList.get(i);
      Integer price = 0;
      StringBuilder builder = new StringBuilder();
      builder.append("業務：").append(sale.getName()).append("獎金有：").append("\n");
      if (sale.isOverSeason1()) {
        builder.append("第一季績效獎金：" + 12000).append("\n");
        price += 12000;
      }
      if (sale.isOverSeason2()) {
        builder.append("第二季績效獎金：" + 12000).append("\n");
        price += 12000;
      }
      if (sale.isOverSeason3()) {
        builder.append("第三季績效獎金：" + 12000).append("\n");
        price += 12000;
      }
      if (sale.isOverSeason4()) {
        builder.append("第四季績效獎金：" + 12000).append("\n");
        price += 12000;
      }
      if (sale.is4SeasonOver()) {
        builder.append("四季獎金：" + 10000).append("\n");
        price += 10000;
      }
      if (i == 0) {
        builder.append("排名獎金第").append(i + 1).append("名：").append(33000).append("\n");
        price += 33000;
      }
      if (i == 1) {
        builder.append("排名獎金第").append(i + 1).append("名：").append(22000).append("\n");
        price += 22000;
      }
      if (i == 2) {
        builder.append("排名獎金第").append(i + 1).append("名：").append(11000).append("\n");
        price += 11000;
      }
      if (i == 3) {
        builder.append("排名獎金第").append(i + 1).append("名：").append(8000).append("\n");
        price += 8000;
      }

      builder.append("總獎金為：").append(price);

      System.out.println(builder);
      System.out.println("================");
    }


  }


}
