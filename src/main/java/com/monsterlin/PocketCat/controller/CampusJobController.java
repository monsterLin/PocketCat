package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcCampusJob;
import com.monsterlin.PocketCat.service.PcCampusService;
import com.monsterlin.PocketCat.utils.TimeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 校园活动控制器
 * @date : 2018/2/28
 */
@Controller
@RequestMapping(value = "/backMain/campusJob")
public class CampusJobController {

    @Resource
    PcCampusService pcCampusService;

    @RequestMapping(value = "/allCampusJob")
    public String allCampusJob(Model model) {
        List<PcCampusJob> pcCampusJobList = pcCampusService.getPcCampusByPage(1, 1, 20);
        model.addAttribute("pcCampusJobList", pcCampusJobList);
        return "allCampus";
    }

    @RequestMapping(value = "/deleteCampusJob")
    public String deleteCampusJob(int jid) {
        int result = pcCampusService.deletePcCampus(jid);

        if (result != 0) {
            return "redirect:/backMain/campusJob/allCampusJob";
        } else {
            return "redirect:/backMain/campusJob/allCampusJob";
        }
    }


    @RequestMapping(value = "/addCampusJob")
    public String addCampusJob() {
        return "addCampus";
    }


    @RequestMapping(value = "/postAddCampusJob", method = RequestMethod.POST)
    public String postAddCampusJob(HttpServletRequest request) {
        int state = 1;
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String author = request.getParameter("author");
        String price = request.getParameter("price");
        String place = request.getParameter("place");
        String beginTime = request.getParameter("beginTime");
        String endTime = request.getParameter("endTime");

        String stateString = request.getParameter("state");

        if (title.isEmpty() || content.isEmpty() || author.isEmpty() || price.isEmpty() || place.isEmpty() || beginTime.isEmpty() || endTime.isEmpty()) {
            return "redirect:/backMain/campusJob/addCampusJob";
        } else {

            //标志
            if (stateString.equals("") && stateString.length() != 0) {
                state = Integer.parseInt(request.getParameter("state"));
            }

            //时间戳系列
            long beginStamp = TimeUtil.getTimeStamp("", beginTime);
            long endStamp = TimeUtil.getTimeStamp("", endTime);

            long nowStamp = TimeUtil.getNowTimeStamp();

            PcCampusJob pcCampusJob = new PcCampusJob(title, content, price, place, author, state, beginStamp, endStamp, nowStamp, nowStamp);

            int result = pcCampusService.insertPcCampus(pcCampusJob);

            if (result != 0) {
                return "redirect:/backMain/campusJob/allCampusJob";
            } else {
                return "redirect:/backMain/campusJob/addCampusJob";
            }
        }
    }


    @RequestMapping(value = "/updateCampusJob")
    public String updateCampusJob(){
        return "redirect:/backMain/campusJob/allCampusJob";
    }

    @RequestMapping(value = "/getCampusByJid")
    public String getCampusByJid(Model model , int jid){
        PcCampusJob pcCampusJob = pcCampusService.getPcCampusJobByJid(jid);
        if (pcCampusJob!=null){
            model.addAttribute("pcCampusJob",pcCampusJob);
            return "updateCampus";
        }else {
            return "redirect:/backMain/campusJob/allCampusJob";
        }
    }

    @RequestMapping(value = "/postUpdateCampus",method = RequestMethod.POST)
    public String postUpdateCampus(HttpServletRequest request){
        int jid = Integer.parseInt(request.getParameter("jid"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String author = request.getParameter("author");
        String price = request.getParameter("price");
        String place = request.getParameter("place");
        long beginStamp = TimeUtil.getTimeStamp("",request.getParameter("beginTime"));
        long endStamp =TimeUtil.getTimeStamp("",request.getParameter("endTime"));
        int state = Integer.parseInt(request.getParameter("state"));
        long nowStamp = TimeUtil.getNowTimeStamp();

        PcCampusJob pcCampusJob = pcCampusService.getPcCampusJobByJid(jid);

        if (pcCampusJob!=null){
            pcCampusJob.setTitle(title);
            pcCampusJob.setContent(content);
            pcCampusJob.setAuthor(author);
            pcCampusJob.setPrice(price);
            pcCampusJob.setPlace(place);
            pcCampusJob.setBeginTime(beginStamp);
            pcCampusJob.setEndTime(endStamp);
            pcCampusJob.setstate(state);
            pcCampusJob.setUpdateTime(nowStamp);

            int result = pcCampusService.updatePcCampus(pcCampusJob);

            if (result!=0){
                return "redirect:/backMain/campusJob/allCampusJob";
            }else {
                return "redirect:/backMain/campusJob/updateCampusJob";
            }
        }else {
            return "redirect:/backMain/campusJob/allCampusJob";
        }
    }


}
