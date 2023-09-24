package br.com.alura.tdd.enums;

import java.math.BigDecimal;

public enum DesempenhoEnum {
    A_DESEJAR {
        @Override
        public BigDecimal calcularAliquota() {
            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal calcularAliquota() {
            return new BigDecimal("0.15");
        }
    },
    OTIMO {
        @Override
        public BigDecimal calcularAliquota() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal calcularAliquota();
}
