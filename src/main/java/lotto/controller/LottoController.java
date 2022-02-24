package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.LottoGenerator;
import lotto.domain.LottoNumber;
import lotto.domain.Lottos;
import lotto.domain.Money;
import lotto.domain.Rankings;
import lotto.domain.WinningLotto;
import lotto.view.LottoInput;
import lotto.view.LottoOutput;

public class LottoController {

    private final LottoGenerator lottoGenerator;

    public LottoController(LottoGenerator lottoAutoGenerator) {
        this.lottoGenerator = lottoAutoGenerator;
    }

    public void run() {
        Money buyMoney = new Money(LottoInput.inputPrice());
        int manualBuyCount = LottoInput.inputManualBuyCount();

        Lottos lottos = createLottos(buyMoney, manualBuyCount);

        LottoOutput.printBuySum(buyMoney.calculateAutoBuyCount(manualBuyCount), manualBuyCount);
        LottoOutput.printLottoNumber(lottos);

        WinningLotto winningLotto = createWinningLotto();

        Rankings rankings = Rankings.of(lottos, winningLotto);

        LottoOutput.printLottoResult(rankings, buyMoney);
    }

    private Lottos createLottos(Money buyMoney, int manualBuyCount) {
        Lottos lottos = LottoInput.inputManualLottos(manualBuyCount);
        int autoBuyCount = buyMoney.calculateAutoBuyCount(manualBuyCount);
        lottos.add(lottoGenerator.generateLottos(autoBuyCount));
        return lottos;
    }

    private WinningLotto createWinningLotto() {
        Lotto lastWeekLottoNumber = LottoInput.inputWinningNumber();
        LottoNumber bonusNumber = LottoInput.inputBonusBall();
        return new WinningLotto(lastWeekLottoNumber, bonusNumber);
    }
}
