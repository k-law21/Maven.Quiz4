package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> accountList = new ArrayList<>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount removed = accountList.get(indexNumber);
        accountList.remove(removed);
        return removed;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accountList.contains(bankAccount);
    }
}