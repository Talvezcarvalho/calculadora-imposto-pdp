import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.example.Calculadora;
import com.example.Modelo.Producao;
import com.example.Modelo.Produto;
import com.example.Modelo.UnidadeFederacao;

public class CalculadoraTeste {

    private final Calculadora calculadora = new Calculadora();

    @Test

    void testCalculoImpostoAmazonas() {

        Produto produto = new Produto("Produto Teste",new BigDecimal(10) ,new BigDecimal(5));
        Producao producao = new Producao(produto, 10, new BigDecimal("100.00"), UnidadeFederacao.AMAZONAS);
        BigDecimal resultadoEsperado = new BigDecimal("100.11");

        BigDecimal resultado = calculadora.calcularImposto(producao);
    
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void testCalculoImpostoSaoPaulo() {
        Produto produto = new Produto("Produto Teste",new BigDecimal(30) ,new BigDecimal(26.6));
        Producao producao = new Producao(produto, 5, new BigDecimal("50.00"), UnidadeFederacao.SAO_PAULO);
        BigDecimal resultadoEsperado = new BigDecimal("10.77");

        BigDecimal resultado = calculadora.calcularImposto(producao);

        assertEquals(resultadoEsperado, resultado);
    }
    
     @Test
    void testEstadoInvalido() {
        Produto produto = new Produto("Produto Teste",new BigDecimal(30) ,new BigDecimal(26.6));
        Producao producao = new Producao(produto, 5, new BigDecimal("50.00"), null);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculadora.calcularImposto(producao));

        assertEquals("Estado inválido!", exception.getMessage());
    }
}   


