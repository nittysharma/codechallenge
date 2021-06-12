import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleOrange {
    public static void main(String[] args) {
        List<Integer> aList=new ArrayList<>();
        aList.add(-2);
        aList.add(2);
        aList.add(1);
        List<Integer> bList=new ArrayList<>();
        bList.add(5);
        bList.add(-6);
            countApplesAndOranges(7,11,5,15, aList,bList);
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount=0;
        int orangeCount=0;
        List<Integer> aListDash=new ArrayList<>();
        List<Integer> bListDash=new ArrayList<>();
        for(int apple:apples){
            if(s<=apple+a && apple+a<=t)
                appleCount++;
        }
        for(int orange:oranges){
            if(s<=orange+b && orange+b<=t)
                orangeCount++;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
