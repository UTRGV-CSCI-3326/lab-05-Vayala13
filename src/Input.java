import java.util.Scanner;
public class Input{
    static public void main(String[] args){
        //Declaring object Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Get and store the user's name. (Store as text)
        System.out.println(" Please enter your first name, followed by the ENTER button: ");
        String userName = scanner.nextLine();

        //Get and store the user's age, (Store as a whole number)
        System.out.println(" Please enter your age, followed by the ENTER button: ");
        int age = scanner.nextInt();

        //Get and store the user's weight. (Store it as a real number)
        System.out.println(" Please enter your weight (including decimals) followed by the ENTER button: ");
        double weight = scanner.nextDouble();


        //Get and store is the user is a smoker. (Store it as either true or false)
        System.out.println(" Please enter the word 'true' for smoker and 'false' for non-smoker, then press ENTER: ");    
        Boolean smoker = scanner.nextBoolean();
    
    }
}
