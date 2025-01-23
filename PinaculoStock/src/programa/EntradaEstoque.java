package programa;

import java.time.LocalDate;

public class EntradaEstoque {
    private int id;
    private Produto produto;
    private int quantidade;
    private LocalDate data;
    private Fornecedor fornecedor;

    // Construtor
    public EntradaEstoque(int id, Produto produto, int quantidade, LocalDate data, Fornecedor fornecedor) {
        setId(id);
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
        this.fornecedor = fornecedor;
    }
    
    public void setId(int id) {
    	this.id = id;
    }

    // Método para registrar entrada
    public void registrarEntrada() {
        produto.adicionarEstoque(quantidade);
        System.out.println("Entrada registrada: " + quantidade + " unidades do produto " + produto.getNome());
    }
}

