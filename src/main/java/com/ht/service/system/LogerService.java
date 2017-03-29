package com.ht.service.system;

import com.ht.main.system.Log;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/27.
 */
public interface  LogerService  {
    public List<Log> findList(Map<String, Object> map);

    int delete(Integer id);

    int create(Log Log);


}
