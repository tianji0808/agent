package com.agent.service;

import com.agent.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);

}
