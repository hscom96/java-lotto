package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import lotto.domain.LottoNumber;
import lotto.domain.Lotto;
import lotto.domain.LottoAutoGenerator;
import lotto.domain.Lottos;
import org.junit.jupiter.api.Test;

class LottoAutoGeneratorTest {

    @Test
    void 로또번호_랜덤_단일_생성(){
        LottoAutoGenerator lottoAutoGenerator = new LottoAutoGenerator();
        Lotto lottoNum = lottoAutoGenerator.generateLotto();

        assertThat(lottoNum.size()).isEqualTo(6);
        Set<LottoNumber> duplicate = new HashSet<>(lottoNum.getLottoNumbers());
        assertThat(lottoNum.size()).isEqualTo(duplicate.size());
    }

    @Test
    void 로또번호_랜덤_다수_생성(){
        int size = 6;
        LottoAutoGenerator lottoAutoGenerator = new LottoAutoGenerator();
        Lottos lottoNumbers = lottoAutoGenerator.generateLottos(size);

        assertThat(lottoNumbers.size()).isEqualTo(size);
    }
}
