package learn_overrode;

public class Calculator {
//	コンストラクタ(フィールドなしだとエラーがでる）
//	でも、returnを設定することで戻り値で持っていくことができる
	int add(int num1, int num2) {
		return num1 + num2;
	}

//	これフィールドはないが、returnのおかげでも戻り値までもっていくことができる
	double add(double num1, double num2) {
		return num1 + num2;
	}
}
