package Week1day2;

public class SumOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=765;
		int sum=0;
		int rem=0;

		while(num>0)
		{

			rem=num%10;
			num=num/10;

			sum=sum+rem;

		}
		System.out.println(sum);
	}

}
