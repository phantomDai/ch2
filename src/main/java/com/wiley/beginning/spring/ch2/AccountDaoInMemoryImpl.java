package com.wiley.beginning.spring.ch2;

import org.springframework.stereotype.Repository;

import java.util.*;
//该注解能够启用与spring数据访问相关的其它功能
@Repository
public class AccountDaoInMemoryImpl implements AccountDao {
    private Map<Long,Account> accountsMap = new HashMap<Long,Account>();//store account
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("John");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("Mary");
        account2.setBalance(20.0);
        accountsMap.put(account1.getId(),account1);
        accountsMap.put(account2.getId(),account2);
    }//put some eles into accountsMap
    public void insert(Account accAccount) {
        accountsMap.put(accAccount.getId(),accAccount);
    }

    public void update(Account account) {
        accountsMap.put(account.getId(),account);
    }

    public void update(List<Account> accounts) {
        for (Account account : accounts)
            update(account);
    }

    public void delete(long id) {
        accountsMap.remove(id);
    }

    public Account find(long id) {
        return accountsMap.get(id);
    }

    public List<Account> find(List<Long> ids) {
        List<Account> lists = new ArrayList<Account>();
        for(Long id :ids)
            lists.add(accountsMap.get(id));
        return lists;
    }

    public List<Account> find(String ownerName) {
        List<Account> lists = new ArrayList<Account>();
        for (Account account: accountsMap.values()){
            if (ownerName == account.getOwnerName())
                lists.add(account);
        }
        return lists;
    }

    public List<Account> find(boolean locked) {
        List<Account> lists = new ArrayList<Account>();
        for (Account account:accountsMap.values()){
            if (locked == account.isLocked())
                lists.add(account);
        }
        return lists;
    }
}
