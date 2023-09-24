package br.com.alura.tdd.service.employeeFactory;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeFactory {
    public static Funcionario buildAnEmployee(BigDecimal wage) {
        return new Funcionario(
                "Employee",
                LocalDate.now(),
                wage
        );
    }

    public static Funcionario buildAnEmployee(String name) {
        return new Funcionario(
                "Employee",
                LocalDate.now(),
                new BigDecimal("1000.0")
        );
    }

    public static Funcionario buildAnEmployeeReceivingWage(String name, LocalDate date, BigDecimal wage) {
        return new Funcionario(
                name,
                date,
                wage
        );
    }
}
