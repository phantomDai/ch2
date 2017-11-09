package com.wiley.beginning.spring.ch2;

import java.util.List;

public interface AccountDao {
    public void insert(Acount accAcount);
    public void update(Acount acount);
    public void update(List<Acount> acounts);
    public void delete(long id);
    public Acount find(long id);
    public List<Acount> find(List<Long> ids);
    public List<Acount> find(String ownerName);
    public List<Acount> find(boolean locked);
}
