/*Software Even If adviced of the possubility of such Damage*/
public class ArrayofarrayDemo2{
    public  static void main(String args[])
    {
        int[][] amatrix=new int[4][];
        //populate matrix
        for(int i=0;i<amatrix.length;i++)
        {
            amatrix[i] =new int[5];//Create sub-array 
            for(int j=0;j<amatrix[i].length;j++)
            {
                amatrix[i][j] =i + j;
            }             
        } 
        //print matrix
        for(int i=0;i<amatrix.length;i++)
        {
            for(int j=0;j<amatrix[i].length;j++)
            {
                System.out.print(amatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}