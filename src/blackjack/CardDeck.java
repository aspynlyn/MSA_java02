package blackjack;

import java.util.Arrays;
import java.util.Map;

public class CardDeck {
	private Card[] cards = new Card[52];
	private int selectedIdx = 0;

	public String[] pattern = {"♠", "♥", "◆", "♣"};
	public String[] denomination = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


	// 기본생성자 작성
	public CardDeck(){
		// 모든 방에 모두 다른 주소값을 넣는다(각 방은 Card객체의 주소값만 저장 가능
		// 각 카드가 가지고 있는 값은 모두 달라야함
		// 패턴은 Spade, Heart, Diamond, Clover
		// 디노미네이션 A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
		int i = 0;
		for(String pat : pattern){
			for(String den : denomination){
				cards[i++] = new Card(pat, den);
			}
		}
		shuffle();



//		int index = 0;
//		for(int j = 0; j<pattern.length; j++) {
//			for (int k = 1; k < 13; k++) {
//				String denomi = switch (k) {
//					case 1 -> "A";
//					case 11 -> "J";
//					case 12 -> "Q";
//					case 13 -> "K";
//					default -> String.valueOf(k);
//				};
//				cards[index++] = new Card(pattern[i], denomi);
//			}
//		}
	}
	public void printAllCards(){
		for(Card card : cards){
//	  System.out.printf("%s%s\n", card.getPattern(), card.getDenomination());
			System.out.println(card);
		}
	}
	private void shuffle(){
		for(int i=0; i< cards.length; i++){
			int ran = (int)(Math.random() * cards.length);
			Card temp = cards[i];
			cards[i] = cards[ran];
			cards[ran] = temp;

		}
	}

	public Card getCard(){
		if(selectedIdx == cards.length){
			return null;
		}
		Card c = cards[selectedIdx];
		cards[selectedIdx++] = null;
		return c;
	}
}
