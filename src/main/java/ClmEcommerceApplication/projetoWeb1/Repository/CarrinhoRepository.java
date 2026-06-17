package ClmEcommerceApplication.projetoWeb1.Repository;

import ClmEcommerceApplication.projetoWeb1.Model.Carrinho;
import ClmEcommerceApplication.projetoWeb1.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<Carrinho,Integer> {
}
