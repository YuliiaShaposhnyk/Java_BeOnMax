package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class Array {
    public static void main(String[] args) {
        int[] first = new int[900];

        for (int i = 0; i < first.length; i++){
            first[i] = i + 100;
        }
        int[] second = new int[first.length];
        for (int i = 0, j = first.length - 1; i < first.length; i ++, j--){
            second[j] = first[i];
        }
        for ( int i : second){
            System.out.println(i);
        }
    }
}




/*
* Создать массив чисел, и проинициализировать его значениями от 100 до 1000.
Создать второй массив по длине равный первому (использовать свойство length).
Проинициализировать его значениями, взятыми из первого массива, но в обратном порядке.
В цикле for each вывести все элементы второго массива.
*
*
* */