package com.monsterlin.PocketCat.service;

import com.monsterlin.PocketCat.domain.PcNotice;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 公告业务接口
 * @date : 2018/1/1
 */
public interface PcNoticeService {
    /**
     * 添加公告
     * @param pcNotice
     * @return
     */
    int insertPcNotice(PcNotice pcNotice);

    /**
     * 删除公告
     * @param nid
     * @param token
     * @return
     */
    int deletePcNotice(int nid, String token);

    /**
     * 更新公告
     * @param pcNotice
     * @return
     */
    int updatePcNotice(PcNotice pcNotice);

    /**
     * 分页查询公告
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PcNotice> getPcNoticeByPage(int pageNum, int pageSize);
}
