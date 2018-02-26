package com.monsterlin.PocketCat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 测试器
 * @date : 2018/2/26
 */
@Controller
public class TestController {

    @RequestMapping(value = "/add")
    private String add() {
        return "index";
    }

    @RequestMapping(value = "/all")
    private String all() {
        return "index";
    }

    @RequestMapping(value = "/index")
    private String index() {
        return "index";
    }


    @RequestMapping(value = "/login")
    private String login() {
        return "index";
    }


    @RequestMapping(value = "/update")
    private String update() {
        return "index";
    }


}
