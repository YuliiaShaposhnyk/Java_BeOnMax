package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class staff {
    String name, profession;
    int theSalery;


    public staff(String name, String profession, int theSalery) {
        this.name = name;
        this.profession = profession;
        this.theSalery = theSalery;
    }

    String getInfo(int month) {
        return "Имя: " + name + ". Должность: " + profession
                + ". За последние " + month + " месяцев получил " + month * theSalery + " рублей.";
    }



}

