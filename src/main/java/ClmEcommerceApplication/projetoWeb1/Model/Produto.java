package ClmEcommerceApplication.projetoWeb1.Model;

import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private Double preco;

    private Integer estoque;



    private String imagem;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Enumerated(EnumType.STRING)
    private TipoProduto tipoProduto;

    public Produto(String nome, String descricao, Double preco, Integer estoque, String imagem, Categoria categoria, TipoProduto tipoProduto) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.imagem = imagem;
        this.categoria = categoria;
        this.tipoProduto = tipoProduto;
    }

    public Produto() {
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }
}









