package java_course;
import java.util.HashMap;
public class qus5_array
{
	public static void main(String args[])
	{
		int []arr= {1,5,6,7,8,1,2,3,4,5,6,8,7,6,5,4,3,2};
		HashMap<Integer,Integer>count=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			if(count.containsKey(i))
			{
				count.put(i, count.get(i)+1);
			}
			else
			{
				count.put(i, 1);
			}
		}
		for(HashMap.Entry<Integer,Integer>e:count.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
