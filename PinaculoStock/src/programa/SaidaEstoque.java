package programa;

import java.time.LocalDate;

public class SaidaEstoque extends MovimentacaoEstoque {
    // Construtor
    public SaidaEstoque(int id, Produto produto, int quantidade, LocalDate data) {
        super(id, produto, quantidade, data);
    }

    @Override
    public void registrar() {
        produto.removerEstoque(quantidade);
        System.out.println("Saída registrada: " + quantidade + " unidades do produto " + produto.getNome());
    }
}	

