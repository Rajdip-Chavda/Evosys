/* try this 5-2 
A queue class for Characters
*/
 class Queue
 {
     char q[];// this array holds the queue
     int putloc,getloc;
     // this put and get induces

    Queue(int size)
    {
        q =new char[size];// allocate memory for queue
        putloc = getloc =0;
    }
    // put a character into the queue
    void put(char ch)
    {
        if(putloc == q.length)
        {
            System.out.println("= Queue is full.");
            return;
        }
        q[putloc++]=ch;
    }
    //get a charcter from the queue
    char get()
    {
        if(getloc== putloc)
        {
            System.out.println(" - Queue is empty. ");
            return (char) 0;
        }
        return q[getloc++];
    }
 }
  // Demonatrate the queue class
     class QDemo{
         public static void main(String args[])
         {
            Queue bigQ=new Queue(100);
            Queue smallQ=new Queue(4);
            char ch;
            int i;

            System.out.println("Using bigQ to store the Alphabeet. ");
            //put some number into bigQ 
            for(i=0;i<26;i++)
                bigQ.put((char) ('A' + i));

            //retrieve and display elements from bigQ
            System.out.println("Contents of BigQ :");
            for(i=0;i<26;i++)
            {
                ch=bigQ.get();
                if(ch != (char) 0)
                    System.out.print(ch);
            }
            System.out.println("\n");
            
            System.out.println("Using smallQ is to genrate Errors .");
            //Now ,use small! to generate some errors
            for(i=0;i<5;i++)
            {
                System.out.println("Attempting to store " + (char) ('Z' - i ) );
                
                smallQ.put((char) ('Z' - i));
                System.out.println();
            }
            System.out.println();

            //more erroes on smallQ
            System.out.println("Content of smallQ:");
            for(i=0;i<5;i++)
            {
                ch=smallQ.get();

                if(ch != (char) 0) 
                    System.out.println(ch);
            }
         }
     }

