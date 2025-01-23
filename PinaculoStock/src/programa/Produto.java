package programa;

import java.time.LocalDate;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private Categoria categoria;
    private LocalDate dataRegistro;

    // Construtores
    public Produto(int id, String nome, int quantidade, double preco, Categoria categoria, LocalDate dataRegistro) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
        this.dataRegistro = dataRegistro;
    }
    
    public Produto(int id, String nome, int quantidade, double preco, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Sobrecarga do construtor
    public Produto(int id, String nome, double preco, Categoria categoria) {
        this(id, nome, 0, preco, categoria, LocalDate.now());
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
    	if(this.isValidNome(nome) && this.isValidTamanho(nome, 0, 100) )
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

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    // Métodos para adicionar ao estoque
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    // Sobrecarga do método adicionarEstoque
    public void adicionarEstoque(int quantidade, String mensagem) {
        this.quantidade += quantidade;
        System.out.println(mensagem);
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
        System.out.println("Produto: " + nome + ", Categoria: " + categoria + ", Quantidade: " + quantidade + ", Preço: R$" + preco + ", Data de Registro: " + dataRegistro);
    }
    
    
 

	// Valida se o nome de usu�rio n�o est� vazio e n�o cont�m espa�os em branco
    public boolean isValidNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && !nome.contains(" ");
    }


    // Valida se o nome de usu�rio possui um tamanho m�nimo e m�ximo
    public boolean isValidTamanho(String nome, int minLength, int maxLength) {
        return nome.length() >= minLength && nome.length() <= maxLength;
    }

	
    public boolean isValidTelefone(String telefone) {
        return telefone != null && telefone.matches("\\(\\d{2}\\) \\d{5}-\\d{4}");
    }
    
    public boolean isValidRua(String rua) {
        return rua != null && !rua.trim().isEmpty();
    }


    public boolean isValidNumero(String numero) {
        return numero != null && !numero.trim().isEmpty();
    }


    public boolean isValidCidade(String cidade) {
        return cidade != null && !cidade.trim().isEmpty();
    }


    public boolean isValidCEP(String cep) {
        return cep != null && cep.matches("\\d{5}-\\d{3}");
    }

    public boolean isValidEndereco(String rua, String numero, String cidade, String cep) {
        return isValidRua(rua) && isValidNumero(numero) && isValidCidade(cidade) && isValidCEP(cep);
    }
}