package cogito;

public class program1 
{
	public static void main(String[] args) {
			int[] arr= {25,30};
			int[] arr2= {25,37};
			System.out.println( profit(2,50,arr,arr2));
			
	}
	
	public static long profit(int n,int k,int[] cost,int[] sell)
	{
		long result=0;
		for(int i=0;i<cost.length;i++)
		{
			if(sell[i]>=cost[i])
			{
				result+=sell[i]-cost[i];
			}
			
		}
		return (result);
	}
}
