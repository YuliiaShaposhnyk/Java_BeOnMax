package pl.vistula.collections;

public class Main {
    public static void main(String[] args) {
        MyArrayList employer = new MyArrayList();
        employer.add("dddddd");
        employer.add("pppppp");
        employer.add("oooooo");
        employer.remove(0);
        for (int i = 0; i < employer.getSize(); i ++){
            System.out.println(employer.get(i));
        }
    }
}
