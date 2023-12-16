

//customer should not be allowed to withdraw funds,
//if that withdrawal takes their balance negative
//create a new project called ClassesChallenge, with the
//usual Main class with the usual main method
//you'll create an instance of an account class, and then
//test your withdrawal and deposit methods
//youll print the info to the console that confirms what
//the balance is after the methods are called
//two behavioral method

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $"
                + balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        //if statement checks if account is negative
        if (balance - withdrawalAmount < 0 ) {
            System.out.println("Insufficent Funds! you only have $" + balance +
                    " in your account.");
        }else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " debited. New balance is $"
                + balance);
        }
    }

    //getters
    public String getNumber(){
        return number;
    }
    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    //setters

    public void setNumber(String number){
        this.number = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone( String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
