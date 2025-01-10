package com.example;


import java.util.EnumMap;
import java.util.Map;

import com.example.Calculadora.Calculadora;
import com.example.Calculadora.CalculadoraAcre;
import com.example.Calculadora.CalculadoraAlagoas;
import com.example.Calculadora.CalculadoraAmapa;
import com.example.Calculadora.CalculadoraAmazonas;
import com.example.Calculadora.CalculadoraBahia;
import com.example.Calculadora.CalculadoraCeara;
import com.example.Calculadora.CalculadoraDistritoFederal;
import com.example.Calculadora.CalculadoraEspiritoSanto;
import com.example.Calculadora.CalculadoraGoias;
import com.example.Calculadora.CalculadoraMaranhao;
import com.example.Calculadora.CalculadoraMatoGrosso;
import com.example.Calculadora.CalculadoraMatoGrossoSul;
import com.example.Calculadora.CalculadoraMinasGerais;
import com.example.Calculadora.CalculadoraPara;
import com.example.Calculadora.CalculadoraParaiba;
import com.example.Calculadora.CalculadoraParana;
import com.example.Calculadora.CalculadoraPernambuco;
import com.example.Calculadora.CalculadoraPiaui;
import com.example.Calculadora.CalculadoraRioGrandeNorte;
import com.example.Calculadora.CalculadoraRioGrandeSul;
import com.example.Calculadora.CalculadoraRioJaneiro;
import com.example.Calculadora.CalculadoraRondonia;
import com.example.Calculadora.CalculadoraRoraima;
import com.example.Calculadora.CalculadoraSantaCatarina;
import com.example.Calculadora.CalculadoraSaoPaulo;
import com.example.Calculadora.CalculadoraSergipe;
import com.example.Calculadora.CalculadoraTocantins;
import com.example.Modelo.UnidadeFederacao;

public class CalculadoraFabrica {

            private static final Map<UnidadeFederacao, Calculadora> calculadoras = new EnumMap<>(UnidadeFederacao.class);

            static {
                calculadoras.put(UnidadeFederacao.AMAZONAS, new CalculadoraAmazonas());
                calculadoras.put(UnidadeFederacao.ALAGOAS, new CalculadoraAlagoas());
                calculadoras.put(UnidadeFederacao.ACRE, new CalculadoraAcre());
                calculadoras.put(UnidadeFederacao.AMAPA, new CalculadoraAmapa());
                calculadoras.put(UnidadeFederacao.BAHIA, new CalculadoraBahia());
                calculadoras.put(UnidadeFederacao.PARA, new CalculadoraPara());
                calculadoras.put(UnidadeFederacao.MATO_GROSSO, new CalculadoraMatoGrosso());
                calculadoras.put(UnidadeFederacao.MINAS_GERAIS, new CalculadoraMinasGerais());
                calculadoras.put(UnidadeFederacao.MATO_GROSSO_DO_SUL, new CalculadoraMatoGrossoSul());
                calculadoras.put(UnidadeFederacao.GOIAS, new CalculadoraGoias());
                calculadoras.put(UnidadeFederacao.MARANHAO, new CalculadoraMaranhao());
                calculadoras.put(UnidadeFederacao.RIO_GRANDE_DO_SUL, new CalculadoraRioGrandeSul());
                calculadoras.put(UnidadeFederacao.TOCANTINS, new CalculadoraTocantins());
                calculadoras.put(UnidadeFederacao.PIAUI, new CalculadoraPiaui());
                calculadoras.put(UnidadeFederacao.SAO_PAULO, new CalculadoraSaoPaulo());
                calculadoras.put(UnidadeFederacao.RONDONIA, new CalculadoraRondonia());
                calculadoras.put(UnidadeFederacao.RORAIMA, new CalculadoraRoraima());
                calculadoras.put(UnidadeFederacao.PARANA, new CalculadoraParana());
                calculadoras.put(UnidadeFederacao.CEARA, new CalculadoraCeara());
                calculadoras.put(UnidadeFederacao.PERNAMBUCO, new CalculadoraPernambuco());
                calculadoras.put(UnidadeFederacao.SANTA_CATARINA, new CalculadoraSantaCatarina());
                calculadoras.put(UnidadeFederacao.PARAIBA, new CalculadoraParaiba());
                calculadoras.put(UnidadeFederacao.RIO_GRANDE_DO_NORTE, new CalculadoraRioGrandeNorte());
                calculadoras.put(UnidadeFederacao.ESPIRITO_SANTO, new CalculadoraEspiritoSanto());
                calculadoras.put(UnidadeFederacao.RIO_DE_JANEIRO, new CalculadoraRioJaneiro());
                calculadoras.put(UnidadeFederacao.SERGIPE, new CalculadoraSergipe());
                calculadoras.put(UnidadeFederacao.DISTRITO_FEDERAL, new CalculadoraDistritoFederal());

            }

            public static Calculadora getCalculadora(UnidadeFederacao localProducao) {

                Calculadora calculadora = calculadoras.get(localProducao);

                if (calculadora == null) {
                    throw new IllegalArgumentException("Estado inválido!");
                }

                return calculadora;
            }   
            public static Map<UnidadeFederacao, Calculadora> getCalculadoras() {
                return calculadoras;
            }
            

}
