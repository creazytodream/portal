package com.ht.util;

import com.ht.main.User;
import com.ht.main.UserDomain;
import com.ht.main.system.Log;
import com.ht.service.system.LogerService;
import org.slf4j.LoggerFactory;
import org.tuckey.web.filters.urlrewrite.utils.StringUtils;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/27.
 */
public class LogUtils {

    private static LogerService logService = SpringContextHolder.getBean(LogerService.class);


    /**
     * 记录操作日志
     *
     * @param label   标签
     * @param name    操作对象名称
     * @param remarks 具体信息
     */
    public static void log(String label, String name, String[] remarks) {
        if (remarks != null) {
            for (String remark : remarks) {
                log(label, name, remark);
            }
        }
    }

    /**
     * 记录操作日志
     *
     * @param label  标签
     * @param name   操作对象名称
     * @param remark 具体信息
     */
    public static void log(String label, String name, String remark) {

        UserDomain sessionUser=WebUtils.getSessionUser();
        Log log = new Log();
        log.setAccount(sessionUser.getUname());
        log.setLogType(label);
        log.setRemark(StringUtils.isBlank(remark) ? name : (name + ":" + remark));
        log.setProcessTime(new Date());
        logService.create(log);

    }

    /**
     * 记录登录退出日志
     *
     * @param label   标签
     * @param account 操作对象名称
     * @param vp      虚拟路径
     * @param ip      ip
     */
    public static void loginLog(String label, String account, String vp, String ip) {
        Log log = new Log();
        log.setAccount(account);
        log.setIp(ip);
        log.setLogType(label);
        log.setProcessTime(new Date());
        logService.create(log);

    }

}
