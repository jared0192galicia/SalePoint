package com.unsis.clases;

import com.unsis.models.entity.Account;

public class Session {
    private static Account account;
//    private static Account account;

    public static Account getAccount() {
        return account;
    }

    public static void setAccount(Account account) {
        Session.account = account;
    }
    
    
}
