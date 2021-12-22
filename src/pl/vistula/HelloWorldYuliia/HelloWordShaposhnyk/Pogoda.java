package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class Pogoda {
    public static void main(String[] args) {
        int time = 15;
        boolean goodPogoda = false;
        boolean late = time >= 23 || time <= 5;

        if(late) {
            System.out.println("Спать");
        }

        if (!late && goodPogoda) {
            System.out.println("Идем гулять");
        }

        if (!late && !goodPogoda){
            System.out.println("Читать книгу");
        }

    }
}
