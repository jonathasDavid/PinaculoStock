package programa;

public class Fornecedor {
    private int id;
    private String nome;
    private String contato;

    // Construtor
    public Fornecedor(int id, String nome, String contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    // Método para fornecer produto
    public void fornecerProduto(Produto produto, int quantidade) {
        produto.adicionarEstoque(quantidade);
        System.out.println("Fornecedor " + nome + " forneceu " + quantidade + " unidades do produto " + produto.getNome());
    }
}