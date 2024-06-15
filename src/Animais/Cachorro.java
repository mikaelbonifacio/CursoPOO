package Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    public String estadoDeEspirito;
    //metodos
    public void comer() {}

    public void latir() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return "Bolinha";
    }
    public String interagir(String acao) {

        switch (acao){
            case "carinho":  this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
        }
        return estadoDeEspirito;
    /*
        if (acao.equals("carinho")) {
            this.estadoDeEspirito = "feliz";
        }else if(acao.equals("vai dormir")) {
            this.estadoDeEspirito = "bravo";
        } else {
            this.estadoDeEspirito = "neutro";
        }
    */
    }
}
