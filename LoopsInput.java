class LoopsInput {
    public static void main(String[] args) {

            int sum = 0;

            // Loop: Repeatition/Iteration

            //Traditional For Loop or Traditional Way of Loop
            for(int i = 0; i < args.length; i++)
            {
                sum = sum + Integer.parseInt(args[i]);
            }

            System.out.println("Sum is: "+sum);

    }    
}
