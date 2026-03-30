package book.c3;

public class Aryneu1 {

  public static void main(String[] args) {
    int[] dat = {33, 55, 77, 99, 66, 44, 22, 11};

    int min=dat[0];
    int max=dat[1];
    for(int i=1;i<dat.length;i++){
      if(dat[i]<min){
        min=dat[i];
      }
      if(dat[i]>max){
        max=dat[i];
      }
    }

    System.out.println("max:"+max);
    System.out.println("min:"+min);

  }
}
