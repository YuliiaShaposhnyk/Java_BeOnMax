package pl.vistula.newKurs;

public class Monsters {
    int eys, legs, hands;

    public Monsters(int eys, int legs, int hands) {
        this.eys = eys;
        this.legs = legs;
        this.hands = hands;
    }

    void freak(int i){
        this.eys = 2;
        this.legs = 2;
        this.hands = 2;
        System.out.println("Human");
    }

    void freak (int e, int l){
        this.eys = e;
        this.legs = l;
        this.hands = 2;
        System.out.println("Freak");
    }

    void freak(int e, int h, int l){
        this.eys = e;
        this.legs = l;
        this.hands = h;
        System.out.println("Monster");
    }

    void voice (){
        System.out.println("Voice");
    }

    void voice ( int n){
        for (int i = 0; i < n; i++){
            System.out.println("Rik");
        }

    }

    void voice (int n, String world){
        for (int i = 0; i < n; i++){
            System.out.println(world);
        }
    }





}
