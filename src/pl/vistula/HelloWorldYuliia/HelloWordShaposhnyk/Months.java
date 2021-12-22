package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.io.IOException;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) throws IOException {
        Scanner month = new Scanner(System.in);
        System.out.println("Wpisz numer mięsiaca: ");
        int i = month.nextInt();
        if (i == 1){
            System.out.println("Styczen" + "\nZima");
        } else if (i == 2) {
            System.out.println("Luty" + "\nZima");
        } else if (i == 3) {
            System.out.println("Marzec" + "\nWiosna");
        } else if (i == 4) {
            System.out.println("Kwieczien" + "\nWiosna");
        } else if (i == 5) {
            System.out.println("Maj" + "\nWiosna");
        } else if (i == 6) {
            System.out.println("Czerwiec" + "\nLato");
        } else if (i == 7) {
            System.out.println("Lipiec" + "\nLato");
        } else if (i == 8) {
            System.out.println("Sierpien" + "\nLato");
        } else if (i == 9) {
            System.out.println("Wrzesien"+ "\nJesien");
        }else if (i == 10) {
            System.out.println("Pazdzernik"+ "\nJesien");
        }else if (i == 11) {
            System.out.println("Listopad"+ "\nJesien");
        }else if (i == 12) {
            System.out.println("Grudzien" + "\nZima");
        } else {
            System.out.println("Nie ma takiego miesiąca");
        }

        System.out.println("Wpisz mięsiac: ");
        String m = month.nextLine();

        if(m.equals("Styczen") || m.equals("Luty") || m.equals("Grudzien")){
            System.out.println("Zima");
        } else if (m.equals("Marzec") || m.equals("Kwieczien") || m.equals("Maj")){
            System.out.println("Wiosna");
        } else if (m.equals("Czerwiec") || m.equals("Lipiec") || m.equals("Sierpien")){
            System.out.println("Lato");
        } else if (m.equals("Wrzesien") || m.equals("Pazdzernik") || m.equals("Listopad")){
            System.out.println("Jesien");
        } else {
            System.out.println("Nie ma takiego pory roku");
        }

        switch (m){
            case "Grudzien":
            case "Styczen":
            case "Luty":
                System.out.println("Zima");
                break;
            case "Marzec":
            case "Kwieczien":
            case "Maj":
                System.out.println("Wiosna");
                break;
            case "Czerwiec":
            case "Lipiec":
            case "Sierpien":
                System.out.println("Lato");
                break;
            case "Wrzesien":
            case "Pazdzernik":
            case "Listopad":
                System.out.println("Jesien");
                break;
            default:
                System.out.println("Nie ma takiego pory roku");
        }

    }
}
