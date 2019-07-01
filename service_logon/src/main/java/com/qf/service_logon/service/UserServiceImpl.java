package com.qf.service_logon.service;

import com.qf.IUser;
import com.qf.mailentity.User;
import com.qf.service_logon.dao.LogonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUser {

    @Autowired
    private LogonDao logonDao;


    @Override
    public int insert(User user) {
        return logonDao.insert(user);
    }
}
