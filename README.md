# BankingSystem
This banking systems makes use of an OOP structure. Abstraction, Inheritance, Encapsulation and Polymorphism where heavily involved in this application. Correct uses of validations.  A uml diagram can be found to help the individual understand the classes correctly.

Main class:

One instance of bank was created on this class. 
The rest are only just method calls

Bank class:

An ArrayList<Account> accountsList  of type Account was created. This will store all the available accounts in the system.
An account can either be private or business acount. The difference is the interest rate.

Account Class (Abstract)

This class is abstract because there will never be an instance of this class, and it will also serve as an interface since the methods are all abstract.
An abstract class can have abstract and non abstract methods. The abstract methods are only declared without a body. Whilst the child class has to implement 
all of these methods.
An account has either to be Private or Business account.
