package com.ht.service.impl;

import com.ht.dao.UserDao;
import com.ht.main.UserDomain;
import com.ht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/3/21.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{




    @Autowired
    private UserDao dao;

    @Override
    public List<UserDomain> findList(Map<String, Object> map) {
        List<UserDomain>  list=dao.findList(map);
        return list;
    }
    //allEntries为true表示清除value中的全部缓存,默认为false
    @CacheEvict(value="Ehcache", allEntries=true)
    @Override
    public int delete(Integer id) {
        System.out.println("移除缓存中的用户 id  = [  "+id+"   ]");
        return dao.delete(id);
    }

    @Override
    public int create(UserDomain userDomain) {
        return dao.create(userDomain);
    }

    //将查询到的数据缓存到Ehcache中,并使用方法名称加上参数中的userNo作为缓存的key

    /**
     *
     *   这个value 是必须要的，配置在ehcache的配置文件中
     *      key：作为唯一值，更好的区分要操作哪个方法
     *
     * @param id
     * @return
     */
    //通常更新操作只需刷新缓存中的某个值,所以为了准确的清除特定的缓存,故定义了这个唯一的key,从而不会影响其它缓存值
    @Override
    @Cacheable(value="Ehcache", key="'get'+#id")
    public UserDomain get(Integer id) {
        System.out.println("数据库中查到此用户号[" + id + "]对应的用户名为[" + id + "]");
        return (UserDomain) dao.get(id);
    }

    @CacheEvict(value="Ehcache", key="'get'+#id")
    @Override
    public int update(UserDomain userDomain) {
        System.out.println("移除缓存中此用户号["  + userDomain.getUname() +  "]对应的用户名["  + userDomain.getId() +  "]的缓存");
        return dao.update(userDomain);
    }
}
