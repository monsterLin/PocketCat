package com.monsterlin.PocketCat.service.impl;

import com.monsterlin.PocketCat.dao.PcNoticeDao;
import com.monsterlin.PocketCat.domain.PcNotice;
import com.monsterlin.PocketCat.service.PcNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 公告业务接口实现
 * @date : 2018/1/1
 */
@Service
public class PcNoticeServiceImpl implements PcNoticeService {

    @Autowired
    private PcNoticeDao pcNoticeDao;

    @Override
    public int insertPcNotice(PcNotice pcNotice) {
        return pcNoticeDao.insertPcNotice(pcNotice);
    }

    @Override
    public int deletePcNotice(int nid) {
        return pcNoticeDao.deletePcNotice(nid);
    }

    @Override
    public int updatePcNotice(PcNotice pcNotice) {
        return pcNoticeDao.updatePcNotice(pcNotice);
    }

    @Override
    public List<PcNotice> getPcNoticeByPage(int pageNum, int pageSize) {
        int start = (pageNum - 1) * pageSize;
        return pcNoticeDao.getPcNoticeByPage(start, pageSize);
    }

    @Override
    public PcNotice getPcNoticeByNid(int nid) {
        return pcNoticeDao.getPcNoticeByNid(nid);
    }
}
