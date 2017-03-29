package com.ht.service;

import com.ht.main.UserDomain;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/21.
 */
public interface UserService {
    public List<UserDomain> findList(Map<String, Object> map);


    int delete(Integer id);

    int create(UserDomain userDomain);

    UserDomain get(Integer id);

    int update(UserDomain biao);
}
