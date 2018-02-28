package com.monsterlin.PocketCat;

import com.monsterlin.PocketCat.domain.PcCampusJob;
import com.monsterlin.PocketCat.mail.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 邮箱服务测试
 * @date : 2018/2/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("876948462@qq.com","test simple mail"," hello this is simple mail");
    }

    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("876948462@qq.com","test simple mail",content);
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath="e:\\tmp\\application.log";
        mailService.sendAttachmentsMail("876948462@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }


    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:\\Users\\summer\\Pictures\\favicon.png";

        mailService.sendInlineResourceMail("876948462@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }


    @Test
    public void sendTemplateMail() {
        //创建邮件正文

        PcCampusJob pcCampusJob = new PcCampusJob("大学生勤工俭学岗位征集","打扫卫生","15元/小时","济南","monsterlin",1,1519625133,1519625133,1519625133,1519625133);
        Context context = new Context();
        context.setVariable("pcCampusJob", pcCampusJob);
        String emailContent = templateEngine.process("emailTemplate", context);

        mailService.sendHtmlMail("876948462@qq.com","主题：这是模板邮件",emailContent);
    }

}
