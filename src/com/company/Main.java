package com.company;
import java.util.Scanner;


public class Main {

    public static Scanner scan = new Scanner(System.in);
    int row, col;
    String word;
    char[][] crossword;

    Main(){
        row = 0;
        col = 0;
        word = "";
    }

    public static void main(String[] args) {
        Main x = new Main();
        x.input();
        //x.output();
        x.finder();
        System.out.println("\n-X-X-X-X");

    }

    void input(){
        System.out.println("Enter row: ");
        row = scan.nextInt();
        System.out.println("Enter col: ");
        col = scan.nextInt();
        crossword = new char [row][col];
        System.out.println("Enter the rows: ");
        for(int i=0; i<row; i++){
            crossword[i] = scan.next().substring(0,col).toCharArray();
        }
        System.out.println("Enter Word To Find: ");
        word = scan.next();
    }

    void finder(){
        System.out.println();
        String val = runner(crossword, word);
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

    //I wrote other functions even tho they are not used to solve
    //crossword because I when first started this project I overcomplicated
    //the simplicity of this project, but still as they were there in 2018
    //i wanted to re-create them even tho i wont be using em.

    String[] index(char[][] DDA, String word){
        String result="";
        for(int i=0; i<DDA.length; i++){
            for(int j=0; j<DDA[0].length; j++){
                if(DDA[i][j]==word.charAt(0)){
                    result+=i+"/"+j+", ";
                }
            }
        }
        return result.strip().split(",");
    }

    String [] check(char[][] DDA, String ind, char chr){
        String result="";
        String [] index = ind.split("/");
        int I = Integer.valueOf(index[0]);
        int J = Integer.valueOf(index[1]);
        for(int i=I-1; i<=I+1; i++){
            for(int j=J-1; j<=J+1; j++){
                if(i>=0 && j>=0 && i<DDA.length && j<DDA[0].length){
                    if(DDA[i][j]==chr && (i!=I || j!=J))
                        result+=i+"/"+j+", ";
                }
            }
        }
        return result.strip().split(",");
    }

    boolean trustfactor(char[][] DDA, String ind, char chr){
        String [] index = ind.split("/");
        int I = Integer.valueOf(index[0]);
        int J = Integer.valueOf(index[1]);
        for(int i=I-1; i<=I+1; i++){
            for(int j=J-1; j<=J+1; j++){
                if(i>=0 && j>=0 && i<DDA.length && j<DDA[0].length){
                    if(DDA[i][j]==chr && (i!=I || j!=J))
                        return true;
                }
            }
        }
        return false;
    }

    void output(){
        System.out.println();
        String val = runner(crossword, word);
        String[] Arr = val.split("\\|");
        String[] A; String[] AA;
        for(int i=0; i<Arr.length; i++){
            A=Arr[i].split(" ");
            for(int j=0; j<A.length; j++) {
                AA = A[j].split(",");
                int I = Integer.valueOf(AA[0]);
                int J = Integer.valueOf(AA[1]);
                crossword[I][J] = Character.toUpperCase(crossword[I][J]);
            }
        }
        for(char[] i: crossword){
            for(char j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
