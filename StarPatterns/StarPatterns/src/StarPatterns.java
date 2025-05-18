import java.util.Scanner;

class StarPatterns {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Left triangle
        // * 
        // * *
        // * * *
        // * * * *
        // * * * * *
        System.out.println("Enter the number of rows for left triangle: ");

        int rowsL = input.nextInt();

        for(int i=1; i<=rowsL; i++){

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Right triangle
        //          *
        //        * *
        //      * * *
        //    * * * *
        //  * * * * *

        System.out.println("\nEnter the number of rows for right triangle: ");

        int rowsR = input.nextInt();

        for(int i =1; i<=rowsR; i++){
            for (int j = rowsR - i; j >= 1; j--) {
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++){

                System.out.print(" *");
            }

            System.out.println();
        }


        //Pyramid triangle
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        System.out.println("\nEnter the number of rows for pyramid triangle: ");

        int rowsP = input.nextInt();

        for(int i=1; i<=rowsP; i++){
            //print spaces
            for(int j = rowsP - i; j >= 1; j--){
                System.out.print(" ");
            }

            //print stars
            for(int k = 1; k <= ( 2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Inverted pyramid
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        System.out.println("\nEnter the number of rows for inverted pyramid triangle: ");

        int rowsI = input.nextInt();

        for(int i = rowsI; i>=1; i--){
            for(int j = rowsI - i ; j>=1; j--){
                System.out.print(" ");
            }

            for(int k=1; k<= (2*i-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }


    }


}



