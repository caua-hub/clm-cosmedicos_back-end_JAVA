package ClmEcommerceApplication.projetoWeb1.Service;

import org.springframework.boot.json.JsonParseException;
import tools.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class JsonService {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> String objetoParaJson(T objeto) {
        try {
            return mapper.writeValueAsString(objeto);
        } catch (JsonParseException e) {
            throw new RuntimeException("Erro ao converter objeto para JSON", e);
        }
    }

    public static <T> List<String> objetosParaJson(List<T> objeto) {
        List<String> lista = new ArrayList<>();
        for (Object o : objeto) {
            System.out.println(objetoParaJson(o));
            lista.add(objetoParaJson(o));
        }

        return lista;
    }
}
