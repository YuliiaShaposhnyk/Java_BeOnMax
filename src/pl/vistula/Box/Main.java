package pl.vistula.Box;

public class Main {
    public static void main(String[] args) {
        Boxs box1 = new Boxs(10);
        Boxs box2 = new Boxs(20,20,10);
        Boxs box3 = box1.sumBox(box2);
        Boxs box4 = new Boxs(box1, box3);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        double volumeSum = box1.volume() + box3.volume();
        System.out.println("box1 + box3 = " + volumeSum);
        box4.showVolume();
    }
}
