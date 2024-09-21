import java.util.Date;

public abstract class Account extends Client{

    @Override
    public void setName(String NameIn) {
        Name = NameIn;
    }

    @Override
    public void setSurname(String SurnameIn) {
        Surname = SurnameIn;
    }

    @Override
    public void setDOB(Date DOBIn) {
        DOB = DOBIn;
    }

    @Override
    public void setLocality(String LocalityIn) {
        Locality = LocalityIn;
    }

    @Override
    public void setClientID(String IDIn) {
        ID = IDIn;
    }

    protected int AccountNo;
    protected Date DateCreated;
    protected Date DateClosed;
    protected double Balance;

    public abstract void setAccountNo(int AccountNoIn);
    public abstract String getAccountNo();
    public abstract void setDateCreated(Date DateCreatedIn);
    public abstract void setDateClosed(Date DateClosedIn);
    public abstract void AddToCurrentBalance(double BalanceIn);
    public abstract void Withdraw(double BalanceIn);
    public abstract double GetBalance();
}
