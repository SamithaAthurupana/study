import java.util.*;
class InputAndDisplayLowerUpper{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input Lower : ");
		int Lower = input.nextInt();	
		System.out.print("Input Upper : ");
		int Upper = input.nextInt();
			System.out.print("[");
				for (int i = Lower; i <Upper; i++){
			System.out.print(i+", ");
					
				}
			System.out.println(Lower>Upper ? "EMPTY]" : "\b\b]");		
	}
}
