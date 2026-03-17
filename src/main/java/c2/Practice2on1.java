package c2;

import java.util.Scanner;

public class Practice2on1 {

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("請輸入浮點數：");

    double input=sc.nextDouble();

    String value=String.format("%09.3f", input);
    System.out.print("萬位:"+value.charAt(0));
    System.out.print(",千位:"+value.charAt(1));
    System.out.print(",百位:"+value.charAt(2));
    System.out.print(",十位:"+value.charAt(3));
    System.out.print(",個位:"+value.charAt(4));
    System.out.print(",小數點後一位:"+value.charAt(6));
    System.out.print(",小數點後二位:"+value.charAt(7));
    System.out.print(",小數點後三位:"+value.charAt(8)+"\n");

  }

}
