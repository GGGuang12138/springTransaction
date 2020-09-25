package com.gg.service;

import com.gg.mapper.AccountMapper;
import com.gg.model.Account;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Creat by GG
 * Date on 2020/9/24  3:58 下午
 */
public class AccountServiceImpl implements AccountService {
    private AccountMapper accountMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int addAccount(Account account) {
        accountMapper.addAccount(account);
        int i = 1 / 0;
        return 1;
    }

    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }
}
