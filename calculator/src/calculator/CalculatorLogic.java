package calculator;

public class CalculatorLogic {
	double cal(int op1,int op2,String op) {
		double ans=0;
		switch(op) {
		case "+": ans=(double)(op1+op2);
		          break;
		case "-": ans=(double)(op1-op2);
		          break;
		case "*": ans=(double)(op1*op2);
		          break;
		case "/": ans=(double)op1/(double)(op2);
		          break;
		
		}
		return ans;
	}

}
