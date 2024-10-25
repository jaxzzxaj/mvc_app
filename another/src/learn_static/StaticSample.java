package learn_static;

public class StaticSample {
//	フィールド
	int iField;
	static int sField;
//メソッド
	void iMethod() {
		System.out.println("iFeild=" + iField);
	}
	
	static void sMethod() {
		System.out.println("sFeild=" + sField);
	}
}
