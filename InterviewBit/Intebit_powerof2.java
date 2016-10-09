import java.util.*;
import java.lang.*;
public class Intebit_powerof2{
	public static  void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		long num = in.nextLong();
		float v = Math.log(num)/Math.log(2);
		if(v % 2== 0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}
}