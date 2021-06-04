import java.util.Arrays;
import java.util.List;

public class JumpingCloud {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(Arrays.asList(0,0,1,0,0,1,0)));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int jump=0;
        int currentitem=0;
        while(currentitem<(c.size()-1)){
            if ((currentitem + 2)<c.size() && c.get(currentitem + 2) == 0) {
                    currentitem = currentitem + 2;
                } else {
                    currentitem++;
                }
                jump++;
        }
        return jump;
    }
}
