import java.util.*;
class FORZeroTo100RandomNum{
	public static void main(String[] args) {
		Random r = new Random();
				for (int i = 0; i <100; i++){
					int rand = r.nextInt(101);
					System.out.println(rand);	
				}
		}
}
