public class Cart {

    public static void sayGoodbye() {
        System.out.println("Thanks for using Famazon Cart!");
    }

    public static void sayHello() {
        System.out.println("Famazon Cart v 1.0 *started*");
    }

    public static void main(String[] arguments) {
        sayHello();
        boolean doWeHaveArguments = false;
        //String argsLength = arguments.length.toString();
        // bad code, fixing below
        int length = arguments.length;

        // counter: starting lap
        // condition: if counter <= arguments.length then... do { block }
        // finally, after the { block } of code, countrer++
        // repeat until condition is met
        for (int counter = 0; counter < arguments.length; counter++) {
           System.out.println(counter + arguments[counter]);
        }

        if (length > 1) {
            doWeHaveArguments = true;
        }

        System.out.println(length);
        System.out.println(doWeHaveArguments);

        if (doWeHaveArguments == true) {
            // if true, let the user know
            // awesome but they are not needed
            System.out.println("Thanks but we don't need arguments");
        } else {
            // otherwise let them know thanks
            // for not spamming
            System.out.println("Thanks for not spamming! :)");
        }
    }

}