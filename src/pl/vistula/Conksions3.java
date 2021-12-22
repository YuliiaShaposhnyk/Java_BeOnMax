package pl.vistula;
import java.util.ArrayList;

public class Conksions3 {
    public static void main(String[] args) {
        ArrayList<Integer> cyfru = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesAndcyfru = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            cyfru.add(i);
        }
        names.add("Андрей");
        names.add("Катя");
        names.add("Настя");
        names.add("Антон");
        names.add("Женя");
        names.add("Дима");
        names.add("Коля");
        names.add("Мария");
        names.add("Роман");
        names.add("Павел");

        for (int i = 0; i < names.size(); i++){
            String s = cyfru.get(i) + " - " + names.get(i);
            namesAndcyfru.add(s);
        }

        for (String s : namesAndcyfru){
            System.out.println(s);
        }

    }
}
