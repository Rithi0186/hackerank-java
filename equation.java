import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int firstNum=0,j=0;
        int p = (int)Math.pow(2,0);
        int k=(int)Math.pow(2,j);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            firstNum=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for( j =0;j<n;j++){
                if(j==0){
                     int l=a+(p*b);
              firstNum+= l;
              System.out.print(firstNum+" ");
                }
               
            
            else{
                firstNum=firstNum+((int)Math.pow(2,j)*b);
                              System.out.print(firstNum+" ");

            }
        }
        System.out.println();
        }in.close();
    }
}
