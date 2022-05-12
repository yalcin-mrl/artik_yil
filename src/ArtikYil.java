import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        boolean isTrue =false;
        int yil = sc.nextInt();
        if(yil%4 == 0){
          if(yil%100==0){
              if(yil%400 == 0){
                  isTrue = true;
              }
              else{
                  isTrue= false;
              }
          }else{
              isTrue = true;
          }
        }
        else{
            isTrue = false;
        }
        if(isTrue){
            System.out.println(yil+" bir artık yıldır! ");
        }else{
            System.out.println(yil+" bir artık yıl değildir! ");
        }
    }
}
