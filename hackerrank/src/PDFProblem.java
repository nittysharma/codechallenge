import java.util.Arrays;
import java.util.List;

public class PDFProblem {
    public static void main(String[] args) {
        System.out.println(designerPdfViewer(Arrays.asList(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5),"abc"));
    }
    public static int designerPdfViewer(List<Integer> h, String word) {
        int area=0;
        int maxheight=0;
        for(char c:word.toCharArray()){
            int currentAscii=(int) c;
            if(maxheight<h.get(currentAscii-97)){
                maxheight=h.get(currentAscii-97);
            }
        }
        return maxheight*(word.length());
    }
}
