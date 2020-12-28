package com.company;

public class Input {

    void main(){
        System.out.println("OK yes");
    }
}
/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter row: ");
        int row = scan.nextInt();
        System.out.println("Enter col: ");
        int col = scan.nextInt();

        char [][] crossword = new char [row][col];
        for(int i=0; i<row; i++){
            crossword[i] = scan.next().substring(0,col).toCharArray();
        }
        System.out.println(Arrays.deepToString(crossword));

        System.out.println("Enter Word To Find: ");
        String word = scan.next();
        System.out.println(word);
        Main x = new Main();
        String val = x.runner(crossword, word);
        System.out.println(val);
        String[] Arr = val.split("\\|");
        String[] A; String[] AA;
        for(int i=0; i<Arr.length; i++){
            A=Arr[i].split(" ");
            for(int j=0; j<A.length; j++) {
                AA = A[j].split(",");
                int I = Integer.valueOf(AA[0]);
                int J = Integer.valueOf(AA[1]);
                crossword[I][J] = '_';
            }
        }
        for(char[] i: crossword){
            for(char j: i){
                if(j=='_')
                    System.out.print('X');
                else
                    System.out.print('0');
            }
            System.out.println();
        }

        System.out.println("ok");

    }

    boolean checkindex(char[][] DDA, char alpha, String ind){
        String [] index = ind.split(",");
        if(DDA[Integer.valueOf(index[0])][Integer.valueOf(index[1])] == alpha)
            return true;
        return false;
    }
    boolean checkword(char[][] DDA, String word){
        if(word.equals("")){
            return false;
        }else{
            for(char[] x: DDA)
                for(char y: x)
                    if(y==word.charAt(0))
                        return true;
        }
        return false;
    }
    String runner(char[][] DDA, String word){
        String temp;
        String result = "";
        int count = 0;
        for(int i=0; i<DDA.length; i++){
            for(int j=0; j<DDA[0].length; j++){
                if(DDA[i][j]==word.charAt(0)){
                    temp = right(DDA, word, i+","+j);
                    for(char c: temp.toCharArray())
                        if(c==',')
                            count++;
                    if(count==word.length())
                        result += temp.trim()+"|";
                    count=0;
                    temp = down(DDA, word, i+","+j);
                    for(char c: temp.toCharArray())
                        if(c==',')
                            count++;
                    if(count==word.length())
                        result += temp;
                    count=0;
                }
            }
        }
        return result.substring(0,result.length()-1);
    }

    String right(char[][] DDA, String word, String ind){
        if(word.equals(""))
            return "";
        String [] index = ind.split(",");
        int I = Integer.valueOf(index[0]);
        int J = Integer.valueOf(index[1]);
        if(J<DDA[0].length){
            if(DDA[I][J] == word.charAt(0))
                return I+","+J+" " + right(DDA, word.substring(1), I+","+(J+1));
        }
        return "";
    }

    String down(char[][] DDA, String word, String ind){
        if(word.equals(""))
            return "";
        String [] index = ind.split(",");
        int I = Integer.valueOf(index[0]);
        int J = Integer.valueOf(index[1]);
        if(I<DDA.length){
            if(DDA[I][J] == word.charAt(0))
                return I+","+J+" " + down(DDA, word.substring(1), (I+1)+","+J);
        }
        return "";
    }
}

 */