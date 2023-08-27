package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17{
	// 名を表すフィールドの値をセットする
	public void setGivenName(String name) {
		this.givenName = name;
	}
	
	// 抽象メソッドeachIntroduceの実装
	// "趣味は読書です"と出力
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
