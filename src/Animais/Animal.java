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


    // getters setters

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }


    // metodos
    void comer() {}

    void dormir() {}

    public void soar() {
        System.out.println(" cri cri ");
    }
}


