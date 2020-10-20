package janken_game;

public class GameControll {
	private Hand myHand;;
    private Hand opponentHand;
    private Rule rule;

    //コンストラクタ
    public GameControll() {
    	this.rule = new Rule();
        this.myHand = new Hand();
        this.opponentHand = new Hand();
    }

    //ゲームスタート
    public void start() {
    	System.out.println("じゃんけんスタート！");

    	do {
            myHand.setHand();
            opponentHand.setRandomHand();
            rule.showHands(myHand, opponentHand);
        }while(rule.isDraw(myHand, opponentHand));

        rule.showResult(myHand, opponentHand);
    }

    //ゲーム終了
    public void end() {
        System.out.println("ゲーム終了！");

    }

}
