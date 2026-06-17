package ClmEcommerceApplication.projetoWeb1.Model;

import jakarta.persistence.*;

@Entity
public class ItemCarrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Carrinho carrinho;

    @ManyToOne
    private Produto produto;

    private Integer quantidade;
}
