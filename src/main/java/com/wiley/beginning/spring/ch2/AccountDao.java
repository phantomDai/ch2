package com.wiley.beginning.spring.ch2;

import java.util.List;

public interface AccountDao {
    public void insert(Account accAccount);
    public void update(Account account);
    public void update(List<Account> accounts);
    public void delete(long id);
    public Account find(long id);
    public List<Account> find(List<Long> ids);
    public List<Account> find(String ownerName);
    public List<Account> find(boolean locked);
}
