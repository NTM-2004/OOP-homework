package ex2_order;

import java.util.Currency;

public class OrderLine {
    private Currency value;

    public Currency getValue() {
        return value;
    }

    public OrderLine(Currency value) {
        this.value = value;
    }
}