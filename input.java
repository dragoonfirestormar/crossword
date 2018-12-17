
package crossword;
import java.util.Scanner;
import java.util.Arrays;
public class input
{
    public Scanner y = new Scanner(System.in);
    public static int row;
    public static int column ;
    public input()
    {

    }
    public void main()
    {
        input ex = new input();
        ex.dimention();
        String[][] lmfao = ex.filling();
        System.out.println(Arrays.deepToString(lmfao));
    }

    
    public void dimention()
    {
        System.out.print("Enter the number of row : ");
        row = y.nextInt();
        System.out.print("\nEnter the number of column : ");
        column = y.nextInt();
    }
    
    public String[][] creator ()
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
    
    
}
