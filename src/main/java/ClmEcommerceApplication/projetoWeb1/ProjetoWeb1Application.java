package ClmEcommerceApplication.projetoWeb1;

import ClmEcommerceApplication.projetoWeb1.Model.Categoria;
import ClmEcommerceApplication.projetoWeb1.Model.Produto;
import ClmEcommerceApplication.projetoWeb1.Model.TipoProduto;
import ClmEcommerceApplication.projetoWeb1.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProjetoWeb1Application implements CommandLineRunner {

    @Autowired
    private ProdutoService produtoService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoWeb1Application.class, args);
	}

    @Override
    public void run(String... args) {

        System.out.println("Aplicação iniciada!");

        Produto produto1 = new Produto(
                "Batom Avon",
                "Batom vermelho ultra power",
                20.00,
                3,
                "https://acdn-us.mitiendanube.com/stores/004/297/279/products/avon-ultra-color-batom-brilhante-vermelho-glitz-c2a630463cc6e9662417539175257506-1024-1024.webp",
                Categoria.MAQUIAGEM,
                TipoProduto.BATOM
        );



        produtoService.save(produto1);

        List<String> lista = produtoService.listarProdutos();

        System.out.println(lista);

    }
}
