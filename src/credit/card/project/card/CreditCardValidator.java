package credit.card.project.card;

import java.time.LocalDateTime;

public class CreditCardValidator {
    private static final LocalDateTime DATE = LocalDateTime.now();
    private static final int CURRENT_YEAR = DATE.getYear();
    private static final int CURRENT_MONTH = DATE.getMonthValue();

    public boolean isValid(CreditCard creditCard) {
        return creditCard.getNumber() > 0 && creditCard.getYear() >= CURRENT_YEAR && creditCard.getMonth() >= CURRENT_MONTH;
    }
}
