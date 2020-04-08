package test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<=100;i++)
		{
		boolean a = true;
		for (int j=2;j<=i-1;j++)
			{
			int k= i % j;
			if (k==0)
			{
				a=false;
				break;
			}	
		}		
		if(a==true)
		{
			System.out.println(i);
		}	
	}

	}

}
