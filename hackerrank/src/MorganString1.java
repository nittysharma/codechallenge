import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorganString1 {
    public static void main(String[] args) {
        System.out.println(morganAndString("ABZZA",
                "AZBZA"));
    }
    public static String morganAndString(String a,String b){
        StringBuilder result=new StringBuilder();
        char[] jackChr=a.toCharArray();
        char[] danielChar=b.toCharArray();
        List<char[]> jack= Arrays.asList(jackChr);
        List<char[]> daniel= Arrays.asList(danielChar);
        int loopCounter=jack.size()+daniel.size();
        while(loopCounter<0){
            if(jack.get(0)==daniel.get(0))
            loopCounter--;
        }
        return result.toString();
    }
}

