package blackjack;

import java.util.List;

public class Rule {

	public static void getWinner(Dealer dealer, Gamer gamer){
		// 경우의 수 6가지
		// 1. 둘 다 총 점수가 21점 초과 -> 무승부
		// 2. 둘 다 총 점수가 21점 이하지만 점수가 같음 -> 무승부
		// 3. 딜러의 총 점수가 21점 초과, 게이머의 총 점수가 21점 이하 -> 게이머 승
		// 4. 둘 다 총 점수가 21점 이하지만 게이머의 총 점수가 21점에 가까움 -> 게이머 승
		// 5. 게이머의 총 점수가 21점 초과, 딜러의 총 점수가 21점 이사 -> 딜러 승
		// 6. 둘 다 총 점수가 21점 이하지만 딜러의 총 점수가 21점에 가까움 -> 딜러 승
		int ds = Rule.getScore(dealer.openCards());
		int gs = Rule.getScore(gamer.openCards());
		System.out.println("딜러 점수: " + ds + ", 게이머 점수: " + gs);

		if (ds > 21 && gs > 21) {
			System.out.println("무승부");
		}
		else if (ds <= 21 && gs <= 21 && ds == gs) {
			System.out.println("무승부");
		}
		else if (ds > 21 && gs <= 21) {
			System.out.println("게이머 승");
		}
		else if (gs > 21 && ds <= 21) {
			System.out.println("딜러 승");
		}
		else if (ds <= 21 && gs <= 21) {
			if (ds > gs) {
				System.out.println("딜러 승");
			} else {
				System.out.println("게이머 승");
			}
		}
	}

	public static int getScore(List<Card> cards){
		int sum = 0;
		for(Card card : cards){
			int score = convertDenominationToScore(card.getDenomination());
			sum += score;
		}
		return sum;
	}

	private static int convertDenominationToScore(String denomination){
		return switch (denomination) {
			case "A" -> 1;
			case "J","Q","K" -> 10;
			default -> Integer.parseInt(denomination);
		};
	}
}
