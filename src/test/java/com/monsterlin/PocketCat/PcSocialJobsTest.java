package com.monsterlin.PocketCat;

import com.monsterlin.PocketCat.dao.PcSocialJobsDao;
import com.monsterlin.PocketCat.domain.PcSocialJob;
import com.monsterlin.PocketCat.grab.GrabSocialJobs;
import com.monsterlin.PocketCat.service.PcSocialJobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc :
 * @date : 2017/12/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PcSocialJobsTest {

    @Autowired
    private PcSocialJobsDao pcSocialJobsDao;

    @Resource
    private PcSocialJobService pcSocialJobService;



    @Test
    public void testInsert() throws Exception {

        List<PcSocialJob> pcSocialJobList = GrabSocialJobs.grabTopPartJobs();

        for (PcSocialJob pcSocialJob : pcSocialJobList) {
            pcSocialJobsDao.insertPcSocialJob(pcSocialJob);
        }
    }

    @Test
    public void testSelect() throws Exception {
        List<PcSocialJob> pcSocialJobList = pcSocialJobService.getPcSocialJobByPage(1, 10);

        for (PcSocialJob pcSocialJob : pcSocialJobList) {
            System.out.println(pcSocialJob.getTitle());
        }
    }



}
