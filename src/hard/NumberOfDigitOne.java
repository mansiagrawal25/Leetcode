package hard;

public class NumberOfDigitOne {
    public int countDigitOne(int n) {
        int count =1;
if(n==0){
    count=0;
    return count;
}

        for(int i=10; i<=n; i++){

            String str = String.valueOf(i);
            for(int j=0; j<=str.length()-1;j++){
//                char ch='1'
                if(str.charAt(j)=='1'){
                    count++;
                }
            }
        }
        return count;
    }
}
