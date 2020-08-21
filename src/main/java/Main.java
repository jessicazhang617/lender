public class Main {
<<<<<<< HEAD
    static Loan[] Loans = new Loan[100];
    static int loansCount = 0;

    public static void addLoan(String borrower, int amount, double interestRate){
        Loan loan = new Loan (borrower,amount,interestRate);
        Loans[loansCount] = loan;
        loansCount++;
    }

    public static void setAsPaid(String borrower){
        for (int i=0; i< loansCount; i++){
            Loan loan = Loans[i];
            if (loan.getBorrower().equals(borrower)){
                loan.setPaid();
            }
        }
    }

    public static void listLoans(){
        for (int i=0; i< loansCount; i++){
            if (!isPaid[i]){
                System.out.println(borrowers[i] + ": " + amounts[i]);
            }
        }
    }

    public static double calculateProfitEarned(){
        double profit = 0;
        for (int i=0; i< loansCount; i++){
            // if the loan was repaid, add the interest to profit
            if (isPaid[i]){
                profit = profit + (amounts[i] * interestRates[i]);
            }
        }
        return profit;
    }
=======
>>>>>>> 589024651f7c981ee5c67a73f05ff653573375d0

    public static void main(String[] args) {
        LoanManager m1 = new LoanManager();
        m1.addLoan("Alice Betsy", 10, 0.1);
        m1.addLoan("Ben Chee", 20, 0.2);
        m1.addLoan("Chris Davis", 30, 0.3);
        m1.setAsPaid("Ben Chee");
        m1.listLoans();
        System.out.println("profit from m1: " + m1.calculateProfitEarned());

        LoanManager m2 = new LoanManager();
        m2.addLoan("Alice Betsy", 500, 0.05);
        m2.addLoan("Emily Hee", 25, 0.15);
        m2.setAsPaid("Alice Betsy");
        m2.listLoans();
        System.out.println("profit from m2: " + m2.calculateProfitEarned());
    }
}
