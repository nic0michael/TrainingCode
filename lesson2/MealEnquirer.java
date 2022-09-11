import java.io.*;

public class MealEnquirer{

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        // your code goes here
        System.out.println("What is your favourite meal : ");
        String favouriteMeal = reader.readLine();
        System.out.println("Your favourite meal is : "+ favouriteMeal);
   
    }
}
