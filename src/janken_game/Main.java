package janken_game;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameControll gc = new GameControll();
		gc.start(); // ゲーム開始
		for(int count = 0; count < 3; count++) {
			System.out.println("カウント"+ count);
			//あいこがカウントされない
			gc.game();
			/*↓なぜかここでもう一度＋１する設定にしていた
			count += 1;*/
		}
		gc.judge();
        gc.end();   // ゲーム終了

	}

}
