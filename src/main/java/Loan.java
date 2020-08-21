public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    public static int maxLoanAmount = 0;

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;

        if (amount > maxLoanAmount) {
            maxLoanAmount = amount;
        }
    }

    public static int getMaxLoanAmount {
        return maxLoanAmount;
    }


    public String getBorrower() {
        return borrower;
    }

    public void setPaid() {
        isPaid = true;
    }

    public boolean isPaid {
        return isPaid;
    }

}
