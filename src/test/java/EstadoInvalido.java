import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.CalculadoraIterador;
import com.example.Modelo.Producao;
import com.example.Modelo.Produto;

public class EstadoInvalido {
    @Test
   void testEstadoInvalido() {
       Produto produto = new Produto("Produto Teste",new BigDecimal(30) ,new BigDecimal(26.6));
       Producao producao = new Producao(produto, 5, new BigDecimal("50.00"), null);

        CalculadoraIterador calculadoraIterador = new CalculadoraIterador();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        calculadoraIterador.processarProducao(List.of(producao));
    });
       assertEquals("Estado inválido!", exception.getMessage());
   }
}
