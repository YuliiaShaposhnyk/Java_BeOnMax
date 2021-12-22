package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class People {
    public static void main(String[] args) {
        Peoples humen1 = new Peoples();
        humen1.name = "Jon";
        humen1.age = 35;
        humen1.value = 80.5;

        Peoples humen2 = new Peoples();
        humen2.name = "Anna";
        humen2.age = 28;
        humen2.value = 55.2;

        Peoples humen3 = new Peoples();
        humen3.name = "Lara";
        humen3.age = 48;
        humen3.value = 60.3;

        Peoples humen4 = new Peoples();
        humen4.name = "Kia";
        humen4.age = 12;
        humen4.value = 100;

        Peoples humen5 = new Peoples();
        humen5.name = "Misza";
        humen5.age = 16;
        humen5.value = 70.4;


        double middleAge = (humen1.age + humen2.age + humen3.age + humen4.age + humen5.age) / 5;
        System.out.println("Средний возраст группы = " + middleAge);
    }

    public static class Peoples {
        String name;
        double value;
        int age;

    }
}
