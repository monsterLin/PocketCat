package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcNotice;
import com.monsterlin.PocketCat.service.PcNoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

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
    public String backMain(){
        return "backMain";
    }



}
