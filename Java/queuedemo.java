import java.util.PriorityQueue;

public class queuedemo
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--)
		{
			queue.add(i);
			System.out.println(queue);
		}
		System.out.println(queue.peek());
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}