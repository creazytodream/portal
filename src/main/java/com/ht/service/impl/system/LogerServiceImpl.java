package com.ht.service.impl.system;

import com.ht.dao.system.LogDao;
import com.ht.main.system.Log;
import com.ht.service.system.LogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/27.
 */
@Transactional
@Service
public class LogerServiceImpl  implements LogerService{

    @Autowired
    private LogDao logDao;

    @Override
    public List<Log> findList(Map<String, Object> map) {
        return logDao.findList(map);
    }

    @Override
    public int delete(Integer id) {
        return logDao.delete(id);
    }

    @Override
    public int create(Log Log) {
        return logDao.create(Log);
    }
}
