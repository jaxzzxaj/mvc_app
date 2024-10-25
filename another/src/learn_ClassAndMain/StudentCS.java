package learn_ClassAndMain;

public class StudentCS {
//	フィールド
	int id;
	String student;
	
//	コンストラクタ
	StudentCS(int id, String student){
		this.id = id;
		this.student= student;
	}
//	メソッド
	void introduce() {
		System.out.println("学籍番号は"+ this.id);
		System.out.println("氏名は" + this.student);
	}
}
