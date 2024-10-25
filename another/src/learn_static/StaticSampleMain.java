package learn_static;

public class StaticSampleMain {
	public static void main(String[] args) {
//別のクラスのstaticを持ってくる（インスタンス？）
	StaticSample.sField =789;
	StaticSample.sMethod();
	
//	staticではないインスタンス
	StaticSample s = new StaticSample();
	s.iField = 678;
	s.iMethod();
	
	}
}
