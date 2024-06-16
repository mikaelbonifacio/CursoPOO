package Animais;

public class Gato {

    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoEspirito;

    public Gato(String nome, String cor, int altura, double peso, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;

        numeroDeGatos ++;
    }

    void comer() {}

    void dormir() {}

    void soar() {
        System.out.println("MIAU MIAU");
    }

}
