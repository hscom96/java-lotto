package lotto.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoNumbers {

    private static final int LOTTO_SIZE = 6;

    private final List<LottoNumber> numbers;

    public LottoNumbers(final List<Integer> numbers) {
        validateNumbersSize(numbers);
        validateDuplicateNumber(numbers);

        this.numbers = numbers.stream()
            .map(LottoNumber::new)
            .collect(Collectors.toList());
    }

    private void validateDuplicateNumber(final List<Integer> numbers) {
        HashSet<Integer> lottoDuplicate = new HashSet<>(numbers);
        if (numbers.size() != lottoDuplicate.size()) {
            throw new IllegalArgumentException("복권에 중복된 숫자가 존재합니다.");
        }
    }

    private void validateNumbersSize(final List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("복권의 숫자 개수가 유효하지 않습니다.");
        }
    }

    public int size() {
        return numbers.size();
    }

    public boolean contains(LottoNumber lottoNumber){
        return numbers.contains(lottoNumber);
    }

    public List<LottoNumber> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LottoNumbers)) {
            return false;
        }
        List<LottoNumber> that = ((LottoNumbers) o).getNumbers();
        Set<LottoNumber> duplicate = new HashSet<>(numbers);
        duplicate.addAll(that);
        return duplicate.size() == numbers.size();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (LottoNumber lottoNumber : numbers) {
            hash += lottoNumber.getLottoNum() * 31;
        }
        return hash;
    }
}
