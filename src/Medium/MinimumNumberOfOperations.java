package Medium;

public class MinimumNumberOfOperations {
    public int[] minOperations(String boxes) {
        int [] arr = new int[boxes.length()];

        for(int i=0; i<boxes.length();i++){
            int count =0;
            for(int j=boxes.length()-1;j>i;j--){
                if(boxes.charAt(j)=='1'){
                    count += j-i;

                }


            }
            for (int k=0;k<i;k++){
                if(boxes.charAt(k)=='1'){
                    count += i-k;

                }
            }
            arr[i]=count;
        }
        return arr;
    }
    public static void main(String[] args){
        String boxes = "001011";
        MinimumNumberOfOperations mp = new MinimumNumberOfOperations();
        int [] res = mp.minOperations(boxes);
        for(int i =0; i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
