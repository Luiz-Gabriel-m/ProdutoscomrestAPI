package com.example.primeiraapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController // esta linha e para declarar que esta classe e um controller
@RequestMapping("/Loja")// e esta e para definir a uri de assesso deste controller

public class Controller {

    ArrayList<Produto> lista_de_produtos = new ArrayList<Produto>();

    public Controller () {

        adicionarprodutos();

    }
    @GetMapping("/Listarprodutos")
    public ArrayList<Produto> listarprodutos() {

        return lista_de_produtos;

    }

    public void adicionarprodutos() {

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

    }


    @GetMapping("/Quantidadetotaldeprodutos")

    public int quantidade() {

        return lista_de_produtos.size();

    }

    @GetMapping("/Removertodososprodutos")

    public String removertodalista() {

        lista_de_produtos.clear();

        return "Produtos removidos com sucesso!";

    }

    @GetMapping("/Readicionarosprodutos")
    public String readicionarprodutos() {

        if (lista_de_produtos.isEmpty()) {

            adicionarprodutos();

        } else {

            System.out.println("Não foi possivel readicionar pois os itens não foram removidos!");

        }
        return "Produtos readicionados com sucesso!";
    }

    @GetMapping("/Buscarid/{id}")
    public Produto buscarid (@PathVariable int id) {

        for (Produto produto : lista_de_produtos) {
            if (produto.getId() == id) {

                return produto;

            }
        }
        return null;
    }
}

