package crossword;

import java.util.*;


public class fix_me
{
    
    void main() 
    {
        String [] [] DDA = {  {"A","B","C","D"},
                              {"B","F","G","H"},
                              {"I","J","K","L"},
                              {"M","N","O","P"}  };
        lit ex = new lit();
        System.out.println( Arrays.toString( ex.index( DDA, "A" ) ) ); 
        System.out.println( Arrays.toString( ex.check( DDA, "0/0", "B" ) ) );
        System.out.println( ( ex.trustfactor( DDA, "0/0", "B" ) ) ); 
        String test [] = {"0/0"};System.out.println( Arrays.deepToString( ex.output( DDA, test ) ) ); 
    }
}
