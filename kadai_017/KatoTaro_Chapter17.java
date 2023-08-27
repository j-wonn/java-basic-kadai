package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17{
	// 名を表すフィールドの値をセットする
	public void setGivenName(String name) {
		this.givenName = name;
	}
	
	// 抽象メソッドeachIntroduceの実装
	// "私はJavaが得意です"と出力
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}
