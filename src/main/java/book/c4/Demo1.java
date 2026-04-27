package book.c4;

public class Demo1 {

  public static int average(int a, int b, int c) {
    return ((a + b + c) / 3);
  }

  public static void display(int no, String na, int score) {
//    System.out.println("the ID:+no); 沒有“
    System.out.println("the ID:" + no);

    System.out.println("the name:" + na);
    System.out.println("the average score:" + score);
  }

  public static void main(String[] args) {
    int ID1 = 12;
    String name1 = "John";
//    Int math1=90; i要小寫
    int math1 = 90;
//    Int comp1=85; i要小寫
    int comp1 = 85;
    int java1 = 95, avg1;
    int ID2 = 25;
    String name2 = "Mary";
//    Int math2=85; i要小寫
    int math2 = 85;
//    Int comp2=95; i要小寫
    int comp2 = 95;
//    int ava2=75.avg2; 1.Java 2.要用,
    int java2 = 75, avg2;
    avg1 = average(math1, comp1, java1); //靜態類別方法不能呼叫物件方法

    display(ID1, name1, avg1); //靜態類別方法不能呼叫物件方法

    avg2 = average(math2, comp2, java2); //靜態類別方法不能呼叫物件方法

    display(ID1, name1, avg2);//靜態類別方法不能呼叫物件方法
  
  }
}
