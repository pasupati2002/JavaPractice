import java.util.*;
class Recursion3{
    public static int printFact(int n){

        //print n factorial
        if(n==1 || n==0)
        return 1;
        int fact_n=printFact(n-1);
        int fact=n*fact_n;
        return fact;
    }
    public static void main(String args[]){
        int n=5;
        int res=printFact(n);
        System.out.println(res);
    }
}
