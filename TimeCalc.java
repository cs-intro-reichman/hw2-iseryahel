public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); // getting the hours
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); // getting the miuntes
        int miutesToAdd = Integer.parseInt(args[1]); // how much minutes to add
        minutes = (hours*60) + minutes + miutesToAdd; // sum all in total
        hours = minutes / 60; // gett the hours from the minutes
        int Newhours = hours % 24; // set the new hours
        int NewMinutes= minutes - (hours * 60); // set the new minutes
        if (NewMinutes < 10){ // checking if need to add 0
            if (Newhours < 10){ // checking if need to add 0
                System.out.println("0" +Newhours+":0" + NewMinutes);
            }
            else
                System.out.println(Newhours+":0" + NewMinutes);
        }
        else if (Newhours < 10) // checking if need to add 0
            System.out.println( "0" +Newhours+":" + NewMinutes);
            else
                System.out.println(Newhours+":" + NewMinutes); // print with no conditions
        
        



    }

}