package com.monsterlin.PocketCat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 后台主页控制器
 * @date : 2018/2/27
 */
@Controller
@RequestMapping("/backMain")
public class BackMainController {

    @RequestMapping(value = "")
    private String backMain(){
        return "backMain";
    }

    @RequestMapping(value = "allNotice")
    private String allNotice(){
        return "allNotice";
    }

    @RequestMapping(value = "addNotice")
    private String addNotice(){
        return "addNotice";
    }

    @RequestMapping(value = "updateNotice")
    private String updateNotice(){
        return "updateNotice";
    }

}
