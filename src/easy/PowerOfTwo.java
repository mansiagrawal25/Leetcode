package easy;
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        boolean flag = false;
        int q=0;
        if(n==1){
            flag = true;
        }
        if(n==0){
            flag= false;
            return flag;
        }

        while( q!=1&& n%2==0){
            q = n/2;
            n=q;
        }
        if(q==1){
            flag=true;
        }

        return flag;
    }
}
