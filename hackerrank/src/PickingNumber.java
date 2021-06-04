import java.util.*;

public class PickingNumber {
    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4,2,3,4,4,9,98,98,3,3,3,4,2,98,1,98,98,1,1,4,98,2,98,3,9,9,3,1,4,1,98
                ,9,9,2,9,4,2,2,9,98,4,98,1,3,4,9,1,98,98,4,2,3,98,98,1,99,9,98,98,3,98,98,4,98,2,98,4,2,1,1,9,2,4
        )));
    }

    public static int pickingNumbers(List<Integer> a) {
        HashMap<Integer,ArrayList<Integer>> integerArrayListHashMap=new HashMap<>();
        int maxItemSize=0;
        int maxItem = 0;
        for(int item:a){
            ArrayList<Integer> tempList=new ArrayList<>();
            for(int i=0;i<a.size();i++) {
                if(Math.abs(a.get(i)-item)<=1) {
                        tempList.add(a.get(i));
                }
            }
            if(tempList.size()>maxItemSize){
                maxItemSize=tempList.size();
                maxItem=item;
            }
            integerArrayListHashMap.put(item,tempList);
        }
        List<Integer> longestArray=integerArrayListHashMap.get(maxItem);
        Set<Integer> removedItem=new HashSet<>();
        for(int i:longestArray){
            for(int j=0;j<longestArray.size();j++){
                if(Math.abs(longestArray.get(j)-i)>1) {
                    if(longestArray.get(j)>i){
                        removedItem.add(longestArray.get(j));
                    }
                    else{
                        removedItem.add(i);
                    }
                }
            }
        }
        System.out.println(longestArray);
        longestArray.removeAll(removedItem);
        return longestArray.size();
    }
}
