//Name:Yogesh Pawar Date:28/08/2017
class MainClass9
{
	public static void main(String arg[])
	{
		int lines=7;
		int stars=1;
		int spaces=4;
		int mid=(lines+1)/2;

		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=stars;k++)
			{
				if(k==1||k==stars)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i>=mid)
			{
				stars=stars-2;
				spaces++;
			}
			else
			{			
			stars=stars+2;
			spaces--;
	
			}
		}
	}
}

/*
output:-

    *
   * *
  *   *
 *     *
  *   *
   * *
    *


*/

