import java.util.Arrays;

public class MorganString {
    public static void main(String[] args) {
        System.out.println(morganAndString1("SLJZTSQGLZSQZY",
                "ZUQFZASZZFJFMMNLM"));
    }

    public static String morganAndString1(String a, String b) {
        StringBuilder result = new StringBuilder();
        char[] jack = a.toCharArray();
        char[] daniel = b.toCharArray();
        int loopCount = jack.length + daniel.length;
        while (loopCount >= 0) {
            if ((int) jack[0] < (int) daniel[0]) {
                result.append(jack[0]);
                if(jack.length!=1) {
                    jack = Arrays.copyOfRange(jack, 1, jack.length - 1);
                }
            }
        else{
                result.append(daniel[0]);
                if(daniel.length!=1) {
                    daniel = Arrays.copyOfRange(jack, 1, daniel.length - 1);
                }
        }
                loopCount--;
            }
            return result.toString();
        }

        public static String morganAndString (String a, String b){
            StringBuilder result = new StringBuilder();
            int loopCount;
            int jackIndex = 0;
            int danielIndex = 0;
            boolean jackTurn = true;
            char[] jack = a.toCharArray();
            char[] daniel = b.toCharArray();
            loopCount = jack.length + daniel.length;
            while (loopCount >= 0) {
                if ((int) jack[jackIndex] == (int) daniel[danielIndex]) {
                    if (jackTurn) {
                        result.append(jack[jackIndex]);
                        if (jack.length - 1 == jackIndex) {
                            break;
                        }
                        jackIndex++;
                    } else {
                        result.append(daniel[danielIndex]);
                        if (daniel.length - 1 == danielIndex) {
                            break;
                        }
                        danielIndex++;
                    }
                } else if ((int) jack[jackIndex] < (int) daniel[danielIndex]) {
                    result.append(jack[jackIndex]);
                    if (jack.length - 1 == jackIndex) {
                        break;
                    }
                    jackIndex++;
                } else {
                    result.append(daniel[danielIndex]);
                    if (daniel.length - 1 == danielIndex) {
                        break;
                    }
                    danielIndex++;
                }
                loopCount--;
                jackTurn = !jackTurn;
            }
            if (jackIndex < jack.length - 1) {
                result.append(a.substring(jackIndex));
            } else {
                result.append(b.substring(danielIndex));
            }
            return result.toString();
        }

}
