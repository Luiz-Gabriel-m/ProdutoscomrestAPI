package com.example.primeiraapi;

public class Produto {

    private int id;

    private String nome;

    private double preco;

    private String categoria;


    public Produto(int ID, String Nome, double Preco, String Categoria) {

        this.id = ID;
        this.nome = Nome;
        this.preco = Preco;
        this.categoria = Categoria;

    }

    public int getId() {
        return id;
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
