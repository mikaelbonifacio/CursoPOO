import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex","Neutro","Marron",25,7,5.5);
        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Rex","Neutro","Marron",25,7,5.5);
        System.out.println(cachorro1.getNumeroDeCachorros());
        System.out.println(cachorro2.getNumeroDeCachorros());


    }
}