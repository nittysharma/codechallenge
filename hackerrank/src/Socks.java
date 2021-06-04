import java.util.*;
public class Socks{
public static void main(String args[]){
    System.out.println(sockMethodRachna(9,Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20,50)));
    System.out.println(sockMethod(9,Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20,50)));
}

public static Integer sockMethod(Integer n, List<Integer> ar){
    int result=0;
    Map<Integer,Integer> valueMap=new HashMap<>();
    for(Integer item:ar){
    int x=0;
    if(valueMap.containsKey(item)){
         x= valueMap.get(item);
    }
    valueMap.put(item,x+1);
    }

for(Map.Entry<Integer,Integer> set: valueMap.entrySet()){
         result=result+(set.getValue()/2);
}

return result;
}


    public static Integer sockMethodRachna(Integer n, List<Integer> ar){
        int result=0;
        HashSet<Integer> valueSet=new HashSet<>();
        for(Integer item:ar){
            if(valueSet.contains(item)){
                result++;
                valueSet.remove(item);
            }
            else{
                valueSet.add(item);
            }
        }
        return result;
    }
}
