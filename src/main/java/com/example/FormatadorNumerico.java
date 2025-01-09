package com.example;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class FormatadorNumerico {
    public static String formatar(BigDecimal valor) {
        return NumberFormat.getCurrencyInstance().format(valor);
    }
}
