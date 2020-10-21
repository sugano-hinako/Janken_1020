package janken_game;

public class GameControll {
	private Hand myHand;;
	private Hand opponentHand;
	private Rule rule;

	// コンストラクタ
	public GameControll() {
		this.rule = new Rule();
		this.myHand = new Hand();
		this.opponentHand = new Hand();
	}

	// ゲームスタート
	public void start() {
		System.out.print("3回勝負！");
		System.out.println("じゃんけんスタート！");
	}

	public void game() {
		myHand.setHand();
		opponentHand.setRandomHand();
		rule.showHands(myHand, opponentHand);
		rule.showResult(myHand, opponentHand);
	}

	public void judge() {
		System.out.println("☆最終結果☆");
		System.out.println("----------------");
		System.out.println("勝ち: " + rule.win + "回");
		System.out.println("負け: " + rule.lose + "回");
		System.out.println("あいこ: " + rule.draw + "回");
	}

	// ゲーム終了
	public void end() {
		System.out.println("ゲーム終了！");

	}

}
