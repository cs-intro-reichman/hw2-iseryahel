//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int time = Integer.parseInt(args[1]);
            for (int i = 0 ; i < word.length() ; i++)// running all over the word
            {
                char ch = word.charAt(i);// each time we get new letter in new place
                if ( ch == 'A' || ch=='E' || ch == 'F' || ch == 'H' || ch == 'I' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'O'| ch == 'R' || ch == 'S' ||ch == 'X' ) 
                //cheking the letters are not there, if yes we print the else
                {
                        System.out.println("Give me an " + ch + ": " + ch + "!");
                }
                else
                 System.out.println("Give me a  " + ch + ": " + ch + "!");
            }
             System.out.println("What does that spell?");
             while (time != 0) { // running until time is zero
                System.out.println(word + "!!!");
                time--;
             }
             
        }
}
