package templatemethod;

// Abstract class
public abstract class PaymentFlow {

    // Abstract methods
    public abstract void validateRequest();

    public abstract void debitAmount();

    public abstract void calculateFees();

    public abstract void creditAmount();

    // Template method
    public final void sendMoney() {

        // step 1
        validateRequest();

        // step 2
        debitAmount();

        // step 3
        calculateFees();

        // step 4
        creditAmount();
    }

    // Hook method
    protected boolean requiresOTPAuthentication() {
        return false;
    }

    // Common method
    public void logTransaction() {
        System.out.println("Transaction Completed!");
    }
}