package com.monsterlin.PocketCat.service.impl;

import com.monsterlin.PocketCat.dao.PcCampusDao;
import com.monsterlin.PocketCat.domain.PcCampusJob;
import com.monsterlin.PocketCat.service.PcCampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 校内兼职业务实现类
 * @date : 2018/2/26
 */

@Service
public class PcCampusServiceImpl implements PcCampusService {

    @Autowired
    private PcCampusDao pcCampusDao;

    @Override
    public int insertPcCampus(PcCampusJob pcCampusJob) {
        return pcCampusDao.insertPcCampusJob(pcCampusJob);
    }

    @Override
    public int deletePcCampus(int jid) {
        return pcCampusDao.deletePcCampusJob(jid);
    }

    @Override
    public int updatePcCampus(PcCampusJob pcCampusJob) {
        return pcCampusDao.updatePcCampusJob(pcCampusJob);
    }

    @Override
    public List<PcCampusJob> getPcCampusByPage(int state,int pageNum, int pageSize) {
        int start = (pageNum - 1) * pageSize;
        return pcCampusDao.getPcCampusJobByPage(state,start,pageSize);
    }

    @Override
    public PcCampusJob getPcCampusJobByJid(int jid) {
        return pcCampusDao.getPcCampusJobByJid(jid);
    }
}
