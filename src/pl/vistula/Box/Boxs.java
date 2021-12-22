package pl.vistula.Box;

public class Boxs {
    double width;
    double height;
    double length;

    Boxs(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Boxs(double size) {
        width = size;
        height = size;
        length = size;
    }

    Boxs() {
        width = 0;
        height = 0;
        length = 0;
    }

    Boxs(Boxs box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }
    Boxs(Boxs box1, Boxs box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Boxs increase(int i) {
        return new Boxs(width *i, height * i, length * i);
    }

    Boxs sumBox(Boxs box) {
        return new Boxs(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }

    int compare(Boxs box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
