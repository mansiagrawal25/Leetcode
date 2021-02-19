package easy;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public String reformatD(String date) {
        String[] months= new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};
        Map<String ,String> map = new HashMap<>();
        for(int i=0; i<months.length;i++){
            map.put(months[i],(i+1<10?"0":"")+(i+1));
        }
        String[] arr = date.split(" ");
        String day = (arr[0].length()==3?"0":"")+ arr[0].substring(0, arr[0].length()-2);
        return arr[2]+"-"+ map.get(arr[1])+"-"+day;


    }
    public String reformatDate(String date){
        String[] arr= date.split(" ");
        String ans ="";
        ans += arr[2] + "-" +month(arr[1])+"-"+ date(arr[0]);
        return ans;

    }
    public String month(String mm){
        if(mm.equals("Jan")){
            return "01";
        }
        if(mm.equals("Feb")){
            return "02";
        }
        if(mm.equals("Mar")){
            return "03";
        }
        if(mm.equals("Apr")){
            return "04";
        }
        if(mm.equals("May")){
            return "05";
        }
        if(mm.equals("Jun")){
            return "06";
        }
        if(mm.equals("Jul")){
            return "07";
        }
        if(mm.equals("Aug")){
            return "08";
        }
        if(mm.equals("Sep")){
            return "09";
        }
        if(mm.equals("Oct")){
            return "10";
        }
        if(mm.equals("Nov")){
            return "11";
        }
       else return "12";
    }
    public String date(String dd){
        if(dd.length()==3){
            return "0"+dd.charAt(0);
        }
        else return dd.substring(0,2);
    }

    public static void main(String[] args){
        String s = "20th Oct 2052";
        ReformatDate rd = new ReformatDate();
        System.out.println(rd.reformatDate(s));
        System.out.println(rd.reformatD(s));
    }
}
