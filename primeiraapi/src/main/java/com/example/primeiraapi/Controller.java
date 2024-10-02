package com.example.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController // esta linha e para declarar que esta classe e um controller
@RequestMapping("/Loja")// e esta e para definir a uri de assesso deste controller

public class Controller {

    Produto produto0 = new Produto(0, "Iphone 16 pro max", 11400.00, "Smartphones");
    Produto produto1 = new Produto(1, "Iphone 15 pro max", 5499.99, "Smartphones");
    Produto produto2 = new Produto(2, "Iphone 12 pro max", 3799.99, "Smartphones");
    Produto produto3 = new Produto(3, "Sansung S22 Ultra 5G", 3500.00, "Smartphones");
    Produto produto4 = new Produto(5, "Sansung S23 FE", 2750.00, "Smartphones");
    Produto produto5 = new Produto(6, "Capinha para iphone 16 pro max", 49.99, "Acessorios");
    Produto produto6 = new Produto(6, "Carregador entrada tipo C", 99.99, "Acessorios");
    Produto produto7 = new Produto(7, "Cabo carregador entrada/saida tipo C 45w", 19.99, "Acessorios");
    Produto produto8 = new Produto(8, "Batata Elma Chips Doritos 140g", 14.99, "Comidas");
    Produto produto9 = new Produto(9, "Água", 2.50, "Bebidas");

    ArrayList<Produto> lista_de_produtos = new ArrayList<Produto>();

    @GetMapping("/Listarprodutos")

    public ArrayList<Produto> listarprodutos() {

        lista_de_produtos.clear();

        lista_de_produtos.add(produto0);
        lista_de_produtos.add(produto1);
        lista_de_produtos.add(produto2);
        lista_de_produtos.add(produto3);
        lista_de_produtos.add(produto4);
        lista_de_produtos.add(produto5);
        lista_de_produtos.add(produto6);
        lista_de_produtos.add(produto7);
        lista_de_produtos.add(produto8);
        lista_de_produtos.add(produto9);

        lista_de_produtos.clone();

        return lista_de_produtos;


    }

    @GetMapping("/Quantidadetotaldeprodutos")

    public int quantidade() {

        return lista_de_produtos.size();

    }

    @GetMapping("/Removertodososprodutos")

    public ArrayList<Produto> removertodalista() {


        lista_de_produtos.clear();

        return lista_de_produtos;

    }

    @GetMapping("/Readicionarosprodutos")
    public ArrayList<Produto> readicionarprodutos() {

        if (lista_de_produtos.isEmpty()) {
            listarprodutos();
        } else {
            System.out.println("Não foi possivel readicionar pois os itens não foram removidos!");
        }
        return lista_de_produtos;
    }


    @GetMapping("/Buscarprodutoporcodigo")
    public Object buscacodigo() {

        int id0 = 0;
        int id1 = 1;
        int id2 = 2;
        int id3 = 3;
        int id4 = 4;
        int id5 = 5;
        int id6 = 6;
        int id7 = 7;
        int id8 = 8;
        int id9 = 9;


        return lista_de_produtos.get(id0);


    }
}
