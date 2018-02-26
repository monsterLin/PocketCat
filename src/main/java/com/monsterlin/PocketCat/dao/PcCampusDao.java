package com.monsterlin.PocketCat.dao;

import com.monsterlin.PocketCat.domain.PcCampusJob;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author : monsterlin
 * @blog :  https://monsterlin.com
 * @github : https://github.com/monsterlin
 * @desc : 校内兼职
 * @date : 2018/2/26
 */
@Mapper
public interface PcCampusDao {
    @Insert("INSERT INTO pc_campus_jobs(title,content,price,place,author,state,beginTime,endTime,createTime,updateTime)" +
            "VALUES(#{title},#{content},#{price},#{place},#{author},#{state},#{beginTime},#{endTime},#{createTime},#{updateTime})")
    int insertPcCampusJob(PcCampusJob pcCampusJob);

    @Delete("DELETE FROM pc_campus_jobs where jid = #{jid}")
    int deletePcCampusJob(@Param("jid") int jid);

    @Update("UPDATE pc_campus_jobs set title=#{title},content=#{content}," +
            "price=#{price},place=#{place},author=#{author}," +
            "state=#{state},beginTime=#{beginTime},endTime=#{endTime}," +
            "createTime=#{createTime},updateTime=#{updateTime} " +
            "WHERE jid = #{jid}")
    int updatePcCampusJob(PcCampusJob pcCampusJob);

    @Select("SELECT * FROM pc_campus_jobs  where state = #{state} LIMIT #{start},#{pageSize}")
    List<PcCampusJob> getPcCampusJobByPage(@Param("state") int state , @Param("start") int start, @Param("pageSize") int pageSize);

    @Select("SELECT * FROM pc_campus_jobs where jid = #{jid}")
    PcCampusJob getPcCampusJobByJid ( int jid );

}
