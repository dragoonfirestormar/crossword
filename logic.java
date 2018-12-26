package crossword;
/*
    *no. of row (int)   row
    *no. of column (int)    column
    *no. of words to find (int) noOFWORDS
    *words to find (ArrayList) words
    *crossword (Arrays) crossword
 */
import java.util.Arrays;

public class logic
{
    int column=4; int row =2;
    String[] index = new String[0];
    String[][] arr = { {"A","B"}, {"A","B"}, {"A","B"}, {"A","B"} };
    String words = "AAA";
    public logic()
    {  
           

    }
    
    public void collector(String XYZ) 
    {
        String word = XYZ;
        String[] wo = word.split("");
        for(int c = 0 ; c < column ; c++) 
        {
            for(int r = 0 ; r < row ; r++)
            {
                if( arr[c][r].equals(wo[0]))
                {
                    index = Arrays.copyOf(index, (index.length+1));
                    index [index.length-1] = c+"/"+r;
                }
            }
        }
        System.out.println(Arrays.toString(index));
    }
    
    public void check(String XYZ,String In) 
    {
        String[] in = In.split("/");
        System.out.println(Arrays.toString(in));
        String word = XYZ;
        String[] wo = word.split("");
        for(int c =(Integer.parseInt(in[0])-1) ; c <= (Integer.parseInt(in[0])+1) ; c++) 
        {
            for(int r =(Integer.parseInt(in[1])-1) ; r <= (Integer.parseInt(in[1])+1) ; r++) 
            {   
                
                if(c>+0 && r>=0) {
                
                if( arr[c][r].equals(wo[0]))
                    System.out.println(c+" "+r); } 
            }
        }
    }
    
    
    

}
