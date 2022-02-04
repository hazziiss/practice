package testProject;

public class ComparisonOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =9;
		int num2= 13;
		int num3= 13;
		
		System.out.println("9>13 : " + (num1>num2));
		System.out.println("9>=13 : " + (num1>=num2));
		System.out.println("9<13 : " + (num1<num2));
		System.out.println("13<=13 : " + (num1<=num2));
		System.out.println("9==13 : " + (num1==num2));
		System.out.println("13==13 : " + (num3==num2));
		System.out.println("9!=13 : " + (num1!=num2));

		/**num1, num2, num3 변수에 각각 저장된 정수 값을 비교한 후,
		비교연산결과는 boolean 데이터 타입(논리형)으로 리턴됨*/
	}

}
