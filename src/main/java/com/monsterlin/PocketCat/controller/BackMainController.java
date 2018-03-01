package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcAdmin;
import com.monsterlin.PocketCat.utils.SessionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 后台主页控制器
 * @date : 2018/2/27
 */
@Controller
@RequestMapping(value = "/backMain")
public class BackMainController {


    @RequestMapping(value = "")
    public String backMain(HttpServletRequest request, Model model){
        PcAdmin pcAdmin = SessionUtil.checkAdmin(request);
        if (pcAdmin==null){
            return "redirect:/login";
        }

        HttpSession session = request.getSession();
        session.setAttribute("session", pcAdmin);
        model.addAttribute("userName", pcAdmin.getUsername());

        return "backMain";
    }



}
