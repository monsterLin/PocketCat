package com.monsterlin.PocketCat.service;

import com.monsterlin.PocketCat.domain.PcSocialJob;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 校外兼职业务类
 * @date : 2017/12/13
 */
public interface PcSocialJobService {

    /**
     * 查询所有的数据
     *
     * @return
     */
    List<PcSocialJob> getAllPcSocialJob();


    /**
     * 插入数据
     *
     * @param pcSocialJob
     * @return
     */
    int insertPcSocialJob(PcSocialJob pcSocialJob);

    /**
     * 分页查询数量
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PcSocialJob> getPcSocialJobByPage(int pageNum, int pageSize);

    /**
     * 删除数据
     * @param token
     * @return
     */
    int deletePcSocialJob(int jid, String token);
}
