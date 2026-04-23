package classes.classes;

public class Produto {
    private String nome;
    private Double peso;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double peso, Double preco, Integer quantidade){
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getSubtotal(){
        return preco * quantidade;
    }

    public Double getPesoTotal(){
        return peso * quantidade;
    }
}