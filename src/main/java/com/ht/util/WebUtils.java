package com.ht.util;

import com.ht.main.UserDomain;
import com.sun.deploy.association.utility.AppConstants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.ShiroException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Name: WebUtils
 * Description:
 * Created by: XieShengLing
 * Date: 2016-09-29
 * Time: 10:56
 */
public class WebUtils {
    public static Logger logger = LoggerFactory.getLogger(WebUtils.class);


    public static void removeSessionUser() {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession();
            session.removeAttribute(AppConstants.USER_LEVEL);
        }
    }

    /**
     * 获取当前登录次数
     *
     * @return
     */
//    public static Integer getCurrentCount() {
//        Integer currentCount = ServletUtils.getSessionAttribute(AppConstants.SESSION_KEY_COUNT);
//        currentCount = currentCount == null ? 0 : currentCount;
//        return currentCount;
//    }

    /**
     * 添加登录次数
     *
     * @return
     */
//    public static Integer addCount() {
//        Integer currentCount = getCurrentCount();
//        if (currentCount == null) {
//            currentCount = 0;
//        }
//        if (currentCount < Integer.MAX_VALUE) {
//            ServletUtils.setSessionAttribute(AppConstants.SESSION_KEY_COUNT, ++currentCount);
//        }
//        return currentCount;
//    }

    /**
     * 获取当前登录员工
     *
     * @return
     */
    public static UserDomain getSessionUser() {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession(false);
            return (UserDomain) session.getAttribute("user");
        }
        throw new ShiroException("sessionUser is null.");
    }

//    public static void setSessionUser(SessionUser sessionUser) {
//        Subject currentUser = SecurityUtils.getSubject();
//        if (null != currentUser) {
//            Session session = currentUser.getSession();
//            session.setAttribute(AppConstants.SESSION_USER_KEY, sessionUser);
//        } else {
//            throw new ShiroException("sessionUser is null.");
//        }
//    }

    /**
     * 是否为超级管理员
     *
     * @param account
     * @return
     */
//    public static boolean isSuperAdmin(String account) {
//        return getSessionUser().getChannelAccount().equals(account);
//    }

    /**
     * 判断是否需要提交验证码登录
     *
     * @return
     */
//    public static boolean needCaptcha() {
//        return getCurrentCount() >= ConfigHolder.getInteger(AppConstants.MAX_TRY_COUNT);
//    }

    /**
     * 获取session验证码
     *
     * @return
     */
//    public static String getSessionCaptcha() {
//        return ServletUtils.getSessionAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
//    }

    /**
     * 移除登录次数
     */
//    public static void removeCount() {
//        ServletUtils.removeSessionAttribute(AppConstants.SESSION_KEY_COUNT);
//    }

    /**
     * 移除验证码
     */
//    public static void removeSessionCaptcha() {
//        ServletUtils.removeSessionAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
//    }

    /**
     * 判断是否包含其中任意一个权限
     *
     * @param resourceCodes
     * @return
     */
//    public static boolean hasAnyPermissions(String resourceCodes) {
//        boolean hasAnyPermission = false;
//        if (!StringUtils.isBlank(resourceCodes)) {
//            String[] permissions = resourceCodes.split(Constants.COMMA);
//            Subject subject = SecurityUtils.getSubject();
//            if (subject != null) {
//                for (String permission : permissions) {
//                    if (subject.isPermitted(permission.trim())) {
//                        hasAnyPermission = true;
//                        break;
//                    }
//                }
//            }
//        }
//        return hasAnyPermission;
//    }

    /**
     * 获取配置文件参数
     *
     * @param key
     * @return
     */
//    public static Object configValue(String key) {
//        return ConfigHolder.get(key);
//    }


    /**
     * 省份列表
     *
     * @return
     */

}
