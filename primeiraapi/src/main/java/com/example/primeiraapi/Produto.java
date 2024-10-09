package com.example.primeiraapi;

public class Produto {

    private int Id;

    private String nome;

    private double preco;

    private String categoria;


    public Produto (int ID, String Nome, double Preco, String Categoria) {

        this.Id = ID;
        this.nome = Nome;
        this.preco = Preco;
        this.categoria = Categoria;

    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
}
