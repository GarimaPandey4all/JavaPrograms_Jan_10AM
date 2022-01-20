class CommandLineInput {

    public static void main(String[] args) {

        //dynamic way of initialization, command line input
        // if-else 
        //Conditional Statements 

        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            int result = firstNumber + secondNumber;

            System.out.println("Sum is: "+result);
        }
        else {
            System.out.println("Invalid Input");
        }

    }
    
}
