package programa;

import java.time.LocalDate;

public class SaidaEstoque {
    private int id;
    private Produto produto;
    private int quantidade;
    private LocalDate data;

    // Construtor
    public SaidaEstoque(int id, Produto produto, int quantidade, LocalDate data) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
    }

    // Método para registrar saída
    public void registrarSaida() {
        produto.removerEstoque(quantidade);
        System.out.println("Saída registrada: " + quantidade + " unidades do produto " + produto.getNome());
    }
}

