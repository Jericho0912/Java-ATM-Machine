public class Account {
    private int accountNumber;
    private int pin;
    private double avalableBalance;
    private double totalBalance;

    public Account(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance){
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    }

    public boolean validatePIN(int userPIN){
        if(userPIN == pin){
            return true;
        }else{
            return false;
        }
    }
    public double getAvailableBalance(){
        return availableBalance;
    }
    public double getTotalBalance(){
        return TotalBalance;
    }

    public void credit(double amount){
        totalBalance += amount;
    }
    
    public void debit(double amount){
        availableBalance -= amount;
        totalBalance -= amount;
    }
    public int getAccountNumber(){
        return getAccountNumber;
    }
}
