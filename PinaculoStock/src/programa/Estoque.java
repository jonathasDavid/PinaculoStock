package programa;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> listaProdutos;

    // Construtor
    public Estoque() {
        listaProdutos = new ArrayList<>();
    }

    // Métodos
    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Estoque:");
        for (Produto produto : listaProdutos) {
            produto.exibirProdutos();
        }
    }
}

