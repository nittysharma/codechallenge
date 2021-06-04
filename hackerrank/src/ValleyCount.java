public class ValleyCount {
    public static void main(String[] args) {
        System.out.println(getValleyCount(8,"UDDDUDUU"));
    }
    static int getValleyCount(int steps,String path){
        int seaLevel=0;
        int countValley=0;
        for(char c:path.toCharArray())
        {
            switch (c){ //UDDDU
                case 'U':
                    if(seaLevel==-1){
                        countValley++; //1
                    }
                    seaLevel++;
                    break;
                case 'D':
                    seaLevel--;
                    break;
            }
        }
        return countValley;
    }
}
