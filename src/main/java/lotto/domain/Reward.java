package lotto.domain;

public class Reward {

    private final double value;

    public Reward(Rankings rankings, Money buyMoney) {
        this.value = rankings.countRewardRate(buyMoney);
    }

    public double getValue() {
        return value;
    }
}
