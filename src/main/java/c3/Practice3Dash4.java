package c3;

public class Practice3Dash4 {

  public static void main(String[] args) {
    int[] array = generalIntArray();
    //做計數加總
    int count = 0;
    for (int i = 5; i < 18; i++) {
      //取得陣列的加總次數
      int value = array[i - 5];
      //印出來
      System.out.println("i:" + i + " value: " + value);
      //計數做加總
      count += value;
    }
    //列印總共幾次
    System.out.println(count);
  }

  private static int[] generalIntArray() {
    //建立陣列共１３格，他會將１３格全都預設爲０
    int[] array = new int[13];
    //迭代３００次
    for (int i = 0; i < 300; i++) {
      //利用Math.Random產生數字並且＊１３ 會產生 ０.0～１２．９９９９的數字，
      // 最後＋５就會產生5.0～１７．９９９的數字，
      // 並且做ＩＮＴ轉換，就會產生5~17的數字
      int a = (int) (Math.random() * 13) + 5;
      //將取得的數字，找到對應的陣列內容，取出並＋１
      array[a - 5]++;
    }
    //回傳陣列
    return array;
  }
}
