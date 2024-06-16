package Animais;

public class Passaro {

    static int numeroDePassaros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    public Passaro(String estadoDeEspirito, double peso, int altura, String cor, String nome) {
        this.estadoDeEspirito = estadoDeEspirito;
        this.peso = peso;
        this.altura = altura;
        this.cor = cor;
        this.nome = nome;

        numeroDePassaros ++;
    }

    void comer() {}

    void dormir() {}

    void soar() {
        System.out.println("PIU PIU");
    }

}
