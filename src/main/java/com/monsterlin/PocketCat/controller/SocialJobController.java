package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcAdmin;
import com.monsterlin.PocketCat.domain.PcSocialJob;
import com.monsterlin.PocketCat.grab.GrabSocialJobs;
import com.monsterlin.PocketCat.service.PcSocialJobService;
import com.monsterlin.PocketCat.utils.SessionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    PcSocialJobService pcSocialJobService;

    @RequestMapping("/allSocialJob")
    public String allCampusJob(HttpServletRequest request, Model model) {
        PcAdmin pcAdmin = SessionUtil.checkAdmin(request);
        if (pcAdmin == null) {
            return "redirect:/login";
        } else {
            List<PcSocialJob> pcSocialJobList = pcSocialJobService.getPcSocialJobByPage(1, 1, 20);
            model.addAttribute("pcSocialJobList", pcSocialJobList);
            HttpSession session = request.getSession();
            session.setAttribute("session", pcAdmin);
            model.addAttribute("userName", pcAdmin.getUsername());
            return "allSocial";
        }
    }

    @RequestMapping(value = "/deleteSocialJob")
    public String deleteCampusJob(HttpServletRequest request, int jid) {
        PcAdmin pcAdmin = SessionUtil.checkAdmin(request);
        if (pcAdmin == null) {
            return "redirect:/login";
        } else {
            int result = pcSocialJobService.deletePcSocialJob(jid);
            if (result != 0) {
                return "redirect:/backMain/socialJob/allSocialJob";
            } else {
                return "redirect:/backMain/socialJob/allSocialJob";
            }
        }
    }

    @RequestMapping(value = "/socialDetail")
    public String socialDetail(HttpServletRequest request) {
        PcAdmin pcAdmin = SessionUtil.checkAdmin(request);
        if (pcAdmin == null) {
            return "redirect:/login";
        } else {
            return "redirect:/backMain/socialJob/allSocialJob";
        }
    }

    @RequestMapping(value = "/getSocialJob")
    public String getSocialJob(HttpServletRequest request, Model model, int jid) {
        PcAdmin pcAdmin = SessionUtil.checkAdmin(request);
        if (pcAdmin == null) {
            return "redirect:/login";
        } else {
            PcSocialJob pcSocialJob = pcSocialJobService.getPcSocialJob(jid);
            if (pcSocialJob != null) {
                model.addAttribute("pcSocialJob", pcSocialJob);
                HttpSession session = request.getSession();
                session.setAttribute("session", pcAdmin);
                model.addAttribute("userName", pcAdmin.getUsername());
                return "socialDetail";
            } else {
                return "redirect:/backMain/socialJob/allSocialJob";
            }
        }
    }

    @RequestMapping(value = "/startCrawler")
    public String startCrawler(HttpServletRequest request) {
        PcAdmin pcAdmin = SessionUtil.checkAdmin(request);
        if (pcAdmin == null) {
            return "redirect:/login";
        } else {
            List<PcSocialJob> pcSocialJobList = GrabSocialJobs.grabTopPartJobs();
            for (PcSocialJob pcSocialJob : pcSocialJobList) {
                pcSocialJobService.insertPcSocialJob(pcSocialJob);
            }
            return "redirect:/backMain/socialJob/allSocialJob";
        }
    }
}
