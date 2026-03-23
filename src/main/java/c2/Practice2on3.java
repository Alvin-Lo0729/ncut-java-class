package c2;

public class Practice2on3 {

  public static void main(String[] args) {

    int notebookPrice = 13;
    int pen = 5;
    int easer = 3;
    int count = 0;
    for (int i = 1; sum(i, 0, 0) <= 121; i++) {
      for (int j = 1; sum(i, j, 0) <= 121; j++) {
        for (int k = 1; sum(i, j, k) <= 121; k++) {
          if (sum(i, j, k) == 121) {
            System.out.println(
                "筆記本" + i + "個，筆" + j + "個，橡皮擦" + k + "個=" + (notebookPrice * i + pen * j
                    + easer * k));
            count = count + 1;
          }
        }
      }
      System.out.println("==============");
    }
    System.out.println("總共有" + count + "種組合");
  }

  public static int sum(int notebook, int pen, int easer) {
    int EASER = 3;
    int PEN = 5;
    int NOTEBOOK_PRICE = 13;
    return notebook * NOTEBOOK_PRICE + pen * PEN + easer * EASER;
  }
}
