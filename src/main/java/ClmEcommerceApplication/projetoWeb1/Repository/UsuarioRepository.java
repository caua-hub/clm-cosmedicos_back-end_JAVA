package ClmEcommerceApplication.projetoWeb1.Repository;

import ClmEcommerceApplication.projetoWeb1.Model.Produto;
import ClmEcommerceApplication.projetoWeb1.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
