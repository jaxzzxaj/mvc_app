package learn_contractor_overrode;

public class StudentOL {
//	フィールド
	int id;
	String name;
	
//	コンストラクタ
	StudentOL(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	StudentOL(int id){
		this(id,"未入力");
	}
	
//	メソッド
	void introduce() {
		System.out.println("学生番号＝"+ id);
		System.out.println("学生番号＝"+ name);
	}
	

}
