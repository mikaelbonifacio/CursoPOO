package Animais;

public class Animal {

    protected  String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;


    // Construtor


    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

    }

    void comer() {}

    void dormir() {}

    public void soar() {
        System.out.println(" cri cri ");
    }
}


