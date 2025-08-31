package classs_day_04;

import java.util.Scanner;
import java.math.BigInteger;

public class master_program {

    static int n;
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Get user input for single or multiple numbers
        getUserNumbers();

        // Get sequence choice
        System.out.println("Enter your choice (Fib / Trib / Fact):");
        String choice = sc.nextLine();

        switch(choice.toLowerCase()) {
            case "fib":
                printFibonacci();
                break;
            case "trib":
                printTribonacci();
                break;
            case "fact":
                printFactorial();
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }

    // ---------------- Helper Methods ----------------

    // Ask user for single or multiple numbers
    private static void getUserNumbers() {
        System.out.println("Do you want to enter a single number or multiple numbers?");
        System.out.println("Type 1 for single, 2 for multiple:");

        int choiceType = sc.nextInt();
        sc.nextLine(); // consume newline

        if(choiceType == 1){
            System.out.println("Enter the number:");
            n = sc.nextInt();
            sc.nextLine(); // consume newline
        } else if(choiceType == 2){
            System.out.println("How many numbers?");
            int size = sc.nextInt();
            sc.nextLine(); // consume newline
            arr = new int[size];
            System.out.println("Enter " + size + " numbers:");
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            sc.nextLine(); // consume newline
        } else {
            System.out.println("Invalid choice");
            System.exit(0);
        }
    }

    // ---------------- Fibonacci ----------------
    private static void printFibonacci() {
        if(arr != null) {
            for(int num : arr) {
                int a=0, b=1, next;
                System.out.print("Fibonacci sequence for " + num + ": ");
                for(int i=0; i<num; i++) {
                    System.out.print(a + " ");
                    next = a+b;
                    a=b;
                    b=next;
                }
                System.out.println();
            }
        } else {
            int a=0, b=1, next;
            System.out.print("Fibonacci sequence for " + n + ": ");
            for(int i=0; i<n; i++) {
                System.out.print(a + " ");
                next = a+b;
                a=b;
                b=next;
            }
            System.out.println();
        }
    }

    // ---------------- Tribonacci ----------------
    private static void printTribonacci() {
        if(arr != null) {
            for(int num : arr) {
                int a=0, b=0, c=1, next;
                System.out.print("Tribonacci sequence for " + num + ": ");
                for(int i=0; i<num; i++) {
                    System.out.print(a + " ");
                    next = a+b+c;
                    a=b;
                    b=c;
                    c=next;
                }
                System.out.println();
            }
        } else {
            int a=0, b=0, c=1, next;
            System.out.print("Tribonacci sequence for " + n + ": ");
            for(int i=0; i<n; i++) {
                System.out.print(a + " ");
                next = a+b+c;
                a=b;
                b=c;
                c=next;
            }
            System.out.println();
        }
    }

    // ---------------- Factorial ----------------
    private static void printFactorial() {
        if(arr != null) {
            for(int num : arr) {
            	BigInteger fact = BigInteger.ONE;
                for(int i=1; i<=num; i++) fact = fact.multiply(BigInteger.valueOf(i));;
                System.out.println("Factorial of " + num + " is: " + fact);
            }
        } else {
            System.out.println("Do you want factorial as int or BigInteger? (1 for int, 2 for BigInteger)");
            int factType = sc.nextInt();

            if(factType == 1) {
                int fact = 1;
                for(int i=1; i<=n; i++) fact *= i;
                System.out.println("Factorial of " + n + " is: " + fact);
            } else if(factType == 2) {
                BigInteger fact = BigInteger.ONE;
                for(int i=1; i<=n; i++) fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println("Factorial of " + n + " is: " + fact);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
