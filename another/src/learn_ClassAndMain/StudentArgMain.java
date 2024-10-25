package learn_ClassAndMain;

public class StudentArgMain {

	public static void main(String[] args) {
//		インスタンスを生成
		StudentCS[] studentcss = new StudentCS[3];
		studentcss[0] = new StudentCS(1001, "たま");
		studentcss[1] = new StudentCS(1002, "ピカ");
		studentcss[2] = new StudentCS(1003, "ポチ");
		
//		指定したあと、出力機能
		StudentCS A1 = studentcss[2];
		A1.introduce();
		
		

	}

}
