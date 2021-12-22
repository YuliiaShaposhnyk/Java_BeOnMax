package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;
public class Round {
    public static void main(String[] args) {
        int front = 0;
        for (front = 100; front < 1000; front++){
            if (front % 5 == 0){
                System.out.println("Numbers: " + front);
            }
        }
    }
}
