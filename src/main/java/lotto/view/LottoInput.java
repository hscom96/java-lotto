package lotto.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import lotto.domain.Lotto;
import lotto.domain.LottoNumber;

public class LottoInput {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String INPUT_BUYPRICE_MESSAGE = "구입금액을 입력해주세요";
    private static final String INPUT_WINNINTNUMBER_MESSAGE = "지난 주 당첨 번호를 입력해주세요";
    private static final String INPUT_BONUSBALL_MESSAGE = "보너스 볼을 입력해 주세요.";
    private static final String COMMA = ",";

    private LottoInput() {
    }

    public static int inputPrice() {
        System.out.println(INPUT_BUYPRICE_MESSAGE);
        return SCANNER.nextInt();
    }

    public static Lotto inputWinningNumber() {
        System.out.println(INPUT_WINNINTNUMBER_MESSAGE);
        String input = SCANNER.next();
        return Lotto.of(Arrays.stream(input.split(COMMA))
            .mapToInt(Integer::new)
            .mapToObj(LottoNumber::from)
            .collect(Collectors.toList()));
    }

    public static LottoNumber inputBonusBall() {
        System.out.println(INPUT_BONUSBALL_MESSAGE);
        int bonusBall = SCANNER.nextInt();
        return LottoNumber.from(bonusBall);
    }
}
