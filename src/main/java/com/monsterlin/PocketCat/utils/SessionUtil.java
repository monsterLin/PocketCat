package com.monsterlin.PocketCat.utils;


import com.monsterlin.PocketCat.domain.PcAdmin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : session工具类
 * @date : 2017/8/29
 */
public class SessionUtil {
    /**
     * 检查Session对象
     *
     * @param request request对象
     * @return
     */
    public static PcAdmin checkAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession();
        PcAdmin admin = (PcAdmin) session.getAttribute("session");
        return admin;
    }

    /**
     * 清除session
     * @param request request对象
     */
    public static void clearSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        if (session != null) {
            session.invalidate();
        }
    }
}
