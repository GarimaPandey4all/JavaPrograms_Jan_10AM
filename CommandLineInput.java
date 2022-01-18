class CommandLineInput {

    public static void main(String[] args) {

        //dynamic way of initialization, command line input
        
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int result = firstNumber + secondNumber;

        System.out.println("Sum is: "+result);

    }
    
}
