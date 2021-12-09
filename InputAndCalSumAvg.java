import java.util.*;
class InputAndCalSumAvg{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			int total=0;
			double avg=1;
				for (int i = 1; i <=10; i++){
					System.out.print("Student "+i+" = ");
					int marks = input.nextInt();
					total+=marks;

				}
			avg=(double)total/10;
			System.out.println("Total = "+total);		
			System.out.println("average = "+avg);	
	}
}
