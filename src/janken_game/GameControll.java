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
		System.out.print("あなたは" + rule.win + "回勝って");
		System.out.print(rule.draw + "回あいこで");
		System.out.println(rule.lose + "回負けました。");
	}

	// ゲーム終了
	public void end() {
		System.out.println("ゲーム終了！");

	}

}
