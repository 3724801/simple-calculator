package finalgui;

import java.io.*;
import java.util.*;

public class Calculator2 {

    static PrintStream TXT;
    static Scanner in = new Scanner(System.in);
    static double num1, num2, num0;

    public static void main(String[] args) throws FileNotFoundException {
        TXT = new PrintStream("\\Users\\yasse_000\\Desktop\\output.txt");
        do {

            int chosennumber = main1();  // main 1 returns X           //chosen number has the value of X

            if (chosennumber == 1) {  // the recall of main menu and comparison
                switch (sub1()) {  //X==1-->sub(),Y==1 ADDITION();   -->-->num1,num2
                    case 1:// y==1
                        // the recall of binary method and comparison
                        // addition operation
                        ADDITION();
                        break;
                    case 2: //y==2
                        // subtraction operation
                        SUBTRACTATION();
                        break;
                    case 3://y==3
                        // multiplication opreration
                        MULTIPLICATION();
                        break;
                    case 4://y==4
                        //division operation
                        DIVISION();
                        break;
                    case 5://y==5
                        //reminder operation
                        REMAINDER();
                        break;

                }

            } // end of binary
            else if (chosennumber == 2) {  //X    2-->3-->NUMBERSQUARED();-->num0
                switch (sub2()) {
                    // recalls unary menu
                    case 1: // z==1
                        NUMBERINCREMENT();
                        break;
                    case 2: //z==2
                        NUMBERDECREMENT();
                        break;
                    case 3: //z==3
                        NUMBERSQUARED();
                        break;
                    case 4://z==4
                        SQUARE_ROOT();
                        break;

                }

            } else if (chosennumber == 0) { // X==0   main1(); X==0
                File history = new File("\\Users\\yasse_000\\Desktop\\output.txt");   // history is just a ame ,,,,,, that has a path
                System.out.println("The History Of The Previous Operations: ");
                Scanner on = new Scanner(history);

                while (on.hasNextLine()) {

                    System.out.println(on.nextLine());
                }

            } else if(chosennumber==-1) { //X==-1
                System.out.println("Program has been terminated");
                TXT.println("Program has been terminated");
                break;
            }
        } while (true);

    }

    public static int main1() {  // main menu
        System.out.println("<CALCULATOR> \n\n"
                + "Enter (1) To Use BINARY OPERATIONS \n"
                + "Enter (2) To Use UNARY OPERATIONS\n"
                + "Enter (0) To Show The History Of The Previous Operations \n"
                + "Enter (-1) To Terminate The Program \n");

        int X = in.nextInt(); // value of main1()

        return X;//////////////
    }

    public static int sub1() {  // binary submenu
        String line = "BINARY OPERATIONS Are Selected.  \n "
                + "Please Identify Which Operation You Are Going To Use By Entering It's Number. \n\n "
                + "1- ADDITION \n"
                + "2- SUBTRACTATION \n"
                + "3- MULTIPLICATION \n"
                + "4- DIVISION \n"
                + "5- REMAINDER \n";
        System.out.println(line);
        int Y = in.nextInt();
        return Y;/////////////
    }

    public static void ADDITION() {   //y==1-->addition(),a==2-->
        System.out.println("ADDITION OPERATION Is Selected.\n"
                + "1- Add Two Numbers \n"
                + "2- Add Two 2D Array \n");
        int A = in.nextInt();
        if (A == 1) {
            System.out.println("Adding Two Numbers Is Selected \n"
                    + "Enter The First Number: ");
            num1 = in.nextDouble();
            System.out.println("Enter The Second Number: ");
            num2 = in.nextDouble();
            double result = num1 + num2;
            System.out.println("THE RESULT IS :");
            System.out.println(result + "\n");  // prints in console
            TXT.println(num1 + " + " + num2 + " = " + result); // prints in FILE
        } else if (A == 2) {
            System.out.println("Adding Two 2D Arrays Is Selected \n"
                    + "Enter The Number Of Rows ");
            int r = in.nextInt();
            System.out.println("Enter The Number Of Columns ");
            int c = in.nextInt();
            int ar1[][] = new int[r][c];///
            System.out.println("Please Enter The Values Of The First 2D Array");

            for (int i = 0; i < r; i++) {  // for filling rows  

                for (int j = 0; j < c; j++) {  // for filling columns

                    ar1[i][j] = in.nextInt();   // 1 ,2
                    TXT.println(ar1[i][j]);     // 3  ,4
                }
            }

            int ar2[][] = new int[r][c];
            System.out.println("Please Enter The Values Of The Second 2D Array");
            for (int i = 0; i < r; i++) {  // for filling rows

                for (int j = 0; j < c; j++) {  // for filling columns

                    ar2[i][j] = in.nextInt();  //1,
                    TXT.println(ar2[i][j]);
                }
            }
            int sum[][] = new int[r][c];
            for (int i = 0; i < r; i++) {  // for filling rows

                for (int j = 0; j < c; j++) {  // for filling columns

                    sum[i][j] = ar1[i][j] + ar2[i][j];

                }
            }
            for (int i = 0; i < r; i++) {  // for filling rows

                for (int j = 0; j < c; j++) {  // for filling columns

                    System.out.print(sum[i][j] + " ");
                    TXT.println(sum[i][j] + " " + "\n");
                }
                System.out.println();
                TXT.println();
            }

        }
    }

