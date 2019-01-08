package crossword;

import java.util.*;

public class logic
{int nr=0,nc=0;
 public static int fx[noOFWords];   
 public static int fy[noOFWords];
 public static int d[noOFWords];
    public find ()
    {    int x[] = { -1,-1,-1, 0, 0, 1, 1, 1 } ; 
         int y[] = { -1, 0, 1,-1, 1,-1, 0, 1 } ; 
        
        for(int m = 0 ; m < noOFWORDS ; m++) 
       {
        for(int i = 0 ; i < row ; i++)
         {
          for (int j = 0 ; j < column ; j++)
           {if( charr[i][j] == words[m].charAt(0))
             {int l = words[m].length();
              for (int h=1 ; h<=8 ; h++)
               {string fw = "";nr=i;nc=j;
                for(int k=0 ; k<l ; k++)
                 { if(nr < 0 || nc < 0 || nr >= row || nc >= column)
                   {break;}
                   if(crossword[nr][nc] != words[m].charAt(k))
                   {break;}
                   fw = fw + crossword [nr][nc];
                   nr += x[h-1]; nc +=y[h-1];
                 }
                if(fw.equals(words[m]))
                 {fx[m] = i ; fy[m] = j ; d[m] = h ; break;}
               }
              if(fw.equals(words[m]))
               break;
             }
           }
           if(fw.equals(words[m]))
           break;
         }
         if(fw.equals(words[m]))
           continue;
            
            /* this function will give 3 arrays fx , fy , d , all three are of length = now where fx contains the
               row numbers of the first alphabets of all words entered , fy contains the column numbers same as 
               fx and d contains the direction as per the 2 arrays x and y */
       }
    }
    
    
 /*   public String [] index ( String [] [] DDA, String Word ) 
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
   */ 
}   
