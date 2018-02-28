package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcSocialJob;
import com.monsterlin.PocketCat.grab.GrabSocialJobs;
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
 * @desc : 校外兼职
 * @date : 2018/2/28
 */
@Controller
@RequestMapping(value = "/backMain/socialJob")
public class SocialJobController {
    @Resource
    PcSocialJobService pcSocialJobService ;

    @RequestMapping("/allSocialJob")
    public String allCampusJob(Model model) {
        List<PcSocialJob> pcSocialJobList = pcSocialJobService.getPcSocialJobByPage(1, 1, 20);
        model.addAttribute("pcSocialJobList", pcSocialJobList);
        return "allSocial";
    }

    @RequestMapping(value = "/deleteSocialJob")
    public String deleteCampusJob(int jid) {
        int result = pcSocialJobService.deletePcSocialJob(jid);

        if (result != 0) {
            return "redirect:/backMain/socialJob/allSocialJob";
        } else {
            return "redirect:/backMain/socialJob/allSocialJob";
        }
    }

    @RequestMapping(value = "/socialDetail")
    public String socialDetail(){
        return "redirect:/backMain/socialJob/allSocialJob";
    }

    @RequestMapping(value = "/getSocialJob")
    public String getSocialJob(Model model , int jid){
        PcSocialJob pcSocialJob = pcSocialJobService.getPcSocialJob(jid);
        if (pcSocialJob!=null){
            model.addAttribute("pcSocialJob",pcSocialJob);
            return "socialDetail";
        }else {
            return "redirect:/backMain/socialJob/allSocialJob";
        }
    }

    @RequestMapping(value = "/startCrawler")
    public String startCrawler(){

        List<PcSocialJob> pcSocialJobList = GrabSocialJobs.grabTopPartJobs();

        for (PcSocialJob pcSocialJob : pcSocialJobList) {
            pcSocialJobService.insertPcSocialJob(pcSocialJob);
        }

        return "redirect:/backMain/socialJob/allSocialJob";
    }
}
