import java.util.*;
class FOR_InpuINTAnd10toZeroo{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input an integer : ");
		int num = input.nextInt();	
			System.out.print("[");
				for (int i = 0; i <num; i++){
			System.out.print(i+", ");
					
				}
			System.out.println("\b\b]");		
	}
}
