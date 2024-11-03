package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import jdk.jshell.execution.Util;
import lotto.utils.Utils;
import lotto.validator.Validator;

import java.util.List;

public class InputView {

    public static int inputLottoAmount(){

        int lottoAmount = Integer.parseInt(Console.readLine());

        try {
            Validator.validateLottoAmountIsPositiveAndDivisibleByThousand(lottoAmount);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        return lottoAmount;

    }

    public static List<Integer> inputLottoWinningNumbers(){

        return Utils.splitWinningNumber(Console.readLine());
    }

    public static Integer inputLottoBonusNumber(){

        return Integer.parseInt(Console.readLine());
    }

}
