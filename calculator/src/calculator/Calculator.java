package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
       int key, num1, num2, result;
       
        System.out.println("Please enter two numbers for calculation: ");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        num2= sc.nextInt();
        
        System.out.println("Please enter 1 for addition,2 for subtraction,3 for division,4 for multiplication or 5 for modulus: ");
        key= sc.nextInt();
        
        Calculate ca = new Calculate();
        result= ca.task(key,num1,num2);
    
    }

}

class Calculate
{
    public int task(int key, int num1, int num2)
    {
        int calculation;
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