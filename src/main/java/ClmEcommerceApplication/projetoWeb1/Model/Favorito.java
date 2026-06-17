package ClmEcommerceApplication.projetoWeb1.Model;

import jakarta.persistence.*;

import java.util.List;

public class Favorito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Usuario usuario;

    private List<Produto> produtos;
}
