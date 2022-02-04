package testProject;

public class LogicalOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 9;
		int num2 = 2;
		int num3 = 0;
		
		System.out.println((num1 == num2)&&(num1/num3)>0);
		//System.out.println((num1 == num2)&(num1 / num3)>0);
		
		System.out.println((num1 != num2) || (num1/num3)>0);
		//System.out.println((num1 != num2)|(num1 / num3)>0);
	}

}
