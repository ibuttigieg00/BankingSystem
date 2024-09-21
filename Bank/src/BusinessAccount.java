import java.util.Date;

public class BusinessAccount extends Account{

    @Override
    public void setAccountNo(int AccountNoIn) {
        AccountNo = AccountNoIn;
    }

    @Override
    public String getAccountNo() {
        return String.valueOf(AccountNo);
    }

    @Override
    public void setDateCreated(Date DateCreatedIn) {
        DateCreated = DateCreatedIn;
    }

    @Override
    public void setDateClosed(Date DateClosedIn) {
        DateClosed = DateClosedIn;
    }

    @Override
    public void AddToCurrentBalance(double BalanceIn) {
        Balance = Balance + BalanceIn;
    }

    @Override
    public void Withdraw(double BalanceIn) {
        Balance = Balance - BalanceIn;
    }

    @Override
    public double GetBalance() {
        return Balance;
    }

    private static double interestRate;

    public void setInterestRate(double interestRateIn){
        interestRate = interestRateIn;
    }

    public BusinessAccount(String NameIn, String SurnameIn, Date DOBIn,
                          String LocalityIn, String ClientIDIn,
                          int AccountNoIn, Date DateCreatedIn,
                          double InterestRateIn){

        setName(NameIn);
        setSurname(SurnameIn);
        setDOB(DOBIn);
        setLocality(LocalityIn);
        setClientID(ClientIDIn);
        setAccountNo(AccountNoIn);
        setDateCreated(DateCreatedIn);
        setDateClosed(null);
        AddToCurrentBalance(0);
        setInterestRate(InterestRateIn);
    }
}
