package calculator;
import java.util.*;
public class UserInterface {
	int operand1,operand2;
	String operand;
	UserInterface(int i1,int i2,String op){
		this.operand1=i1;
		this.operand2=i1;
		this.operand=op;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of two operands");
		int op1=sc.nextInt();
		int op2=sc.nextInt();
		System.out.println("Enter the operand for the operation to be performed");
		String op=sc.next();
		new UserInterface(op1,op2,op);
		CalculatorData c=new CalculatorData(op1,op2,op);
		CalculatorLogic c1=new CalculatorLogic();
		double result=c1.cal(op1,op2,op);
		System.out.println("The result is: "+result);
	}

}
