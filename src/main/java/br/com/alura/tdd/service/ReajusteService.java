package br.com.alura.tdd.service;

import br.com.alura.tdd.enums.DesempenhoEnum;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {
    public void aplicarReajuste(Funcionario empregado, DesempenhoEnum desempenho) {
        var salarioAtual = empregado.getSalario();
        var aliquota = calcularAliquota(desempenho);
        var salarioReajustado = salarioAtual.add(salarioAtual.multiply(aliquota)).setScale(2, RoundingMode.HALF_UP);

        empregado.reajustarSalario(salarioReajustado);
    }

    private BigDecimal calcularAliquota(DesempenhoEnum desempenho) {
        switch (desempenho){
            case A_DESEJAR:
                return new BigDecimal("0.03");
            case BOM:
                return new BigDecimal("0.15");
            case OTIMO:
                return new BigDecimal("0.20");
            default:
                return null;
        }
    }
}
