package ClmEcommerceApplication.projetoWeb1.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "carrinho")
    private List<ItemCarrinho> itens;
}
