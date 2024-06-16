import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex","Neutro","Marron",25,7,5.5);
        Gato gato1 = new Gato("Salem", "Preto", 25, 2, "Perturbado");
        Passaro passaro1 = new Passaro("Picapau", "Vermelho", 1, 0.5, "Alegre");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}
