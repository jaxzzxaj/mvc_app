package test_0924;
//オブジェクト指向テスト：２０問目
public class Reigai_20 {
	public static void main(String [] args) {
		try {
			int[] nums = {1,2,3,4,5};
			System.out.println(nums[5]);
		} catch (NullPointerException e) {
			System.out.println("NullPointer");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("OutOfBounds");
		} finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}
}