    public static void SUBTRACTATION() {
        System.out.println("SUBTRACTION OPERATION Is Selected. \n"
                + "Enter The First Number:  ");
        num1 = in.nextDouble();
        System.out.println("Enter The Second Number: ");
        num2 = in.nextDouble();
        double result = num1 - num2;
        System.out.println("THE RESULT IS :");
        System.out.println(result + "\n");
        TXT.println(num1 + " - " + num2 + " = " + result); // prints in FILE
    }

    public static void MULTIPLICATION() {
        System.out.println("MULTIPLICATION OPERATION Is Selected.\n"
                + "Enter The First Number:  ");
        num1 = in.nextDouble();
        System.out.println("Enter The Second Number: ");
        num2 = in.nextDouble();
        double result = num1 * num2;
        System.out.println("THE RESULT IS :");
        System.out.println(result + "\n");
        TXT.println(num1 + " * " + num2 + " = " + result); // prints in FILE
    }

    public static void DIVISION() {
        System.out.println("DIVISION OPERATION Is Selected.\n"
                + "Enter The First Number:  ");
        num1 = in.nextDouble();
        System.out.println("Enter The Second Number: ");
        num2 = in.nextDouble();

        if (num2 == 0) {
            System.out.println("INDIVISIBLE BY ZERO");
            TXT.println(num1 + " / " + num2 + " IS INDIVISIBLE BY ZERO \n"); // prints in FILE
        } else {
            double result = num1 / num2;
            System.out.println("THE RESULT IS :");
            System.out.println(result + "\n");
            TXT.println(num1 + " / " + num2 + " = " + result); // prints in FILE
        }
    }

    public static void REMAINDER() {
        System.out.println("REMAINDER OPERATION Is Selected.\n"
                + "Enter The First Number:  ");
        num1 = in.nextDouble();
        System.out.println("Enter The Second Number: ");
        num2 = in.nextDouble();
        double result = num1 % num2;
        System.out.println("THE RESULT IS :");
        System.out.println(result + "\n");
        TXT.println(num1 + " % " + num2 + " = " + result); // prints in FILE
    }
    //// the end of binary methods and the beginning of uniary

    public static int sub2() {  // uniary submenu
        String line2 = "UNARY OPERATIONS Are Selected. \n  "
                + "Please Identify Which Operation You Are Going To Use By Entering It's Number. \n\n "
                + "1- NUMBER INCREMENT \n"
                + "2- NUMBER DECREMENT\n"
                + "3- NUMBER SQUARED\n"
                + "4- SQUARE-ROOT \n ";
        System.out.println(line2);

        int Z = in.nextInt();
        return Z;/////////////////////
    }

    public static void NUMBERINCREMENT() {
        System.out.println("NUMBER INCREMENT OPERATION Is Selected.\n"
                + "Enter Just One Number:");
        num0 = in.nextDouble();

        System.out.println("THE RESULT IS :");
        System.out.println(++num0 + "\n");
        TXT.println(num0 + " + " + "1" + " = " + ++num0); // prints in FILE
    }

    public static void NUMBERDECREMENT() {
        System.out.println("NUMBER DECREMENT OPERATION Is Selected.\n"
                + "Enter Just One Number:");
        num0 = in.nextDouble();

        System.out.println("THE RESULT IS :");
        System.out.println(--num0 + "\n");
        TXT.println(num0 + " - " + "1" + " = " + --num0); // prints in FILE
    }

    public static void NUMBERSQUARED() {
        System.out.println("NUMBER SQUARING OPERATION Is Selected.\n"
                + "Enter Just One Number:");
        num0 = in.nextDouble();

        System.out.println("THE RESULT IS :");
        System.out.println(Math.pow(num0, 2) + "\n");
        TXT.println(num0 + " ^ " + "2" + " = " + Math.pow(num0, 2)); // prints in FILE
    }

    public static void SQUARE_ROOT() {
        System.out.println("SQUARE ROOT OPERATION Is Selected.\n"
                + "Enter Just One Number:");
        num0 = in.nextDouble();
        if (num0 < 0) {
            System.out.println("Can not Root Square a Negative Number \n");
            TXT.println(num0 + " Can not Be Root Squared as it's a Negative Number"); // prints in FILE
        } else {
            System.out.println("THE RESULT IS :");
            System.out.println(Math.sqrt(num0) + "\n");  //SQRT(4)=2 
            TXT.println("SQRT" + "(" + num0 + ")" + " = " + Math.sqrt(num0)); // prints in FILE
        }
    }
}
