package programa;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private Categoria categoria;

   
    public Produto(int id, String nome, int quantidade, double preco, Categoria categoria) {
        setId(id);
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
        setCategoria(categoria);
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Métodos específicos
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public double calcularValorTotal() {
        return quantidade * preco;
    }

    public void exibirProdutos() {
        System.out.println("Produto: " + nome + ", Categoria: " + categoria + ", Quantidade: " + quantidade + ", Preço: R$" + preco);
    }
}