package com.example.banknote.Models;
import org.parceler.Parcel;

import com.parse.Parse;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

@Parcel
@ParseClassName("Account")
public class Account extends ParseObject {

    public static final String KEY_ACCOUNT_NAME = "accountName";
    public static final String KEY_BANK = "bank";
    public static final String KEY_USER = "user";
    public static final String KEY_BALANCE = "balance";
    public static final String KEY_ACCOUNT_NUMBER = "acountNumber"; // spelled wrong in the Parse database LOL
    public static final String KEY_ACCOUNT_PASSWORD = "accountPassword";

    public Account() {}

    public String getAccountName() {
        return getString(KEY_ACCOUNT_NAME);
    }

    public void setAccountName(String accountName) {
        put(KEY_ACCOUNT_NAME, accountName);
    }

    public String getBank() {
        return getString(KEY_BANK);
    }

    public void setBank(String bank) {
        put(KEY_BANK, bank);
    }

    public double getBalance() {
        return getDouble(KEY_BALANCE);
    }

    public void setBalance(double balance) {
        put(KEY_BALANCE, balance);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

    public long getAccountNumber() {
        return getLong(KEY_ACCOUNT_NUMBER);
    }

    public void setAccountNumber(long accountNumber) {
        put(KEY_ACCOUNT_NUMBER, accountNumber);
    }

    public String getAccountPassword() {
        return getString(KEY_ACCOUNT_PASSWORD);
    }

    public void setAccountPassword(String accountPassword) {
        put(KEY_ACCOUNT_PASSWORD, accountPassword);
    }

}
