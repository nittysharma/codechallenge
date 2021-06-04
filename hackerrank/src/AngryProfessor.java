import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        System.out.println(angryProfessor(2, Arrays.asList(-0,-1,2,1)));
    }
    public static String angryProfessor(int k, List<Integer> a) {
        int onTimeCount=0;
        for(int currentStudent:a){
            if(currentStudent<=0){
                onTimeCount++;
            }
            if(onTimeCount==k) {
                return "NO";
            }
        }
        return "YES";
    }
}
