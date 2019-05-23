class Solution {
    public int islandPerimeter(int[][] A) {
       	
		int count=0;
		int side;
		for(int a=0;a<A.length;a++)
		{
			for(int b=0;b<A[0].length;b++)
			{
				
				if(A[a][b]==1)
				{
					side=4;
				
					b--;
					if(b>=0)
					{
						if(A[a][b]==1)
						{
							side--;
						}
					}
					b++;
					a--;
					if(a>=0)
					{
						if(A[a][b]==1)
						{
							side--;
						}
					}
					a++;
					b++;

					if(b<A[0].length)
					{
						if(A[a][b]==1)
						{
							side--;
						}
					}

					b--;
					a++;
					if(a<A.length)
					{
						if(A[a][b]==1)
						{
							side--;
						}
					}
					a--;
					count+=side;

				}


			}
		}
		return count; 
    }
}