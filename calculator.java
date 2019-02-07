import java.util.Scanner;
public class calculator {

	public static void main(String args []){
	Scanner input = new Scanner(System.in);
	Scanner inp = new Scanner(System.in);
	System.out.println("Calculate right here");
	
	int r = input.nextInt();
	String oper = inp.nextLine();
	int s = input.nextInt();
	
	System.out.println(calculator.calc(r,s,oper));

	}
	
	public static double calc(double a, double b, String op){
		
		double answer = 0;
		if(op.equals("*")){
			answer = a * b;
		}
		if(op.equals("/")){
			answer = a / b;
		}
		if(op.equals("+")){
			answer = a + b;
		}
		if(op.equals("-")){
			answer = a - b;
		}
		
		return answer;
	}

}
