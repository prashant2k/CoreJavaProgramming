package duplicateNumber;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
	
	public int findDuplicateNumber(List<Integer> number){
		int highestNumber=number.size()-1;
		int total=getSum(number);
		int duplicate =total-(highestNumber*(highestNumber+1)/2);
		return duplicate;
	}
	public int getSum(List<Integer> number){
		int sum=0;
		for(int num:number){
			sum+= num;
		}
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> number= new ArrayList<Integer>();
		for(int i =1;i<30;i++){
			number.add(i);
		}
	number.add(22);
	DuplicateNumber dn= new DuplicateNumber();
	System.out.println("Duplicate Number:" +dn.findDuplicateNumber(number));

	}

}
