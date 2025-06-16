package blackjack;

public class BlackJack {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();

//		cd.printAllCards();
//		Card c = cd.getCard();
//
//		System.out.println(c);
//		System.out.println(cd.getCard());
//		System.out.println(cd.getCard());
//		System.out.println("---------------");
//		cd.printAllCards();

		for(int i = 0; i < 3; i++){
			gamer.receiveCard(cd.getCard());
			dealer.receiveCard(cd.getCard());
		}

		System.out.println("--------게이머카드--------");
		gamer.showCards();

		System.out.println("--------딜러카드--------");
		dealer.showCards();

		if(dealer.needMoreCard()){
			dealer.receiveCard(cd.getCard());
			System.out.println("딜러 카드 득템!");
		}

		System.out.println("최종결과");
		Rule.getWinner(dealer, gamer);

	}
}
