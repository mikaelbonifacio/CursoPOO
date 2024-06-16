import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex","Neutro","Marron",25,7,5.5);
        Gato gato1 = new Gato("Salem", "Preto", 25, 2, "Perturbado");
        Passaro passaro1 = new Passaro("Picapau", "Vermelho", 1, 0.5, "Alegre");
        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());
        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

    }
}
