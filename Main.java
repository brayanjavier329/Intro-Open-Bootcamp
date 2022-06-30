package Intro;

public class Main {
    public static void main(String[] args) {

        System.out.println(suma(2, 5, 89));

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);

    }

    static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int puertas = 4;

    public void aumentarPuertas() {
        this.puertas++;
    }
}
