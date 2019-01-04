package crossword;

import java.util.*;

public class lit
{
    
    
    String [] [] DDA = {  {"A","B","C","D"},
                          {"B","F","G","H"},
                          {"I","J","K","L"},
                          {"M","N","O","P"}  };
    
    public lit ()
    {
        //
    }
    
    
    public String [] index ( String [] [] DDA, String Word ) 
    {
        //
        String[] index = new String[0];
        //
        String [] [] alpha = DDA ;
        String beta = Word ;
        String [] gama = beta.split( "/" ) ;
        int row = alpha.length ;
        int column = alpha[0].length ;
        //
        for( int r = 0 ; r < row ; r++ ) 
        {
            //
            for( int c = 0 ; c < column ; c++ )
            {
                // 
                if( ( alpha [r] [c] ).equals( gama[0] ) )
                {
                    //
                    index = Arrays.copyOf( index, ( index.length + 1 ) ) ;
                    index [ index.length - 1 ] = ( r + "/" + c ) ;
                }
            }
        }
        //
        return index;
    }
    
    
    public String [] check ( String [] [] DDA, String Index, String Character )
    {
        //
        String[] index = new String[0];
        //
        String [] [] alpha = DDA ; //DDA
        String beta = String.valueOf( Character.charAt( 0 ) ) ; //Char
        String [] gama = Index.split( "/" ) ; //Index
        int row = alpha.length ;
        int column = alpha[0].length ;
        //
        for( int ro = ( Integer.parseInt( gama [0] ) - 1 ) ; ro <= ( Integer.parseInt( gama [0] ) + 1 ) ; ro++ )
        {
            //
            for( int col = ( Integer.parseInt( gama [1] ) - 1 ) ; col <= ( Integer.parseInt( gama [1] ) + 1 ) ; col++ )
            {
                //
                if( ro >= 0 && col >= 0 )
                {
                    //
                    if( ro < row && col < column )
                    {
                        //
                        if( ( alpha [ro] [col] ).equals( beta ) )
                        {
                            //
                            index = Arrays.copyOf( index, ( index.length + 1 ) ) ;
                            index [ index.length - 1 ] = ( ro + "/" + col ) ;
                        }
                    }
                }
            }
        }
        return index;
    }
    
    
    public boolean trustfactor ( String [] [] DDA, String Index, String Character )
    {
        //
        String [] [] alpha = DDA ; //DDA
        String beta = String.valueOf( Character.charAt( 0 ) ) ; //Char
        String [] gama = Index.split( "/" ) ; //Index
        int row = alpha.length ;
        int column = alpha[0].length ;
        int constant = 0;
        //
        for( int ro = ( Integer.parseInt( gama [0] ) - 1 ) ; ro <= ( Integer.parseInt( gama [0] ) + 1 ) ; ro++ )
        {
            //
            for( int col = ( Integer.parseInt( gama [1] ) - 1 ) ; col <= ( Integer.parseInt( gama [1] ) + 1 ) ; col++ )
            {
                //
                if( ro >= 0 && col >= 0 )
                {
                    //
                    if( ro < row && col < column )
                    {
                        //
                        if( ( alpha [ro] [col] ).equals( beta ) )
                        {
                            //
                            constant++;
                        }
                    }
                }
            }
        }
        if(constant==0)
            return false;
        else
            return true;
    }
    
    public String [] [] output ( String [] [] DDA, String [] Index )
    {
        //
        //String [] [] CapThat = new String [length-1] [2] ;
        String [] [] alpha = DDA ;
        String [] beta;
        String [] gama = Index;
        //
        int length = gama.length;
        int row = alpha.length ;
        int column = alpha[0].length ;
        //
        for( int r = 0 ; r < row ; r++ )
        {
            //
            for( int c = 0 ; c < column ; c++ )
            {
                //
                alpha [r] [c] = ( alpha [r] [c] ).toLowerCase();
            }
        }
        
        for( int cont = 0 ; cont < length ; cont ++)
        {
            //
            beta = ( gama [cont] ).split( "/" ) ;
            alpha [ Integer.parseInt( beta[0] ) ][ Integer.parseInt( beta[1] ) ] = ( alpha [ Integer.parseInt( beta[0] ) ] [ Integer.parseInt( beta[1] ) ] ).toUpperCase();
        }
        
        return alpha;
    }
    
    
    void main() { System.out.println( Arrays.toString( index( DDA, "A" ) ) ); System.out.println( Arrays.toString( check( DDA, "0/0", "B" ) ) );
    System.out.println( ( trustfactor( DDA, "0/0", "B" ) ) ); String test [] = {"0/0"};System.out.println( Arrays.deepToString( output( DDA, test ) ) ); }
}
