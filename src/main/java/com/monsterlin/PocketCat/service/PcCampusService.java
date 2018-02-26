package com.monsterlin.PocketCat.service;

import com.monsterlin.PocketCat.domain.PcCampusJob;

import java.util.List;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 校内兼职业务类
 * @date : 2018/2/26
 */
public interface PcCampusService {

    int insertPcCampus(PcCampusJob pcCampusJob);

    int deletePcCampus(int jid);

    int updatePcCampus(PcCampusJob pcCampusJob);

    List<PcCampusJob> getPcCampusByPage(int state,int pageNum, int pageSize);

    PcCampusJob getPcCampusJobByJid ( int jid );
}
