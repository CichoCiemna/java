import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        double a, b, x;
        int w,y;

      do{
        System.out.print("Podaj liczbe: ");
        Scanner l1 = new Scanner(System.in);
        a = l1.nextDouble();
        System.out.print("Podaj liczbe: ");
        Scanner l2 = new Scanner(System.in);
        b = l2.nextDouble();
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");

        do{
            Scanner w1 = new Scanner(System.in);
            System.out.println("Wybierz liczbe od 1 do 4");
            w = w1.nextInt();

        }while(w<1 || w>4);

            switch (w) {
            case 1:
                x = a + b;
                System.out.println( a +"+"+b + "=" + x);
                break;

            case 2:
                x = a - b;
                System.out.println(  a +"-"+b + "="+ x);
                break;

            case 3:
                x = a * b;
                System.out.println( + a +"*"+b + "=" + x);
                break;

            case 4:
                x = a / b;
                System.out.println( + a +"/"+b + "="+ x);
                break;



        }
        System.out.println("Czy chcesz wykonać inne działanie?");
        System.out.println("1.Tak");
        System.out.println("2.Nie");

do {
    Scanner w2 = new Scanner(System.in);
    System.out.println("Wybierz 1 lub 2");
    y = w2.nextInt();
}while(y<1 || y>2);

}while(y==1);

}



    }

