package janken_game;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameControll gc = new GameControll();
		gc.start(); // ゲーム開始
		for(int count = 0; count < 5; count++) {
			gc.game();
			count++;
		}
		gc.judge();
        gc.end();   // ゲーム終了

	}

}
