import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.example.LeitorArquivoJson;
import com.example.Modelo.Producao;

public class LeitorTeste {
    @Test
    public void testarLeitura() {
        ArrayList<Producao> producao = LeitorArquivoJson.lerArquivoProducao();

        assertNotNull(producao, "A lista de produção não deve ser nula.");
        assertFalse(producao.isEmpty(), "A lista de produção não deve ser vazia.");

        for (Producao p : producao) {
        
            assertNotNull(p.getProduto(), "O produto não deve ser nulo.");
            assertNotNull(p.getProduto().getNome(), "O nome do produto não deve ser nulo.");
            assertTrue(p.getQuantidade() > 0, "A quantidade deve ser maior que zero.");
            assertTrue(p.getValorUnitario().compareTo(BigDecimal.ZERO) > 0, "O valor unitário deve ser maior que zero.");
            assertNotNull(p.getlocalProducao(), "A unidade federativa não deve ser nula.");
        }
    }
}
