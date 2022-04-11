package credit.card.project.card;

import credit.card.project.holder.Holder;

//O clasa functionala
//Departamentul care va crea carduri
public class CreditCardCreator {
    private final Holder bank;

    public CreditCardCreator(Holder holder) {
        bank = holder;
    }

    public CreditCard createCard(long number, int year, int month) {
        return new CreditCard(number, year, month, bank);
    }

    public CreditCard[] createCreditCards(int size, long number, int year, int month) {
        CreditCard[] creditCards = new CreditCard[size];
        for (int i = 0; i < creditCards.length; i++) {
            creditCards[i] = createCard(number + i, year, month);
        }
        return creditCards;
    }
}
