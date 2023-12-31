package com.unsis.controller;

import com.unsis.clases.Session;
import com.unsis.dao.AccountDao;
import org.mindrot.jbcrypt.BCrypt;

public class controllerAccount<Account> implements Crud<Account> {

    AccountDao dao = new AccountDao();

    public controllerAccount(Account obj) {
    }

    @Override
    public boolean create(Account obj) {
        return true;
    }

    @Override
    public boolean update(Account obj) {
        return true;
    }

    @Override
    public boolean select(Account obj) {
        return true;
    }

    @Override
    public boolean delete(Account obj) {
        return true;
    }

    /**
     *
     * @param user
     * @param pass
     * @return
     */
    public boolean auth(String user, String pass) {
        var account = dao.auth(user);

        if (account == null) {
            return false;
        }
        
        Session.setAccount(account);
        // Verificar si la contraseña ingresada coincide con la contraseña hasheada
        return  BCrypt.checkpw(pass, account.getContrasena());
//        return true;

    }

}
