package br.com.alura.tdd.service;

import br.com.alura.tdd.enums.DesempenhoEnum;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.employeeFactory.EmployeeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
    O sistema deve permitir que os funcionários recebam um reajuste salarial
    anual baseado em seu desempenho, obecedenco às seguintes regras:

    Se o desempenho foi "A desejar", reajuste será de apenas 3% do salário
    Se o desempenho foi "Bom", reajuste será de 15% do salário
    Se o desempenho foi "Ótimo", reajuste será de 20% do salário
*/

public class ReajusteServiceTest {
    @Test
    public void readjustmentShouldBeThreePerCentWhenPerformanceIsDesired(){
        //given
        Funcionario empregado = EmployeeFactory.buildAnEmployee(new BigDecimal("1000.0"));
        ReajusteService reajusteService = new ReajusteService();
        BigDecimal resultadoEsperado = new BigDecimal("1030.00");
        var desempenho = DesempenhoEnum.A_DESEJAR;

        //when
        reajusteService.aplicarReajuste(empregado, desempenho);

        //then
        Assertions.assertEquals(empregado.getSalario(), resultadoEsperado);
    }

    @Test
    public void readjustmentShouldBeFifteenPerCentWhenPerformanceIsGood(){

    }

    @Test
    public void readjustmentShouldBeTwentyPerCentWhenPerformanceIsExcellent(){

    }
}
