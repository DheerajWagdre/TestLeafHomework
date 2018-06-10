package Week1day2;

public class ArithOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		int num2 = 200;
		String operation = "ADD";
		
		switch(operation) {
		case "ADD":
			System.out.println("Addition :"+(num1+num2));
			break;
		case "SUB" :
			System.out.println("Substraction :"+(num2-num1));
	break;
		case "MUL" :
			System.out.println("Substraction :"+(num2*num1));
	break;
		case "DIV" :
			System.out.println("Substraction :"+(num2/num1));
	break;
	default:
		System.out.println("Value is invalid :");
	
	}
	}
}
