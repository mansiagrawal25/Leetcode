package hard;

public class NumberOfDigitOne {
    public int countDigitOne(int n) {
//        int count =1;
//if(n==0){
//    count=0;
//    return count;
//}
//
//        for(int i=10; i<=n; i++){
//
//            String str = String.valueOf(i);
//            for(int j=0; j<=str.length()-1;j++){
////                char ch='1'
//                if(str.charAt(j)=='1'){
//                    count++;
//                }
//            }
//        }
//        return count;

        int count = 0;

        for (long k = 1; k <= n; k *= 10) {
            long r = n / k, m = n % k;
            // sum up the count of ones on every place k
            count += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
        }

        return count;
    }
}
