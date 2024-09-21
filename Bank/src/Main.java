import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args)
    {

        Bank bank = new Bank(); // default constructor

        boolean bIsAccountCreated = bank.CreateAccount(new PrivateAccount("Izaak", "Buttigieg",
                new Date(2000, Calendar.MAY,23), "Zabbar", "qwertyu1234", 1,
                new Date(2024, Calendar.SEPTEMBER, 21),
                3.5));

        if(bIsAccountCreated){
            System.out.println("Account Created successfully!");
        }
        else {
            System.out.println("Could not create account");
        }

        if(bank.RemoveAccount(1)){
            System.out.println("Successfully removed account");
        }
        else {
            System.out.println("Could not find and remove account!");
        }

        bank.CreateAccount(new PrivateAccount("Jason", "Bacon",
                new Date(2000, Calendar.MAY,23), "San Gwann", "sgJB123", 2,
                new Date(2024, Calendar.SEPTEMBER, 21),
                3.5));

        bank.AddMoney(2, 2500);
        bank.Withdraw(2, 2600);

        System.out.println(bank.GetBalance(2));

        bank.Withdraw(2, 500);
        System.out.println(bank.GetBalance(2));
    }
}
