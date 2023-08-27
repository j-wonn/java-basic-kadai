package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17{
	// 名を表すフィールドの値をセットする
	public void setGivenName(String name) {
		this.givenName = name;
	}
	
	// 抽象メソッドeachIntroduceの実装
	// "好きな食べ物はリンゴです"と出力
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
