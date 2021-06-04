import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingSystem {
    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(73, 67, 38,33)));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrade=new ArrayList<>();
        for(int i:grades){
            if(i<38){
                newGrade.add(i);
            }
            else{
                if((5-(i%5))<3){
                    newGrade.add(i+(5-(i%5)));
                }
                else{
                    newGrade.add(i);
                }
            }
        }
        return newGrade;
    }
}
