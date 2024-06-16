package Animais;

public class Passaro extends Animal{

    static int numeroDePassaros;

    public Passaro(String estadoDeEspirito, double peso, int altura, String cor, String nome) {
        this.estadoDeEspirito = estadoDeEspirito;
        this.peso = peso;
        this.altura = altura;
        this.cor = cor;
        this.nome = nome;

        numeroDePassaros ++;
    }

}
