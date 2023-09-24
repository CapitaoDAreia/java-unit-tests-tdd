package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.employeeFactory.EmployeeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class BonusServiceTest {

    @Test
    void shouldApplyBonusIfWageIsMinorThanTenThousand() {
        //given
        Funcionario employee = EmployeeFactory.buildAnEmployee(new BigDecimal("9999.0"));
        BonusService bonusService = new BonusService();
        BigDecimal expectedBonus = new BigDecimal("999.90");

        //when
        var result = bonusService.calcularBonus(employee);

        //then
        Assertions.assertEquals(expectedBonus, result);
    }

    @Test
    void shouldNotApplyBonusIfWageEqualsTenThousand() {
        //given
        Funcionario employee = EmployeeFactory.buildAnEmployee(new BigDecimal("10000.0"));
        BonusService bonusService = new BonusService();
        BigDecimal expectedBonus = new BigDecimal("0");

        //when
        var result = bonusService.calcularBonus(employee);

        //then
        Assertions.assertEquals(expectedBonus, result);
    }

    @Test
    void shouldNotApplyBonusIfWageIsMajorThanTenThousand() {
        //given
        Funcionario employee = EmployeeFactory.buildAnEmployee(new BigDecimal("10001.0"));
        BonusService bonusService = new BonusService();
        BigDecimal expectedBonus = new BigDecimal("0");

        //when
        var result = bonusService.calcularBonus(employee);

        //then
        Assertions.assertEquals(expectedBonus, result);
    }

}