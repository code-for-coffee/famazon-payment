public class Slime {
    public static void main(String[] args) {

        String userInput = args[0];
        // userInput should equal y, n, Y, N
        switch(userInput) {
            case "Y":
            case "y":
            case "yes":
            case "YES":
            case "oui":
                System.out.println("ok, thank you");
                break;
            case "N":
            case "n":
                System.out.println("ok y not?");
                break;
            default:
                System.out.println("We could not interpret your input??????");
                break;
        }


        String[] friends = {
                "Spoorthi",
                "Jim",
                "Bill",
                "Kevin",
                "Angie"
        };
        // this is an array of Strings
        // aka String[]
        // a list of strings
        // a collection of strings

        // loop through every item in my []
        // list them in terminal
        // declare a counter (incrementor)
        // condition to evaluate to true
        // if true, do { block }
        // counter++; repeat
        for (int counter = 0; counter < friends.length; counter++) {
            System.out.println("Guess who's about to get slimed?!");
            System.out.println(friends[counter]);
            System.out.println(friends[counter] + " JUST GOT SLIMED!!!!");
        } // end for

        String[] pirates = {
                "Captain Jack Sparrow",
                "Blackbeard",
                "Captain Hook",
                "Captain Morgan",
                "Captain CRUNCCCCHHHH",
                "Captain Kangaroo",
                "Captain Canada",
                "Captain Cave Man"
        };

        //System.out.println(friends[0]);
        //System.out.println(friends[1]);
    }
}