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
    public static String[] words;
    public static String[][] crossword;
    
    public input()
    {

    }
    
    public void main()
    {
            input ex = new input();
            ex.dimention();
            ex.creator();
            ex.filling();
            ex.word(); //getting words
             //getting filled array
            //System.out.println(Arrays.deepToString(crossword)); //to test the filled array
            //System.out.println(Arrays.toString(words)); //to test the given words
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
    
    public void creator()
    {   

        crossword = new String [column][row];

    }
    
    public void filling() 
    {

        for(int a=0 ; a<column ; a++) 
        {
            for(int b=0 ; b<row ; b++)
            {
                System.out.print("\nEnter The Element Of Column : "+(a+1)+" and Row : "+(b+1)+" : ");
                crossword[a][b] = String.valueOf((y.next()).charAt(0));
                
            }
        }

    }
    
    public void word() 
    {
        System.out.println("Enter The Number Of Words To Find");
        try{
        noOFWORDS = y.nextInt(); }
        catch (Exception e) { System.out.println("Warning: Enter The Number (Integer), Not A String"); }
        words = new String[noOFWORDS];
        for(int c = 0 ; c<noOFWORDS ; c++)
        {
            System.out.print("\nEnter The Word To Find : ");
            words[c] = y.next();
        }
    }
    
}
