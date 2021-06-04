import java.util.Arrays;
import java.util.List;

public class ElectricShop {
    public static void main(String[] args) {
        System.out.println(getMoneySpent(60, new int[]{40,50,60},new int[]{5,8,12}));
    }


    static int getMoneySpent(int b, int[] keyboards, int[] drivers){
        int lastBest=-1;
        for(int k:keyboards){
            for(int d:drivers){
                if((k+d)>lastBest && (k+d)<=b){
                    lastBest=k+d; //58
                }
            }
        }
        return lastBest;
    }
}
