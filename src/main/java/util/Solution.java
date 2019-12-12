package util;

import java.io.*;
import java.util.*;


enum TransactionErrors {

    USER_NOT_AUTHORIZED("User not authorized"),
    INVALID_AMOUNT("Amount should be greater than zero"),
    INSUFFICIENT_BALANCE("Insufficient balance");

    private String message;

    public String getMessage() {
        return this.message;
    }

    private TransactionErrors(String message) {
        this.message = message;
    }
}

class TransactionException extends Exception {

    private String errorCode;
    private String errorMessage;

    TransactionException(String errorMessage, String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;

    }

    String getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.errorMessage;

    }

}

final class DigitalWallet {

    private String walletId;
    private String userName;
    private String userAccessToken;
    private int walletBalance;

    DigitalWallet(String walletId, String userName) {
        this.walletId = walletId;
        this.userName = userName;
    }

    DigitalWallet(String walletId, String userName, String userAccessToken) {
        this.walletId = walletId;
        this.userName = userName;
        this.userAccessToken = userAccessToken;

    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getUsername() {
        return userName;
    }

    public String getUserAccessToken() {
        return userAccessToken;
    }

}

class DigitalWalletTransaction {
    void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if (digitalWallet.getUserAccessToken() == null || digitalWallet.getUserAccessToken().isEmpty()) {
            throw new TransactionException(TransactionErrors.USER_NOT_AUTHORIZED.getMessage(),
                    TransactionErrors.USER_NOT_AUTHORIZED.name());
        }
        if (amount > 0) {
            int new_balance = digitalWallet.getWalletBalance() + amount;
            digitalWallet.setWalletBalance(new_balance);
        } else {
            throw new TransactionException(TransactionErrors.INVALID_AMOUNT.getMessage(),
                    TransactionErrors.INVALID_AMOUNT.name());
        }
    }

    void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {

        if (digitalWallet.getUserAccessToken() == null || digitalWallet.getUserAccessToken().isEmpty()) {
            throw new TransactionException(TransactionErrors.USER_NOT_AUTHORIZED.getMessage(),
                    TransactionErrors.USER_NOT_AUTHORIZED.name());
        }
        if (amount > 0) {
            int new_balance = digitalWallet.getWalletBalance() - amount;
            if (new_balance >= 0) {
                digitalWallet.setWalletBalance(new_balance);
            } else {
                throw new TransactionException(TransactionErrors.INSUFFICIENT_BALANCE.getMessage(),
                        TransactionErrors.INSUFFICIENT_BALANCE.name());
            }
        } else {
            throw new TransactionException(TransactionErrors.INVALID_AMOUNT.getMessage(),
                    TransactionErrors.INVALID_AMOUNT.name());
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        String[] arr = { "Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry" };

        List<String> list = Arrays.asList(arr);

    }
}
