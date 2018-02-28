package com.monsterlin.PocketCat.controller;

import com.monsterlin.PocketCat.domain.PcNotice;
import com.monsterlin.PocketCat.service.PcNoticeService;
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
 * @desc : 公告控制器
 * @date : 2018/2/27
 */
@Controller
@RequestMapping(value = "/backMain/notice")
public class NoticeController {

    @Resource
    PcNoticeService pcNoticeService ;

    @RequestMapping(value = "/allNotice")
    public String allNotice(Model model) {
        List<PcNotice> pcNoticeList = pcNoticeService.getPcNoticeByPage(1,20);
        model.addAttribute("pcNoticeList",pcNoticeList);
        return "allNotice";
    }

    @RequestMapping(value = "/addNotice")
    public String addNotice(){
        return "addNotice";
    }


    @RequestMapping(value = "/postAddNotice",method = RequestMethod.POST)
    public String postAddNotice(HttpServletRequest request){
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String author = request.getParameter("author");

        long nowStamp = TimeUtil.getNowTimeStamp();

        PcNotice pcNotice = new PcNotice(title,content,author,nowStamp,nowStamp);
        int result = pcNoticeService.insertPcNotice(pcNotice);
        if (result!=0){
            return "redirect:/backMain/notice/allNotice";
        }else {
            return "redirect:/backMain/notice/addNotice";
        }
    }


    /**
     * 当没有数据的时候，也就是点击左侧导航栏的时候，程序自动跳入所有公告的网页
     * 只有当拿到了nid的时候，我们才让用户真正跳到了更新的界面
     * @return
     */
    @RequestMapping(value = "/updateNotice")
    public String updateNotice(){
        return "redirect:/backMain/notice/allNotice";
    }

    @RequestMapping(value = "/postUpdateNotice",method = RequestMethod.POST)
    public String postUpdateNotice(HttpServletRequest request){
        String nid = request.getParameter("nid");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String author = request.getParameter("author");
        String createTime = request.getParameter("createTime");

        long createStamp = TimeUtil.getTimeStamp("",createTime);
        long nowStamp = TimeUtil.getNowTimeStamp();

        PcNotice pcNotice = pcNoticeService.getPcNoticeByNid(Integer.parseInt(nid));

       if (pcNotice!=null){
           pcNotice.setTitle(title);
           pcNotice.setContent(content);
           pcNotice.setAuthor(author);
           pcNotice.setCreateTime(createStamp);
           pcNotice.setUpdateTime(nowStamp);
           int result = pcNoticeService.updatePcNotice(pcNotice);
           if (result!=0){
               return "redirect:/backMain/notice/allNotice";
           }else {
               return "redirect:/backMain/notice/updateNotice";
           }

       }else {
           return "redirect:/backMain/notice/updateNotice";
       }
    }

    @RequestMapping(value = "/getNoticeByNid")
    public String getNoticeByNid(Model model , int nid){
        PcNotice pcNotice = pcNoticeService.getPcNoticeByNid(nid);
        if (pcNotice!=null){
            model.addAttribute("pcNotice",pcNotice);
            return "updateNotice";
        }else {
            return "redirect:/backMain/notice/allNotice";
        }

    }

    @RequestMapping(value = "/deleteNotice")
    public String deleteNotice(int nid){
       int result =  pcNoticeService.deletePcNotice(nid);

       if (result!=0){
           return "redirect:/backMain/notice/allNotice";
       }else{
           return "redirect:/backMain/notice/allNotice";
       }

    }
}
