package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcAdmin;
import com.monsterlin.PocketCat.service.PcAdminService;
import com.monsterlin.PocketCat.utils.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 管理员控制器
 * @date : 2017/8/27
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    private PcAdminService adminService;

    @Autowired
    public AdminController(PcAdminService adminService) {
        this.adminService = adminService;
    }


    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public String signIn(HttpServletRequest request, Model model) {
        String userName = request.getParameter("name");
        String userPass = request.getParameter("password");
        PcAdmin admin = adminService.selectAdmin(userName, userPass);
        if (admin == null) {
            return "login";
        }

        HttpSession session = request.getSession();
        session.setAttribute("session", admin);
        model.addAttribute("userName", admin.getUsername());

        return "backMain";
    }


    @RequestMapping(value = "clear")
    public String clear(HttpServletRequest request) {
        SessionUtil.clearSession(request);
        return "login";
    }



}