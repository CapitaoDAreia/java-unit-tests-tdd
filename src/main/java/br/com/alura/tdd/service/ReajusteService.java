package br.com.alura.tdd.service;

import br.com.alura.tdd.enums.DesempenhoEnum;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.RoundingMode;

public class ReajusteService {
    public void aplicarReajuste(Funcionario empregado, DesempenhoEnum desempenho) {
        var salarioAtual = empregado.getSalario();
        var aliquota = desempenho.calcularAliquota();
        var salarioReajustado = salarioAtual.add(salarioAtual.multiply(aliquota)).setScale(2, RoundingMode.HALF_UP);

        empregado.reajustarSalario(salarioReajustado);
    }
}
