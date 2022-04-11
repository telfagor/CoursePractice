package credit.card.project.out;

import credit.card.project.card.CreditCard;
import credit.card.project.card.CreditCardValidator;

public class Out {
    private final CreditCardValidator validator = new CreditCardValidator();
    private CreditCard[] cards;

    public void printCards(CreditCard[] cards) {
        this.cards = cards;
        for (CreditCard card : cards) {
            System.out.print(card + " ");
            System.out.println(validator.isValid(card));
        }
        System.out.println();
    }
}
