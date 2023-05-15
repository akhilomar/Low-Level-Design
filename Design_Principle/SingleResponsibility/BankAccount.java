package SingleResponsibility;
import SingleResponsibility.IbankAccount;


public class BankAccount implements IbankAccount
{


    public String AccountNumber;
    public float AccountBalance;


    // This violates singleresponsibility principle 
    // a class should have 1 responsibility, it can not have responsibility
    // to show details and calculate interest both
    
    // public float CalculateInterest(){
    //     return 0;
    // };
}
