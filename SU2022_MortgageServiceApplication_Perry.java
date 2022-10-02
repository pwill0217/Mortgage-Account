import java.util.Scanner;

public class SU2022_MortgageServiceApplication_Perry {

    public static void main(String[] args) {

        int n = -1;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        SU2022_MortgageAccount_Perry mRef = null;
        while (n != 0) {
            System.out.println("File: SU2022_MortgageServiceApplication_Perry.java - ");
            System.out.println("MENU OF MORTGAGE SERVICE");
            System.out.println("-----------------------------------------------------");
            System.out.println("1.Calculate the Mortage Monthly Payment"
                    + "\n2.Open Account for Mortage Service" +
                    "\n3.Check Interest Rate of current Mortage Account" +
                    "\n4.Check Current Principal of current Mortage Account" +
                    "\n5.Monthly Payment Process" +
                    "\n0.Exit");
            n = sc.nextInt();

            if (n == 1) {
                mRef = new SU2022_MortgageAccount_Perry();
                System.out.print("Enter your last name: ");
                mRef.setLast_name(sc.next());
                System.out.print("Enter your first name: ");
                mRef.setFirst_name(sc.next());
                System.out.print("Enter number of payments: ");
                mRef.setNum_of_payments(sc.nextInt());
                System.out.print("Enter Principal: ");
                mRef.setPrincipal(sc.nextFloat());
                ;
                System.out.print("Enter Interest Rate: ");
                mRef.setInterest_rate(sc.nextFloat());
                mRef.calculateMonthlyPayment();
                System.out.println("ESTIMATE PAYMENT");

                System.out.printf("%-20s %10s\n", "Name:", (mRef.getLast_name() + ", " + mRef.getFirst_name()));
                System.out.printf("%-20s %10d\n", "Number of payments:", mRef.getNum_of_payments());
                System.out.printf("%-20s %10.3f\n", "Principal:", mRef.getPrincipal());
                System.out.printf("%-20s %10.3f\n", "Interest Rate:", mRef.getInterest_rate());
                System.out.printf("%-20s %10.3f\n", "Monthly Payment:", mRef.getMonthly_payment());

            } else if (n == 2) {
                mRef = new SU2022_MortgageAccount_Perry();
                System.out.print("Enter your last name: ");
                mRef.setLast_name(sc.next());
                System.out.print("Enter your first name: ");
                mRef.setFirst_name(sc.next());
                System.out.print("Enter number of payments: ");
                mRef.setNum_of_payments(sc.nextInt());
                System.out.print("Enter Principal: ");
                mRef.setPrincipal(sc.nextFloat());
                ;
                System.out.print("Enter Interest Rate: ");
                mRef.setInterest_rate(sc.nextFloat());
                mRef.calculateMonthlyPayment();
                mRef.setAccount_number("1234567890");
                System.out.println("OPEN NEW ACCOUNT");

                System.out.printf("%-20s %10s\n", "Account Number:", mRef.getAccount_number());
                System.out.printf("%-20s %10s\n", "Name:", (mRef.getLast_name() + ", " + mRef.getFirst_name()));
                System.out.printf("%-20s %10.3f\n", "Principal:", mRef.getPrincipal());
                System.out.printf("%-20s %10d\n", "Number of payments:", mRef.getNum_of_payments());
                System.out.printf("%-20s %10s\n", "Interest Rate:", String.valueOf(mRef.getInterest_rate()) + "%");
                System.out.printf("%-20s %10.3f\n", "Monthly Payment:", mRef.getMonthly_payment());
            } else if (n == 3) {
                if (mRef == null) {
                    System.out.println("The account could not be created, cannot check Interest rate");
                } else {
                    System.out.println("Enter account number: ");
                    String acc = sc.next();

                    if (acc.equals(mRef.getAccount_number())) {
                        System.out.printf("%-20s %10s\n", "Account Number:", mRef.getAccount_number());
                        System.out.printf("%-20s %10.3f\n", "Interest rate:", mRef.getInterest_rate());
                    } else {
                        System.out.println("You enter the number: " + acc);
                        System.out.println("Incorrect correct account number");
                    }
                }
            } else if (n == 4) {
                if (mRef == null) {
                    System.out.println("The account could not be created, cannot check Interest rate");
                } else {
                    System.out.println("Enter account number: ");
                    String acc = sc.next();

                    if (acc.equals(mRef.getAccount_number())) {
                        System.out.printf("%-20s %10s\n", "Account Number:", mRef.getAccount_number());
                        System.out.printf("%-20s %10.3f\n", "Current Principal:", mRef.getPrincipal());
                    } else {
                        System.out.println("Enter the account number: " + acc);
                        System.out.println("You did not enter correct account number");
                    }
                }
            } else if (n == 5) {
                if (mRef == null) {
                    System.out.println("The account could not be created, cannot check Interest rate");
                } else {
                    System.out.println("Enter account number: ");
                    String acc = sc.next();
                    if (acc.equals(mRef.getAccount_number())) {
                        System.out.println("Enter amount you have to pay: ");
                        float amt = sc.nextFloat();
                        System.out.println("MONTHLY PROCESS PAYMENT");

                        System.out.printf("%-20s %10s\n", "Account Number:", mRef.getAccount_number());
                        System.out.printf("%-20s %10.3f\n", "Principal:", mRef.getPrincipal());
                        System.out.printf("%-20s %10.3f%s\n", "Interest rate:", mRef.getInterest_rate(), "%");
                        System.out.printf("%-20s %10.3f\n", "Monthly Payment:", mRef.getMonthly_payment());
                        System.out.printf("%-20s %10.3f\n", "Amount you pay:", amt);
                        System.out.printf("%-20s %10s\n", "Principal:", mRef.processPayment(amt));

                    } else {

                        System.out.println("You enter the number: " + acc);
                        System.out.println("Incorrect account number");
                    }
                }
            } else {
                System.out.println("Enter number again, between 1 to 4; enter 0 to exit");
            }
        }
    }
}
