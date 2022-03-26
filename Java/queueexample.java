import java.util.*;
class queueexample
{
	public static void main(String args[])
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		queue.add("poojan");
		queue.add("nandu");
		queue.add("rahul");/*
		queue.add("jaydip");
		queue.add("dax");
		queue.add("daxesh");
		queue.add("mahesh");
		queue.add("vijay");
		queue.add("prajval");
		queue.add("jayesh");
		queue.add("sagar");*/
		System.out.println("head element :"+queue.element());
		System.out.println("head element :"+queue.peek());
		Iterator itr=queue.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elemnent :");
	
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		/*
		queue.poll();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--)
		{
			q.add(i);
		}
		System.out.println(q.peek());
		queue.poll();
		System.out.println(q.peek());
		*/
	}
} 