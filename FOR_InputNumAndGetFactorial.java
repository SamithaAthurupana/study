import java.util.*;
class FOR_InputNumAndGetFactorial{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input Number : ");
		int num = input.nextInt();
			System.out.print("[ ");
		int Fact=1;	
				for (int i = 1; i <=num; i++){
					System.out.print(i+" * ");
					Fact*=i;

				}
			System.out.println("\b\b] = "+Fact);	
	}
}
