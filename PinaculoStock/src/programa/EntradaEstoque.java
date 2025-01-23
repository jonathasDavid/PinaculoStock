package programa;

import java.time.LocalDate;

public class EntradaEstoque extends MovimentacaoEstoque {
    private Fornecedor fornecedor;

    // Construtor
    public EntradaEstoque(int id, Produto produto, int quantidade, LocalDate data, Fornecedor fornecedor) {
        super(id, produto, quantidade, data);
        setFornecedor(fornecedor); 
    }

    @Override
    public void registrar() {
        produto.adicionarEstoque(quantidade);
        System.out.println("Entrada registrada: " + quantidade + " unidades do produto " + produto.getNome());
    }

    // Getter e Setter do fornecedor
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}

