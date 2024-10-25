package learn_ClassAndMain;

public class StudentCSMain {

	public static void main(String[] args) {
//		インスタンスを生成
		StudentCS A1 = new StudentCS(1001, "クリス");
		A1.introduce();
		
//		もう一人のためにインスタンスを生成
		StudentCS A2 = new StudentCS(1002,"ジャン");
		A2.introduce();
		

	}

}
