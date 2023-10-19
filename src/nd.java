import java.util.Scanner;  // Import the Scanner class

class nd {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("what is your mass?");

        float mass = myObj.nextFloat();  // Read user input

        float Mars = (float) (mass*0.38);
        double z = Mars;
        double p = z;
        int w = (int)(z);
        char y = (char)(w);
        int x = (int) (mass*11.57831325301205);



        System.out.println(mass+"kg on Earth is " + Mars + "kgs on mars");
        System.out.println("Kilogram on Mars after converting to double "+z);
        System.out.println("Kilograms on Mars displayed to four decimal places:"+String.format("%.4f",p));
        System.out.println("Kilograms when casted to integer "+w);
        System.out.println("The ASCII table equivalent  of marsWeightInInt is"+y);
        System.out.println("An example of a mathematical operation on the char type:"+x);
    }
}
