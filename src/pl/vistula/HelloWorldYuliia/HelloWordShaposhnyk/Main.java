package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner money = new Scanner(System.in);
        System.out.println("Ile masz pieniędzy? :");
        int m = money.nextInt();

        if (m <= 100){
            System.out.println("Купишь Доширак");
        }else if (m <= 300 ){
            System.out.println("Купишь Гамбургер");
        }else if (m <= 500 ){
            System.out.println("Купишь Шаурму");
        }else if (m > 501) {
            System.out.println("Пицца");
        }

        System.out.println();

        staff Jan = new staff("Jon", "kielner", 3600);
        System.out.println(Jan.getInfo(12));
    }
}
