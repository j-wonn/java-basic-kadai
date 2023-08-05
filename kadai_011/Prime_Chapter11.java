package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {
		
		//　boolean型の配列を作成し、初期化する
		boolean[] primeArray = new boolean[101];
		
		// boolean型の配列の要素を、for文を使って繰り返しtureで初期化する処理をする
		for(int i = 0; i < primeArray.length; i++) {
			primeArray[i] = true; 	// trueなら素数、falseなら素数じゃない
		}
		
		//  100までの整数が素数であるか判定する
		int devideNum = 2; // 割る数を２で初期化
		int number = 0; // 整数(要素番号)
		
		for( number = 0; number < primeArray.length; number++) {
			if( number == 0 || number == 1) {
				primeArray[number] = false; // ０と１は、素数でないから
				continue;
			}
			for( devideNum = 2; devideNum < number; devideNum++) {
				
				if( number % devideNum == 0) {
					primeArray[number] = false;  // 割り切れるので素数でない
					continue;                    // 1度でも割り切れたら素数ではないのでスキップできる？
				}
			}
		}
		// 素数を出力する。　trueである要素番号が素数
		for(int i = 0; i < primeArray.length; i++) {
			if( primeArray[i] == true) {
				System.out.println(i);
			}
		}
	}
}