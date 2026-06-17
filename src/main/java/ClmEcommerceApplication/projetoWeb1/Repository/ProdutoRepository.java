package ClmEcommerceApplication.projetoWeb1.Repository;

import ClmEcommerceApplication.projetoWeb1.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    List<Produto> findAll();

}
