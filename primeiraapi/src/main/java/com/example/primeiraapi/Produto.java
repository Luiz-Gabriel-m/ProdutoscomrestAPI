package com.example.primeiraapi;

public class Produto {//aqui criei minha classe Produto

    private int Id;//aqui criei uma caracteristica do tipo int

    private String nome;//aqui criei uma caracteristica do tipo String

    private double preco;//aqui criei uma caracteristica do tipo double

    private String categoria;//aqui criei uma caracteristica do tipo String


    public Produto(int ID, String Nome, double Preco, String Categoria) {//aqui crei um metodo com varios parametros

        this.Id = ID;//aqui digo que minhas caracteristicas vão ser iguais as dos parametros do meu metodo
        this.nome = Nome;
        this.preco = Preco;
        this.categoria = Categoria;

    }

    public int getId() {
        return Id;
    }//aqui eu fasso os gets das minhas caracteristicas

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
