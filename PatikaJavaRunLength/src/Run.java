public class Run {
    public String runLengthEncoding(String text) {
        String encodedString = "";

        for (int i = 0, count = 1; i < text.length(); i++) {
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1))
                count++;
            else {
                encodedString = encodedString.concat(Integer.toString(count))
                        .concat(Character.toString(text.charAt(i)));
                count = 1;
            }
        }
        return encodedString;
    }

    public String encode(String sampleInput) {
        String encodedString = null;
        //get the input to a character array.
        //  String  sampleInput = "aabbcccd";
        char[] charArr = sampleInput.toCharArray();
        char prev = (char) 0;
        int counter = 1;
        //compare each element with its next element and
        //if same increment the counter
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {

            if (i + 1 < charArr.length && charArr[i] == charArr[i + 1]) {
                counter++;
            } else {
                //System.out.print(counter + Character.toString(charArr[i]));
                sb.append(counter + Character.toString(charArr[i]));
                counter = 1;
            }

        }
        return sb.toString();
    }
/*    import java.util.*;
import java.io.*;

    class Main {

        public static String RunLength(String str) {
            String newWord="";
            char[] charArr=str.toCharArray();
            char prev=(char)0;
            int a=1;
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0;i<charArr.length;i++){
                if(i+1<charArr.length&&charArr[i]==charArr[i+1]){
                    a++;
                }else{
                    stringBuilder.append(a+Character.toString(charArr[i]));
                    a=1;
                }
            }
            return stringBuilder.toString();
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(RunLength(s.nextLine()));
        }

    }*/
}
