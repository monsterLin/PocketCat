package com.monsterlin.PocketCat.service.impl;

import com.monsterlin.PocketCat.dao.PcSocialJobsDao;
import com.monsterlin.PocketCat.domain.PcSocialJob;
import com.monsterlin.PocketCat.service.PcSocialJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 校外兼职业务实现类
 * @date : 2017/12/13
 */
@Service
public class PcSocialJobServiceImpl implements PcSocialJobService {

    @Autowired
    private PcSocialJobsDao pcSocialJobsDao;


    @Override
    public List<PcSocialJob> getAllPcSocialJob() {
        return pcSocialJobsDao.getAllPcSocialJob();
    }

    @Override
    public int insertPcSocialJob(PcSocialJob pcSocialJob) {
        return pcSocialJobsDao.insertPcSocialJob(pcSocialJob);
    }

    @Override
    public List<PcSocialJob> getPcSocialJobByPage(int pageNum, int pageSize) {
        int start = (pageNum-1)*pageSize;
        return  pcSocialJobsDao.getPcSocialJobByPage(start,pageSize);
    }

    @Override
    public int deletePcSocialJob(int jid) {
        return pcSocialJobsDao.deletePcSocialJob(jid);
    }

}
