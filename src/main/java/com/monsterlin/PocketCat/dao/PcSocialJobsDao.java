package com.monsterlin.PocketCat.dao;

import com.monsterlin.PocketCat.domain.PcSocialJob;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 校外兼职
 * @date : 2017/12/13
 */
@Mapper
public interface PcSocialJobsDao {

    /**
     * 添加数据
     * @param pcSocialJob
     * @return
     */
    @Insert("INSERT INTO pc_social_jobs(title,place,time,price,source,detailUrl,state,created)" +
            "VALUES(#{title},#{place},#{time},#{price},#{source},#{detailUrl},#{state},#{created})")
    int insertPcSocialJob(PcSocialJob pcSocialJob);


    /**
     * 查询所有数据
     * @return
     */
    @Select("SELECT * FROM pc_social_jobs")
    List<PcSocialJob> getAllPcSocialJob();

    /**
     * 分页查询数据
     * @param start
     * @param pageSize
     * @return
     */
    @Select("SELECT * FROM pc_social_jobs  where state = #{state} LIMIT #{start},#{pageSize}")
    List<PcSocialJob> getPcSocialJobByPage(@Param("state") int state , @Param("start") int start, @Param("pageSize") int pageSize);


    /**
     * 删除兼职
     * @param jid
     * @return
     */
    @Delete("DELETE FROM pc_social_jobs where jid = #{jid}")
    int deletePcSocialJob(@Param("jid") int jid);


    /**
     * 根据id查询兼职
     * @param jid
     * @return
     */
    @Select("SELECT * FROM pc_social_jobs where jid = #{jid}")
    PcSocialJob getPcSocialJobByJid ( int jid );


}
