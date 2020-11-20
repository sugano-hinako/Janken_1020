package janken_game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hand {
	private int hand;
	private int count = 0;

	// 手を入力で指定
	public void setHand() {
		count = 0;
		do {
			System.out.println("何を出しますか？");
			System.out.println("グー：1、チョキ：2、パー：3");
		} while (!isNumber());
	}

	/**
	 * 入力値が1か2か3であるか判定する
	 * 1,2,3, 数値以外 ならfalseを返す
	 * @return
	 */
	private boolean isNumber() {

		if (count < 10) {// 10回以上間違えるようなら強制的に"グー"を設定する
			try {
				Scanner scan = new Scanner(System.in);
				this.hand = scan.nextInt();
				if (!(hand == 1 || hand == 2 || hand == 3)) {
					System.out.println("数値は1,2,3から選んでください");
					// 連続でできない ２回連続で正しくない数値を入れるとnullが返ってくる
					count++;
					return false;
				}
				return true;
			} catch (InputMismatchException e) {
				System.out.println("数値で入力してください。");
				count++;
				return false;
			}
		} else {
			this.hand = 1;
			return true;
		}

	}

	// 手をランダムに設定
	public void setRandomHand() {
		Random random = new Random();
		this.hand = random.nextInt(3) + 1;
	}

	// 手の名称を返す
	public String handName() {
		String handName = null;
		if (this.hand == 1)
			handName = "グー";
		if (this.hand == 2)
			handName = "チョキ";
		if (this.hand == 3)
			handName = "パー";
		return handName;
	}

	// 手の値を返す
	public int hand() {
		return this.hand;
	}

}