package com.agent.mapper;

import com.agent.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);

}
