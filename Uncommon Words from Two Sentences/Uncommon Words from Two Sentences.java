class Solution {
    public String[] uncommonFromSentences(String a, String b) 
    {
		ArrayList<String> list=new ArrayList<>();
		HashMap<String, Integer>map_a = new HashMap<>();
		HashMap<String, Integer>map_b = new HashMap<>();
		String[] a_str = a.split(" ");
		String[] b_str = b.split(" ");
		for(int i=0;i<a_str.length;i++)
		{
			if(map_a.containsKey(a_str[i]))
			{
				map_a.put(a_str[i], map_a.get(a_str[i])+1);
			}
			else
			{
				map_a.put(a_str[i], 1);
			}
		}
		
		for(int i=0;i<b_str.length;i++)
		{
			if(map_b.containsKey(b_str[i]))
			{
				map_b.put(b_str[i], map_b.get(b_str[i])+1);
			}
			else
			{
				map_b.put(b_str[i], 1);
			}
		}
		for(Map.Entry<String, Integer> entry:map_a.entrySet())
		{
			if(entry.getValue()==1)
			{
				if(!map_b.containsKey(entry.getKey()))
				{
					list.add(entry.getKey().toString());
				}
			}
		}
		
		for(Map.Entry<String, Integer> entry:map_b.entrySet())
		{
			if(entry.getValue()==1)
			{
				if(!map_a.containsKey(entry.getKey()))
				{
					list.add(entry.getKey().toString());
				}
			}
		}
        String[] str=new String[list.size()];
		list.toArray(str);
        return str;    
                
    }
}