class Solution {
    public int singleNumber(int[] A) {
        
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<A.length;i++)
		{
			if(map.containsKey(A[i]))
			{
				map.put(A[i], map.get(A[i])+1);
			}
			else
			{
				map.put(A[i], 1);
			}
			
		}
		int x=0;
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
			 return entry.getKey();
			}
		}
		return 0;
    }
}