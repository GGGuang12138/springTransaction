package com.gg.service;

import com.gg.mapper.AccountMapper;
import com.gg.mapper.UserMapper;
import com.gg.model.Account;
import com.gg.model.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Creat by GG
 * Date on 2020/9/24  9:15 下午
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    private AccountService accountService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void createUser(User user) {
        userMapper.addUser(user);
        Account account = new Account();
        account.setUser(user.getName());
        account.setAccountName(new SimpleDateFormat("ddhhmmss").format(new Date()));
        accountService.addAccount(account);
    }
    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }
    public void setAccountService(AccountService accountService){
        this.accountService = accountService;
    }

}
