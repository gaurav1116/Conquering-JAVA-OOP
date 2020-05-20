import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class calculator {

	public static void main(String[] args) 
	{		
	 int num1,num2,calculation,key;  //declaring variable
	 System.out.println("Please enter two numbers for calculation: ");
	 Scanner scanner = new Scanner(System.in);
	 //taking inputs from user
	 num1= scanner.nextInt();
	 num2= scanner.nextInt();
	 
	 System.out.println("Enter 1 for addtion, 2 for subtraction, 3 for multiplication, 4 for division and 4 for modulus: ");
	 key= scanner.nextInt(); //taking choice number from user
			 
	 switch (key) 
	 {
	case 1:									//addition
		calculation= num1+num2;				 
		System.out.print("Addition of two numbers entered by user is " + calculation);
		break;
	case 2:								    //subtraction
		calculation= num1-num2;
		System.out.print("Subtraction of two numbers entered by user is " + calculation);
		break;
	case 3:									//multiplicaton
		calculation= num1*num2;
		System.out.print("Multiplication of two numbers entered by user is " + calculation);
		break;
	case 4:									//division
		calculation= num1/num2;
		System.out.print("Division of Number 1 by Number 2 entered by user is " + calculation);
		break;
	case 5:									//modulus
		calculation= num1%num2;
		System.out.print("Modulus of Number 1 by Number 2 entered by user is " + calculation);
		break;

	default:								//for invalid input
		System.out.println("It seems you entered invalid input.Please try again.");
		break;
	}
	 
	 
	}		

}
