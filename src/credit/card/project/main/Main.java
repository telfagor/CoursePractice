package credit.card.project.main;

import credit.card.project.card.CreditCard;
import credit.card.project.card.CreditCardCreator;
import credit.card.project.card.CreditCardValidator;
import credit.card.project.holder.Holder;
import credit.card.project.out.Out;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        int year = date.getYear();
        int month = date.getMonthValue();

        //Creez carduri Victoriabank
        long cardBankNumberVictoriabank = 4111_0000_000_0000L;
        Holder victoriaBank = new Holder(1L, "VictoriaBank", cardBankNumberVictoriabank);
        CreditCardCreator creatorVictoriaBank = new CreditCardCreator(victoriaBank);
        CreditCard creditCardVictoriabank = creatorVictoriaBank.createCard(cardBankNumberVictoriabank, year, month);
        CreditCardValidator validator = new CreditCardValidator();
        System.out.println(validator.isValid(creditCardVictoriabank));

        //Creez carduri Moldindconbank
        long cardBankNumberMoldindconbank = 5111_0000_0000_0000L;
        Holder moldindconbank = new Holder(2L, "Moldindconbank", cardBankNumberMoldindconbank);
        CreditCardCreator creatorMoldindconbank = new CreditCardCreator(moldindconbank);
        CreditCard creditCardMoldindconbank = creatorMoldindconbank.createCard(cardBankNumberMoldindconbank, year, month);
        System.out.println(validator.isValid(creditCardMoldindconbank));

        CreditCard[] victoriabankCreditCards = creatorVictoriaBank.createCreditCards(10, cardBankNumberVictoriabank, year, month);
        CreditCard[] moldidcombankCreditCards = creatorMoldindconbank.createCreditCards(20, cardBankNumberMoldindconbank, year, month);

        Out out = new Out();
        out.printCards(moldidcombankCreditCards);
        out.printCards(victoriabankCreditCards);
    }
}

