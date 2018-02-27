package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcCampusJob;
import com.monsterlin.PocketCat.domain.PcNotice;
import com.monsterlin.PocketCat.domain.PcSocialJob;
import com.monsterlin.PocketCat.service.PcCampusService;
import com.monsterlin.PocketCat.service.PcNoticeService;
import com.monsterlin.PocketCat.service.PcSocialJobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 主页控制器
 * @date : 2018/2/27
 */
@Controller
public class IndexController {

    @Resource
    PcCampusService pcCampusService ;

    @Resource
    PcSocialJobService pcSocialJobService ;

    @Resource
    PcNoticeService pcNoticeService ;

    /**
     * 额，这个主页其实的话也就是校内兼职O(∩_∩)O
     *
     * @return
     */
    @RequestMapping(value = "/index")
    private String index(Model model) {
        List<PcCampusJob> campusJobList = pcCampusService.getPcCampusByPage(1,1,20);
        model.addAttribute("campusJobList", campusJobList);
        return "index";
    }

    /**
     * 校外兼职
     * @return
     */
    @RequestMapping(value = "/socialjobs")
    private String socialjobs(Model model) {
        List<PcSocialJob> socialJobList = pcSocialJobService.getPcSocialJobByPage(1,1,20);
        model.addAttribute("socialJobList", socialJobList);
        return "socialjobs";
    }

    /**
     * 通知公告
     * @return
     */
    @RequestMapping(value = "notice")
    private String notice(Model model) {
        List<PcNotice> noticeList = pcNoticeService.getPcNoticeByPage(1,15);
        model.addAttribute("noticeList", noticeList);
        return "notice";
    }

    /**
     * 小黑屋
     * @return
     */
    @RequestMapping(value = "blackjobs")
    private String blackjobs(Model model) {
        List<PcCampusJob> campusJobList = pcCampusService.getPcCampusByPage(0,1,20);
        model.addAttribute("campusJobList", campusJobList);
        return "blackjobs";
    }

    @RequestMapping(value = "/login")
    private String login() {
        return "login";
    }

}
