package com.example.primeiraapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController // esta linha e para declarar que esta classe e um controller
@RequestMapping("/Loja")// e esta e para definir a uri/endpoint de assesso deste controller

public class Controller {

    ArrayList<Produto> lista_de_produtos = new ArrayList<Produto>();//Aqui criei meu arraylist e atribui um nome a ele

    public Controller() {//aqui criei meu construtor que adiciona meus produtos no meu arraylist atraves de outro metodo

        adicionarprodutos();//aqui chamo o metodo que adiciona meus produtos na minha lista

    }

    @GetMapping("/Listarprodutos")//aqui criei um endpoint que chama o metodo listar produtos
    public ArrayList<Produto> listarprodutos() {//aqui criei o metodo que lista meus produtos

        return lista_de_produtos;//aqui eu retorno minha lista de clientes apenas exibindo não adiciona ou remove nada

    }

    public void adicionarprodutos() {//aqui criei o metodo que adiciona os meus produtos

        Produto produto0 = new Produto(0, "Iphone 16 pro max", 11400.00, "Smartphones");//aqui concatenei as infomacoes correspondemtes a cada produto
        Produto produto1 = new Produto(1, "Iphone 15 pro max", 5499.99, "Smartphones");
        Produto produto2 = new Produto(2, "Iphone 12 pro max", 3799.99, "Smartphones");
        Produto produto3 = new Produto(3, "Sansung S22 Ultra 5G", 3500.00, "Smartphones");
        Produto produto4 = new Produto(5, "Sansung S23 FE", 2750.00, "Smartphones");
        Produto produto5 = new Produto(6, "Capinha para iphone 16 pro max", 49.99, "Acessorios");
        Produto produto6 = new Produto(6, "Carregador entrada tipo C", 99.99, "Acessorios");
        Produto produto7 = new Produto(7, "Cabo carregador entrada/saida tipo C 45w", 19.99, "Acessorios");
        Produto produto8 = new Produto(8, "Batata Elma Chips Doritos 140g", 14.99, "Comidas");
        Produto produto9 = new Produto(9, "Água", 2.50, "Bebidas");

        lista_de_produtos.add(produto0);//aqui adicionei na minha lista cada produto com as informações que concatenei anteriormente
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


    @GetMapping("/Quantidadetotaldeprodutos")//aqui criei um endpoint que chama o metodo que conta quantos produtos minha lista contem

    public int quantidade() {//aqui criei o metodo que conta quantos produtos minha lista contem

        return lista_de_produtos.size();//aqui retorno minha lista porem com um parametro do arraylist que conta a quantidade de itens presentes na minha lista assim retornando o valor total de itens que a lista contem

    }

    @GetMapping("/Removertodososprodutos")//aqui criei um endpoint que chama o metodo que ira remover todos os produtos da minha lista

    public String removertodalista() {//aqui criei o metodo que ira remover todos os produtos da minha lista porem ira retornar uma mensagem do tipo string informando o que aconteceu


        lista_de_produtos.clear();//aqui retorno minha lista porem com um parametro do arraylist que remove todos os produtos da minha lista

        return "Produtos removidos com sucesso!";//aqui retorno uma menssagem do que foi realizado

    }

    @GetMapping("/Readicionarosprodutos")//aqui criei um endpoint que chama o metodo readicionar produtos
    public String readicionarprodutos() {//aqui criei o metodo que ira readicionar todos os produtos da minha lista porem ira retornar uma mensagem do tipo string informando o que aconteceu

        if (lista_de_produtos.isEmpty()) {//aqui criei um if para comparar se me lista esta vazia ou n pois ele so ira readicionar os produtos cas a lista esteja vazia caso contrario ele redireciona direto ao else

            adicionarprodutos();//aqui chamo meu metodo que adiciona meus produtos

        } else {//aqui exibe uma mensagem informando o que aconteceu

            System.out.println("Não foi possivel readicionar pois os itens não foram removidos!");//aqui retorno uma menssagem do que foi realizado

        }
        return "Produtos readicionados com sucesso!";//aqui retorno uma menssagem do que foi realizado
    }

    @GetMapping("/Buscarid/{id}")//aqui criei um endpoint com um parametro que ira chamar meu metodo que busca o produto que corresponde ao id desejado
    public Produto buscarid(@PathVariable int id) {//aqui crei meu metodo do tipo Produto com o nome buscar id onde ele tem uma pathvariable que e um parametro do endpoint do tipo int que ira receber um valor

        for (Produto produto : lista_de_produtos) {//aqui crei um for que ira percorrer minha lista ate achar um produto que tenha o id que foi informado no parmetro do enpoint e armazenar numa varivel temporaria
            if (produto.getId() == id) {//aqui criei um if que pega o conteudo da variavel temporaria e compara com o valor irformado e se ele for igual ao informafo ele exibe o produto que tem o mesmo id do informado

                return produto;//aqui ele exibe o produto que tem o mesmo id do informado

            }
        }
        return null;//aqui ele retorna nulo
    }

    @GetMapping("/Buscarid")//aqui criei um endpoint que chama o metodo mensagem
    public String mensagem() {//aqui crei o metodo menssagem que retorna uma string

        return "Você não informou o /'id' que deseja buscar!";//aqui retorno uma menssagem

    }
}

