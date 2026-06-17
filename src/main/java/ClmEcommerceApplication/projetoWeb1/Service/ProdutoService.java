package ClmEcommerceApplication.projetoWeb1.Service;

import ClmEcommerceApplication.projetoWeb1.Model.Produto;
import ClmEcommerceApplication.projetoWeb1.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;



    public void save(Produto produto){
        produtoRepository.save(produto);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public List<String> listarProdutos(){

        List<Produto> produtos = produtoRepository.findAll();

        return JsonService.objetosParaJson(produtos);
    }
}
