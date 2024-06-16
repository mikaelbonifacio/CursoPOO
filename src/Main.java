import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex","Neutro","Marron",25,7,5.5);
        Cachorro cachorro2 = new Cachorro("Rex","Neutro","Marron",25,7,5.5);

        /*
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        */

        cachorro2 = cachorro1;

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
    }
}