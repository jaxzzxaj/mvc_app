package learn_contractor_overrode;

public class StudentOLMain {

	public static void main(String[] args) {
//インスタンスを生成
		StudentOL std1 = new StudentOL(1001, "山田太郎");
		StudentOL std2 = new StudentOL(1002, "クリス");
		
		std1.introduce();
		std2.introduce();
	}

}
