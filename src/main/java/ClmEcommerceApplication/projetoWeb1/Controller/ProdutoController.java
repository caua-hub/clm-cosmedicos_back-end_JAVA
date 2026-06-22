package ClmEcommerceApplication.projetoWeb1.Controller;

import ClmEcommerceApplication.projetoWeb1.Model.Produto;
import ClmEcommerceApplication.projetoWeb1.Repository.ProdutoRepository;
import ClmEcommerceApplication.projetoWeb1.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos.html")
    public List<String> listar() {
        return produtoService.listarProdutos();
    }
}
