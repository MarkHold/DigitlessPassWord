import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {


        System.out.println(solution("a0Ba"));
    }

        public static int solution(String s) {

            String[] arr;

            //array där substrings som ska bort
            ArrayList<String> torem = new ArrayList<>();
            String substring = "";
            String retString = "";
            int retStringSize = -1;
            boolean containsUpper = false;

            /*

            for (int i = 0; i < s.length(); i++) {

                //Om character är en bokstav så lägger den till den i substringen
                if (Character.isLetter(s.charAt(i))) {
                    substring += s.charAt(i);
                }
                else {

                    //och så fort den kommer till ett tal så slutar den lägga till i substringen och sen lägger
                    //substringen i en array, och sedan tömmer substringen
                    arr.add(substring);
                    substring = "";
                }
            }

                */


            //splits the array and takes out all the digits. This replaces the loop above.
            arr = s.split("[0-9]");
            //för varje substring i array
            for (String subStr : arr) {


                for (int i = 0; i < subStr.length(); i++) {
                    //vi loopar genom substringne, om den innehåller en storbokstav, är den okej
                    if (Character.isUpperCase(subStr.charAt(i))) {
                        containsUpper = true;
                    }
                }
                if (!containsUpper) {
                    //om inte, så lägger vi till den i arrayen som ska tas bort
                    torem.add(subStr);

                }
                containsUpper = false;
            }
            //och så tar vi bort alla substrings som inte innehåller en stor bokstav
            //arr.splice(torem);


            for (String subStr: arr) {
                //här kollar vi längden på substringen, om den är längre än -1, så sätter vi längden på den till
                // "retStringSize" dvs talet som skrivs ut,
                if (subStr.length() > retStringSize) {
                    retStringSize = subStr.length();
                    retString = subStr;
                }
            }

            System.out.println(retString);

            return retStringSize;

        }


    }