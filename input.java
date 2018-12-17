/*
Will be getting following inputs:-
*Dimention Of DDA
*Filled DDA
*Word(s) To Execute

The following data will be given out:-
*no. of row (int)
*no. of column (int)
*no. of words to find (int)
*words to find (ArrayList)
*crossword (Arrays)
*/
package crossword;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class input
{
    public Scanner y = new Scanner(System.in);
    public static int row;
    public static int column;
    public static int noOFWORDS;
    public ArrayList<String> words = new ArrayList<String>();
    public input()
    {

    }
    public void main()
    {
        input ex = new input();
        ex.dimention();
        word(); //getting words
        String[][] FilledArray = ex.filling(); //getting filled array
        //System.out.println(Arrays.deepToString(FilledArray)); to test the filled array
        //System.out.println(words); to test the given words
    }

    
    public void dimention()
    {
        System.out.print("Enter the number of row : ");
        try{row = y.nextInt();}
        catch (Exception e) { System.out.println("Warning: Enter The Number (Integer), Not A String"); }
        System.out.print("\nEnter the number of column : ");
        try{column = y.nextInt();}
        catch (Exception e) { System.out.println("Warning: Enter The Number (Integer), Not A String"); }
    }
    
    public String[][] creator()
    {
        String[][] crossword = new String [column][row];
        return crossword;
    }
    
    public String[][] filling() 
    {
        String[][] filled = creator();
        for(int a=0 ; a<column ; a++) 
        {
            for(int b=0 ; b<row ; b++)
            {
                System.out.print("\nEnter The Element Of Column : "+(a+1)+" and Row : "+(b+1)+" : ");
                filled[a][b] = String.valueOf((y.next()).charAt(0));
            }
        }
        return filled;  
    }
    
    public void word() 
    {
        System.out.println("Enter The Number Of Words To Find");
        try{
        noOFWORDS = y.nextInt(); }
        catch (Exception e) { System.out.println("Warning: Enter The Number (Integer), Not A String"); }
        for(int c = 0 ; c<noOFWORDS ; c++)
        {
            System.out.println("Enter The Word To Find");
            
            words.add(y.next());
        }
    }
    
}
