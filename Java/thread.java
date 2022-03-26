public class ThreadExample extends thread
{
public void run()
{
System.out.println("inside:" + thread.currentthread().getName());
}
public static void main(String args[])
{
System.out.println("inside: " + thread.currentthread().getName());

System.out.println("cteating thread..");
thread thread = new threadexample();

System.out.println("String thread. ");
thread.start();
}
}