import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.example.Calculadora.Calculadora;
import com.example.Calculadora.CalculadoraAcre;
import com.example.Modelo.Producao;
import com.example.Modelo.Produto;
import com.example.Modelo.UnidadeFederacao;

public class CalculadoraAcreTest {
    @Test
    void testCalculoImpostoAcre() {
         Produto produto = new Produto("Produto Teste",new BigDecimal(30) ,new BigDecimal(26.6));
         Producao producao = new Producao(produto, 5, new BigDecimal("50.00"), UnidadeFederacao.ACRE);
         BigDecimal resultadoEsperado = new BigDecimal("22.50");
         Calculadora calculadora = new CalculadoraAcre();
         
         BigDecimal resultado = calculadora.calcularImposto(producao);
         
         assertEquals(resultadoEsperado, resultado);
    }
}
