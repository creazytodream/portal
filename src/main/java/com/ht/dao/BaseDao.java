package com.ht.dao;

import com.ht.main.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/21.
 */
public interface  BaseDao<ID extends Object, Domain extends Object> {
    List findList(@Param("params") Map<String, Object> params);


    int delete(@Param("id") ID id);

    /**
     * 保存
     *
     * @param domain
     */
    int create(Domain domain);

    /**
     * 更新
     *
     * @param domain
     */
    int update(Domain domain);

    Domain get(@Param("id") ID id);

}
