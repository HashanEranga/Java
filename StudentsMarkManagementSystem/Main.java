package StudentsMarkManagementSystem;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        LoadInitialWindow();
    }
    

    private static void LoadInitialWindow() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|                  WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                   |");
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("[1] Add New Student                     [2] Add New Student With Marks");
        System.out.println("[3] Add Marks                           [4] Update Student Details");
        System.out.println("[5] Upadate Marks                       [6] Delete Student ");
        System.out.println("[7] Print Student Details               [8] Print Student Ranks ");
        System.out.println("[9] Best in Programming Fundamentals    [10] Best in Database Management System");

        System.out.println();
        System.out.print("Enter an  option to continue > ");

        try{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            // System.out.println(input);
            switch(input){
                case 1: 
                    System.out.println(input + " option selected");
                    break;
                
                case 2: 
                    System.out.println(input + " option selected");
                    break;
                    
                case 3: 
                    System.out.println(input + " option selected");
                    break;
                
                case 4: 
                    System.out.println(input + " option selected");
                    break;
    
                case 5: 
                    System.out.println(input + " option selected");
                    break;
    
                case 6: 
                    System.out.println(input + " option selected");
                    break;
    
                case 7: 
                    System.out.println(input + " option selected");
                    break;
    
                case 8: 
                    System.out.println(input + "  option selected");
                    break;
    
                case 9: 
                    System.out.println(input + " option selected");
                    break;
    
                case 10: 
                    System.out.println(input + " option selected");
                    break;
    
                default:
                    System.err.println("Invalid Input");
            }
            sc.close();
        }
        catch(InputMismatchException ex){
            System.out.println("Input should be a number!! Try again.");
            System.out.println("Error : " + ex);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clearConsole();
            LoadInitialWindow();
        }
    }

    public final static void clearConsole() {
        try {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
        } 
        catch (final Exception e) {
            e.printStackTrace();
        // Handle any exceptions.
            }
        }
}

