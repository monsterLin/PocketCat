package com.monsterlin.PocketCat;


import com.monsterlin.PocketCat.domain.PcNotice;
import com.monsterlin.PocketCat.service.PcNoticeService;
import com.monsterlin.PocketCat.utils.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 公告单元测试
 * @date : 2018/1/1
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PcNoticeTest {
    @Resource
    PcNoticeService pcNoticeService;

    @Test
    public void testInsert() {
        long nowStamp = TimeUtil.getNowTimeStamp();

        for (int i = 0 ; i < 3 ;i++){
            PcNotice pcNotice = new PcNotice("测试标题"+i, "测试标题"+i, "monsterlin", nowStamp, nowStamp);
            int result = pcNoticeService.insertPcNotice(pcNotice);
            System.out.println("影响的行数：" + result);
        }


    }

    @Test
    public void testSelect() {
        List<PcNotice> list = pcNoticeService.getPcNoticeByPage(1, 10);
        for (PcNotice pcNotice : list) {
            System.out.println(pcNotice.getAuthor() + ":" + pcNotice.getTitle());
        }
    }

    @Test
    public void testDelete() {
        int result = pcNoticeService.deletePcNotice(3);
        System.out.println("影响的行数：" + result);
    }

    @Test
    public void testUpdate() {
        PcNotice pcNotice = pcNoticeService.getPcNoticeByNid(2);
        pcNotice.setTitle("更改后的标题");
        int result = pcNoticeService.updatePcNotice(pcNotice);
        System.out.println("影响的行数：" + result);
    }
}
