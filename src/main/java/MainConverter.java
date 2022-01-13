import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) throws IOException {
//        double usd=0.0;
//        double ils=0.0;
//        int restart = 1;
//        double No=2.0;
//        String filePath= "ConverterHistory.txt";
//        char choice=0;
//        boolean Yes = true;
//
//        System.out.println("Welcome to userInput converter \n Please choose one of the options below \n 1.Dollars to Shekals \n 2.Shekals to Dollars");
//        do {
//            int firstInput=0;
//            try {                                           // the hall cod is in try/catch and,an Exception will cause a restart in any point of the program.
//                Scanner userInput = new Scanner(System.in);
//                firstInput = userInput.nextInt();
//                if (firstInput!=1.0 && firstInput!= 2.0){ //  this message  will appear if the user inputs any other number other than 1 or 2
//                    // however i did not find how to make it return to the start
//                    System.out.println("Wrong input try again");
//                    Scanner reset= new Scanner(System.in);
//                    userInput=userInput.reset();
//                }
//
//                switch (firstInput) {  // 1st option of converter usd to ils
//                    case 1:
//                        System.out.println("Enter amount of USD to convert");
//                        Scanner usdInput = new Scanner(System.in);
//                        usd = usdInput.nextDouble();
//                        double usdOutCome = new USD().calculate(usd); //
//                        System.out.println(usdOutCome); /// will print the result after convertion
//                        ArrayList<Double> usdOutComeList = new ArrayList<>();
//                        usdOutComeList.add(usdOutCome);
//
//                          // This will print of the user does not want to start over,need to input the number 2 twice in order for the program to finish properly
//
//                        break;
//
//                    case 2:   // option 2 , conver from ILS to USD
//                        System.out.println("Enter amount of ILS to convert");
//                        Scanner ilsInput= new Scanner(System.in);
//                        ils = ilsInput.nextDouble();
//                        double ilsOutCome= new ILS().calculate(ils);
//                        System.out.println(ilsOutCome);
//                        ArrayList<Double> ilsOutComeList = new ArrayList<>();
//                        ilsOutComeList.add(ilsOutCome);
//
//                        break;
//
//                }
//                System.out.println("Do you want to start over? \n 1.Yes \n 2.No");
//                 if (userInput.nextDouble()==2){
//                     System.out.println("Thanks for using Currency Converter\n Your results are waiting in the text file");
//                  String content =new String(Files.readAllBytes(Paths.get(filePath)));
//                     System.out.println(content);
//
//                 }
//
//
//                break;
//
//
//
//            }catch (InputMismatchException exception){
//                exception.printStackTrace();
//                System.out.println("Wrong input please try again");
//                Scanner scanner = new Scanner(System.in);
//                scanner=scanner.reset();
//
//            }
//
//
//        }while (Yes);
//    }

        //////////
        double usd=0.0;
        double ils=0.0;
        int restart = 1;
        double Yes=1.0;
        double No=2.0;
        String filePath= "Converter History";
boolean choice= true;
        System.out.println("Welcome to userInput converter");
        do {
            int firstInput=0;
            System.out.println("Please choose an option (1/2)");
            System.out.println("1.Dollars to Shekals");
            System.out.println("2.Shekals to Dollars");
            try {                                           // the hall cod is in try/catch and,an Exception will cause a restart in any point of the program.
                Scanner userInput = new Scanner(System.in);
                firstInput = userInput.nextInt();
                if (firstInput != 1.0 && firstInput != 2.0) { //  this message  will appear if the user inputs any other number other than 1 or 2
                    // however i did not find how to make it return to the start
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
                        if (usdInput.nextDouble() == 2.0) {  // This will print of the user does not want to start over,need to input the number 2 twice in order for the program to finish properly
                            System.out.println("Thanks for using our currency converter\n Your results are: "+usdOutComeList);
                            Files.writeString(Path.of(filePath), "Your results are" + usdOutComeList);
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
                            break;

                        }
                        break;


                }

            }catch (InputMismatchException | IOException exception){
                exception.printStackTrace();
                System.out.println("Wrong input please try again");
                Scanner scanner = new Scanner(System.in);
                scanner=scanner.reset();

            }

        }while (choice);
    }
}



