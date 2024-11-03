package lotto.validator;

import java.util.List;

public class Validator {

    public static void validateLottoAmountIsPositiveAndDivisibleByThousand(int lottoAmount){

        if (lottoAmount <= 0 || lottoAmount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 로또 금액은 1000원 단위로 입력해 주세요.");
        }

    }

    public static void validateLottoNumberInRangeOneToFortyFive(List<Integer> lottoWinningNumbers){

        if (!lottoWinningNumbers.stream().allMatch(number -> number >= 1 && number <= 45)) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호를 1~45 사이로 입력해 주세요.");
        }
    }
}
