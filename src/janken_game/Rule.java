package janken_game;

public class Rule {
	public int win;
	public int lose;
	public int draw;
	private final String WIN = "勝ち";
	private final String LOSE = "負け";
	private final String DRAW = "あいこ";

	// 自分の手と相手の手を表示する
	public void showHands(Hand myHand, Hand opponetHand) {
		System.out.print("私の手は、" + myHand.handName() + "!");
		System.out.print("相手の手は、" + opponetHand.handName() + "!");
		System.out.println("");
	}

	// あいこの判定
	public boolean isDraw(Hand myHand, Hand opponetHand) {
		if (myHand.hand() == opponetHand.hand()) {
			System.out.println("あいこ！");
			draw++;
			return true;
		}
		return false;
	}

	// 勝敗結果を表示する
	public void showResult(Hand myHand, Hand opponetHand) {
		String result;
		// 1.グー 2.チョキ 3.パー
		// 1 < 2 < 3
		if ((myHand.hand() < opponetHand.hand()) || (myHand.hand() == 3 && opponetHand.hand() == 1)) {
			result = WIN;
			win++;
		} else if (myHand.hand() == opponetHand.hand()) {
			result = DRAW;
			draw++;
		} else {
			result = LOSE;
			lose++;
		}

		if (result.equals(DRAW)) {
			System.out.println(result + "です。");
		} else {
			System.out.println("あなたの" + result + "です。");
		}
	}

}
