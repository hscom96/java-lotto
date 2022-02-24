package lotto.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {

    private static final String MONEY_NEGATIVE = "금액은 음수가 될 수 없습니다.";
    private static final int LOTTO_PRICE = 1000;

    private final int value;

    public Money(int value) {
        validatePositive(value);
        this.value = value;
    }

    private void validatePositive(int value) {
        if (value < 0) {
            throw new IllegalArgumentException(MONEY_NEGATIVE);
        }
    }

    public int countBuySum() {
        return BigDecimal.valueOf(value)
            .divide(BigDecimal.valueOf(LOTTO_PRICE), RoundingMode.DOWN).intValue();
    }

    public int calculateAutoBuyCount(int manualBuyCount) {
        return countBuySum() - manualBuyCount;
    }

    public int getValue() {
        return value;
    }
}
