package learn_overrode;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int iSum = cal.add(2,7);
		System.out.println("整数の和：" + iSum);
		
		double dSum = cal.add(3.14,8.17);
		System.out.println("少数の和：" + dSum);

	}

}
