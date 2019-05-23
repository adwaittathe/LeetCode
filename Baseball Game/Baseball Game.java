class Solution {
    public int calPoints(String[] str) {
        Stack<Integer> stk=new Stack();
	

		for(int i=0;i<str.length;i++)
		{
			switch (str[i])
			{
			case "C":
				stk.pop();
				//list.remove(list.size()-1);
				break;
				
			case "D":
				//list.add(2* list.get(list.size()-1));
				stk.push(2*stk.peek());
				break;
				
			case "+":
				//list.add(list.get(list.size()-1)+ list.get(list.size()-2));
				int x=stk.pop();
                int y=stk.peek();
                stk.push(x);
				stk.push(x+y);
              
				break;
				
			default:
				//list.add(Integer.parseInt(str[i]));
				stk.push(Integer.parseInt(str[i]));
			}
		}
		int sum=0;
		for(int j: stk)
		{	
			sum+=j;
		}
		return sum;
    }
}