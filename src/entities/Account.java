package entities;

public class Account {
    private String clientName;
    private String clientAccountNumber;
    private double clientBalance;
    private double clientLimit;

    public Account(String clientName, String clientAccountNumber, double clientBalance, double clientLimit) {
        this.clientName = clientName;
        this.clientAccountNumber = clientAccountNumber;
        this.clientBalance = clientBalance;
        this.clientLimit = clientLimit;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(String clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    public double getClientBalance() {
        return clientBalance;
    }

    public void setClientBalance(double clientBalance) {
        this.clientBalance = clientBalance;
    }

    public double getClientLimit() {
        return clientLimit;
    }

    public void setClientLimit(double clientLimit) {
        this.clientLimit = clientLimit;
    }

    public void deposit(double depositAmount) {
        clientBalance += depositAmount;
    }

    public boolean withdraw(double withdrawAmount) {
        if (clientBalance >= withdrawAmount) {
            clientBalance -= withdrawAmount;
            return true;
        } else {
            return false;
        }
    }
}
