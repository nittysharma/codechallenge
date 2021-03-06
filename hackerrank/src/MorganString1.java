import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorganString1 {
    public static void main(String[] args) {
        System.out.println(morganAndString("",""));
    }

    public static String morganAndString(String a, String b) {
        StringBuilder result = new StringBuilder();
        char[] jackChr = a.toCharArray();
        char[] danielChar = b.toCharArray();
        List<Character> jack = new ArrayList<>();
        List<Character> daniel = new ArrayList<>();
        int jackSize = jackChr.length;
        int danielSize = danielChar.length;
        for (int i = 0; i < jackSize; i++) {
            jack.add(i, jackChr[i]);
        }

        for (int i = 0; i < danielSize; i++) {
            daniel.add(i, danielChar[i]);
        }

        int loopCounter = jackSize + danielSize;


        while (loopCounter > 1) {
            if ((int) jack.get(0) == (int) daniel.get(0)) {
                int i = 0;
                while ((int) jack.get(i) == (int) daniel.get(i)) {
                    if (jackSize - 1 == i) {
                        break;
                    }
                    if (danielSize - 1 == i) {
                        break;
                    }
                    i++;
                }
                if ((int) jack.get(i) < (int) daniel.get(i)) {
                    if (daniel.get(0).equals('Z')) {
                        while (jack.get(0).equals('Z')) {
                            result.append(jack.get(0));
                            jack.remove(0);
                            jackSize--;
                        }
                    } else if (jack.get(0).equals('Z')) {
                        while (daniel.get(0).equals('Z')) {
                            result.append(daniel.get(0));
                            daniel.remove(0);
                            danielSize--;
                        }
                    } else {
                        result.append(jack.get(0));
                        jack.remove(0);
                        jackSize--;
                        if (jackSize == 0) {
                            for (Character character : daniel) {
                                result.append(character);
                                danielSize--;
                            }
                            break;
                        }
                    }
                } else {
                    result.append(daniel.get(0));
                    daniel.remove(0);
                    danielSize--;
                    if (danielSize == 0) {
                        for (Character character : jack) {
                            result.append(character);
                            jackSize--;
                        }
                        break;
                    }
                }
            } else {
                if ((int) jack.get(0) < (int) daniel.get(0)) {
                    result.append(jack.get(0));
                    jack.remove(0);
                    jackSize--;
                    if (jackSize == 0) {
                        for (Character character : daniel) {
                            result.append(character);
                            danielSize--;
                        }
                        break;
                    }
                } else {
                    result.append(daniel.get(0));
                    daniel.remove(0);
                    danielSize--;
                    if (danielSize == 0) {
                        for (Character character : jack) {
                            result.append(character);
                            jackSize--;
                        }
                        break;
                    }
                }
            }
            loopCounter--;
        }
        return result.toString();
    }

}

