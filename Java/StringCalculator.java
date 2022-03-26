import java.util.Scanner;
class CountCharacter    
{    
    public static void main(String[] args) {    
		Scanner enter= new Scanner(System.in);
		
		System.out.println("Enter String :");
		String string;
		string= enter.nextLine();
		
		int count = 0;    
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
        int st=string.length()-count;
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
        System.out.println("Total number of space: " + st);    
    }    
}     