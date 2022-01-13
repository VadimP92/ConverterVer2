import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) throws IOException {
        double usd;
        double ils;
        int restart = 1;
        double Yes=1.0;
        double No=2.0;
        String filePath= "Converter History";
boolean choice= true;
        System.out.println("Welcome to userInput converter");
        do {
            int firstInput;
            System.out.println("Please choose an option (1/2)");
            System.out.println("1.Dollars to Shekals");
            System.out.println("2.Shekals to Dollars");
            try {                                           // the hall cod is in try/catch and,an Exception will cause a restart in any point of the program.
                Scanner userInput = new Scanner(System.in);
                firstInput = userInput.nextInt();
                if (firstInput != 1.0 && firstInput != 2.0) { //  this message  will appear if the user inputs any other number other than 1 or 2

                    System.out.println("Wrong input try again");
                    Scanner reset = new Scanner(System.in);
                    userInput = userInput.reset();
                }

                switch (firstInput) {  // 1st option of converter usd to ils
                    case 1:
                        System.out.println("Enter amount of USD to convert");
                        Scanner usdInput = new Scanner(System.in);
                        usd = usdInput.nextDouble();
                        double usdOutCome = new USD().calculate(usd); //
                        System.out.println(usdOutCome); /// will print the result after convertion
                        ArrayList<Double> usdOutComeList = new ArrayList<>();
                        usdOutComeList.add(usdOutCome);
                        System.out.println("Start over 1.Yes/2.No");
                        if (usdInput.nextDouble() == 2.0) {  // This will print of the user does not want to start over
                            System.out.println("Thanks for using our currency converter\n Your results are: "+usdOutComeList);
                            Files.writeString(Path.of(filePath), "Your results are" + usdOutComeList);
                            choice=false;
                            break;
                        }
                        break;

                    case 2:   // option 2 , conver from ILS to USD
                        System.out.println("Enter amount of ILS to convert");
                        Scanner ilsInput = new Scanner(System.in);
                        ils = ilsInput.nextDouble();
                        double ilsOutCome = new ILS().calculate(ils);
                        System.out.println(ilsOutCome);
                        ArrayList<Double> ilsOutComeList = new ArrayList<>();
                        ilsOutComeList.add(ilsOutCome);
                        System.out.println("Start over 1.Yes / 2.No");
                        if (ilsInput.nextDouble() == 2.0) { // this opetion will print if the user does not want to start over
                            System.out.println("Thanks for using our currency converter \n Your results are:"+ ilsOutComeList);
                            Files.writeString(Path.of(filePath), "Your results are" + ilsOutComeList);
                            choice=false;
                            break;

                        }
                        break;

                }

            }catch (InputMismatchException | IOException exception){ // this will catch and exceptions and will restart the program
                exception.printStackTrace();
                System.out.println("Wrong input please try again");
                Scanner scanner = new Scanner(System.in);
                scanner=scanner.reset();

            }

        }while (choice); //
    }
}



