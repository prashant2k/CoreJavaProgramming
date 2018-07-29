package numberSumRecursion;

public class NumberSumRecursion {
	int sum=0;
	public int getNumberSum(int number){
		if(number==0){
			return sum;
		}else{
			sum += (number%10);
			getNumberSum(number/10);
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		NumberSumRecursion nsr= new NumberSumRecursion();
		System.out.println("Sum is : "+nsr.getNumberSum(315));
		

	}

}
