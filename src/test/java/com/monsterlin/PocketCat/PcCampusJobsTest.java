package com.monsterlin.PocketCat;

import com.monsterlin.PocketCat.domain.PcCampusJob;
import com.monsterlin.PocketCat.service.PcCampusService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 单元测试
 * @date : 2018/2/26
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PcCampusJobsTest {
    @Autowired
    public PcCampusService pcCampusService;

    @Test
    public void testInsert(){
        PcCampusJob pcCampusJob = new PcCampusJob("标题3","内容3","15","济南","monsterlin",1,1519625133,1519625199,1519625133,1519625199);

        int result = pcCampusService.insertPcCampus(pcCampusJob);

        System.out.println("受影响的行数："+result);
    }

    @Test
    public void testDelete(){
       int result =  pcCampusService.deletePcCampus(3);

        System.out.println("受影响的行数："+result);
    }

    @Test
    public void testSelect(){
        List<PcCampusJob> pcCampusJobs = pcCampusService.getPcCampusByPage(1,10);

        for(int i = 0 ; i < pcCampusJobs.size();i++){
            System.out.println(pcCampusJobs.get(i).getTitle());
        }
    }

    @Test
    public void testUpdate(){
        PcCampusJob pcCampusJob = pcCampusService.getPcCampusJobByJid(2);

        pcCampusJob.setTitle("更新后的标题");
        int result =  pcCampusService.updatePcCampus(pcCampusJob);
        System.out.println("受影响的行数："+result);

    }


}
