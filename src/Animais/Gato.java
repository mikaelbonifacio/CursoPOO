package Animais;

public class Gato extends Animal{

    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoEspirito;

        numeroDeGatos ++;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
