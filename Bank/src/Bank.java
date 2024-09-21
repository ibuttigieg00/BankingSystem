import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accountsList = new ArrayList<>();

    public boolean CreateAccount(Account account){
         if(SearchAccountList(account.AccountNo) == -999){
             accountsList.add(account);
             return true;
         }
         else {
             return false;
         }
    }

    public int SearchAccountList(int accountNoIn){
        for (int i=0; i < accountsList.size(); i++){
            Account tempAccount = accountsList.get(i); // find the account at index i
            String tempNumber = tempAccount.getAccountNo(); // get account number

            if(tempNumber.equals(String.valueOf(accountNoIn))) // if this is the account we are looking for
            {
                return i;
            }
        }
        return -999;
    }

    public boolean RemoveAccount(int accountNoIn){
        int index = SearchAccountList(accountNoIn);

        if(index != -999){
            accountsList.remove(index);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean AddMoney(int accountNoIn, double Deposit){
        int index = SearchAccountList(accountNoIn);

        if(index != -999){
            accountsList.get(index).AddToCurrentBalance(Deposit);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean Withdraw(int accountNoIn, double WithdrawAmount){
        int index = SearchAccountList(accountNoIn);

        if(index != -999){
            double balance = accountsList.get(index).GetBalance();

            if (WithdrawAmount < balance){
                accountsList.get(index).Withdraw(WithdrawAmount);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public double GetBalance(int accountNoIn){
        int index = SearchAccountList(accountNoIn);

        if(index != -999){
            return accountsList.get(index).GetBalance();
        }
        else {
            return index;
        }
    }
}