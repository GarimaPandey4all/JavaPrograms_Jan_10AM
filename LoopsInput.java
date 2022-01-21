class LoopsInput {
    public static void main(String[] args) {

            int sum = 0;

            // Loop: Repeatition/Iteration

            //Traditional For Loop or Traditional Way of Loop
            // for(int i = 0; i < args.length; i++)// i = 0, 1, 2, 3, 4
            // {
            //     sum = sum + Integer.parseInt(args[i]);// 100, 300, 600, 1000
            // }

            // for(int i = 1; i <= 20; i++)
            // {
            //     System.out.println("Hello World");
            // }

            //Enhanced For Loop, only it is used to read the array(args)
            for(String value : args)
            {
                sum = sum + Integer.parseInt(value);
            }

            System.out.println("Sum is: "+sum); // 1000

    }    
}
