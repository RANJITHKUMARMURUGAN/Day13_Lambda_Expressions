import java.util.*;
@FunctionalInterface
interface MathFunction {
	int calculate(int a, int b);
	
	static void printResult1(int a, int b, String function, MathFunction fobj){
		System.out.println(" Result of " + function + " is " + fobj.calculate(a, b));
	}
	
public class MathOperationApp {
	
	public static void main(String[] args) {
		
		// Using Method Reference instead of Lambda Expression
		// This expression implements 'MathFunction' interface
		
		MathFunction add =(int a, int b) -> a + b; 
		
		// Lambda expression for multiplication & division for two parameters
		// This expression implements 'IMathFunction'
		MathFunction substract = (x, y) -> x - y;
		MathFunction multiply = (x, y) -> x * y;
		MathFunction divide = (int x, int y) -> x / y;
		{

		};	
		
		//Add & Multiply two numbers using lambda expression
		System.out.println("Addition is " + add.calculate( 6,  3));
		System.out.println("Substraction is " + substract.calculate( 6, 3));
		System.out.println("Multiplication is " + multiply.calculate( 6,  3));
		System.out.println("Division is " + divide.calculate( 6,  3));
		
		//Passing Lambda Expression as Function Parameter to print Result using Static Function
		MathFunction.printResult1( 6,  3, "Addition " , add );
		MathFunction.printResult1( 6,  3, "Multiplication " , multiply );
		MathFunction.printResult1( 6,  3, "Devision " , divide );
	}
  }
}
