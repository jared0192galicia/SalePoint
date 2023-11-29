package com.unsis.clases;

import com.unsis.models.entity.Account1;

public class Session {
    private static Account1 account;
//    private static Account account;

    public static Account1 getAccount() {
        return account;
    }

    public static void setAccount(Account1 account) {
        Session.account = account;
    }
    
    
}
