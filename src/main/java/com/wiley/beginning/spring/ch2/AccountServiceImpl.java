package com.wiley.beginning.spring.ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//该注解除了讲一个类定义为bean外再无其它含义
@Service
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    //该注解自动装配bean
    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
        Account sourceAccount = accountDao.find(sourceAccountId);
        Account targetAccount = accountDao.find(targetAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance() + amount);
        accountDao.update(sourceAccount);
        accountDao.update(targetAccount);
    }

    public void depositMoney(long accountId, double amount) {
        Account account = accountDao.find(accountId);
        account.setBalance(account.getBalance() + amount);
        accountDao.update(account);
    }

    public Account getAccount(long accountId) { return accountDao.find(accountId); }
}
