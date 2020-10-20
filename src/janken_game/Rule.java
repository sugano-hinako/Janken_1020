package janken_game;

public class Rule {
	//自分の手と相手の手を表示する
	public void showHands(Hand myHand, Hand opponetHand) {
		System.out.print("私の手は、"+ myHand.handName() +"!");
        System.out.print("相手の手は、"+ opponetHand.handName() +"!");
        System.out.println("");
	}

	//あいこの判定
	public boolean isDraw(Hand myHand, Hand opponetHand) {
		if(myHand.hand() == opponetHand.hand()) {
			System.out.println("あいこ！");
            return true;
		}
		return false;
	}

	//勝敗結果を表示する
	public void showResult(Hand myHand, Hand opponetHand) {
		String result;
		//1.グー　2.チョキ 3.パー
		if((myHand.hand() == 1 && opponetHand.hand() == 2) ||
	       (myHand.hand() == 2 && opponetHand.hand() == 3) ||
	       (myHand.hand() == 3 && opponetHand.hand() == 1)) {
	            result = "勝ち";
	        }else {
	            result = "負け";
	        }
		System.out.println("あなたの" + result + "です。");
	}

}
