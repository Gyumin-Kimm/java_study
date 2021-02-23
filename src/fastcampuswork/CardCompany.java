package fastcampuswork;

public class CardCompany {

	private static CardCompany instance = new CardCompany();
	private static int cardSerialNum = 10000;

	private CardCompany() {
	}

	public static CardCompany getInstance() {
		if (instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		 card.setCardNum(++cardSerialNum);
		return card;
	}
	
}
